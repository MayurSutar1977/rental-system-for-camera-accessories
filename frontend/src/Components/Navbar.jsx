import ShoppingCartOutlinedIcon from '@mui/icons-material/ShoppingCartOutlined';
import Badge from '@mui/material/Badge';
import SearchOutlinedIcon from '@mui/icons-material/SearchOutlined';
import LocationOnOutlinedIcon from '@mui/icons-material/LocationOnOutlined';

import React, { useState } from "react";
import styled from "styled-components";
import { mobile } from "../responsive";
import { useNavigate } from 'react-router-dom';
import categoryServices from '../services/category-service';


const Container = styled.div`
    height: 60px;
    ${mobile({ height: "50px" })}
`
const Wrapper = styled.div`
    padding: 10px 20px;
    display: flex;
    justify-content: space-between;
    align-items: center;
    ${mobile({ padding: "10px 0px" })}
`
const Left = styled.div`
   flex: 1;
   display: flex;
   align-items: center;
`
const Language = styled.div`
    font-size: 14px;
    cursor: pointer;
    ${mobile({ display: "none" })}
`
const SearchContainer = styled.div`
    border: 0.5px solid lightgrey ;
    display: flex;
    align-items: center;
    margin-left: 25px;
    padding: 5px ;
`
const Input = styled.input`
    border: none;
    text-align: center;
    ${mobile({ width: "50px" })}
`

const Center = styled.div`
    flex: 1;
    text-align: center;
`
const Logo = styled.h1`
    font-weight: bold;
    cursor: pointer;
    ${mobile({ fontSize: "24px" })}
`

const Right = styled.div`
    flex: 1;
    display: flex;
    align-items: center;
    justify-content: flex-end;
    ${mobile({ flex: 2, justifyContent: "center" })}
`
const MenuItem = styled.div`
    font-size: 14px ;
    cursor: pointer;
    margin-left: 15px ;
    display: flex;
    align-items: center;
    ${mobile({ fontSize: "12px", marginLeft: "10px" })}
`


const Navbar = () => {

    const [category, setCategory] = useState([]);
    let [catName , setCatName] = useState("");

    const navigate = useNavigate();

    const goTOSignupPage = () => {
        navigate("/sign_up");
    }

    const goTOHomePage = () => {
        navigate("/home");
    }

    const searchForCategory = () => {
        categoryServices.getByName(catName).then(response => {
            console.log('Printing product data', response.data.result);
            setCategory(response.data.result);
          })
          .catch(error => {
            console.log('Something went wrong', error);
          }) 
    }

  return (
    <Container>
        <Wrapper>
            <Left>
                <Language>EN</Language>
                <SearchContainer>
                    <Input placeholder='search for category'></Input>
                    &nbsp;
                    <SearchOutlinedIcon style={{color:"gray",fontSize:16,cursor: "pointer"}} onClick={searchForCategory}></SearchOutlinedIcon>  
                </SearchContainer>  
            </Left>
            <Center>
                <Logo onClick={goTOHomePage}>RSFCA.</Logo>
            </Center>
            <Right>
                <MenuItem>
                    {/* <LocationOnOutlinedIcon style={{color:"gray",fontSize:16}}></LocationOnOutlinedIcon>
                    &nbsp; DELHI */}
                    {/* <FormControl fullWidth>
                        <InputLabel id="demo-simple-select-label">Age</InputLabel>
                        <Select
                            labelId="demo-simple-select-label"
                            id="demo-simple-select"
                            // value={age}
                            label="Age"
                            // onChange={handleChange}
                        >
                            <MenuItem value={10}>Ten</MenuItem>
                            <MenuItem value={20}>Twenty</MenuItem>
                            <MenuItem value={30}>Thirty</MenuItem>
                        </Select>
                        </FormControl> */}
                </MenuItem>
                <MenuItem onClick={goTOSignupPage}>REGISTER</MenuItem>
                <MenuItem>SIGN IN</MenuItem>
                {/* <MenuItem>
                    <Badge badgeContent={1} color="secondary">
                        <ShoppingCartOutlinedIcon color="action" />
                    </Badge>
                </MenuItem> */}
            </Right>
        </Wrapper>
    </Container>
  )
}

export default Navbar