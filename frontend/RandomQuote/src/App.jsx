import React, { useState } from 'react';
import {
    Flex,
    Stack,
    Button,
    Heading,
    Text,
    useColorModeValue,
    CardFooter,
    CardBody,
    Card, Divider
} from '@chakra-ui/react'
import axios from "axios";


function App() {

    const [ quote, setQuote ] = useState("Click \"Get Quote\" button for a random quote");

    const fetchQuoteData = async () => {
        getQuote().then(res => {
            setQuote(res.data)
        }).catch(err => {
            console.log(err)
        });
    };

    const getQuote = async () => {
        try {
            return await axios.get(`${import.meta.env.VITE_API_BASE_URL}/api/v1/RandomQuote`);
        } catch (e) {
            throw e;
        }
    }


    return (
        <div>
            <Flex
                minH={'100vh'}
                align={'center'}
                justify={'center'}
                bg={useColorModeValue('gray.50', 'gray.800')}>
                <Stack spacing={8} mx={'auto'} maxW={'lg'}>
                    <Stack align={'center'}>
                        <Heading fontSize={'4xl'} textAlign={'center'}>
                            RandomQuote
                        </Heading>
                        <Text fontSize={'lg'} color={'gray.600'}>
                            Made by Zhenyuan️
                        </Text>
                    </Stack>
                    <Card minH={'30vh'} minW={'64vh'} align='center'>
                        <CardBody>
                            <Text fontSize='xl'>{quote.quoteText}</Text>
                            <Divider pb={10} orientation='horizontal' />
                            <Text as='i'>-- {quote.quoteAuthor}</Text>
                        </CardBody>
                        <CardFooter>
                            <Button colorScheme='teal' onClick={ fetchQuoteData }>Get Quote</Button>
                        </CardFooter>
                    </Card>
                </Stack>
            </Flex>
        </div>
    );
}

export default App;