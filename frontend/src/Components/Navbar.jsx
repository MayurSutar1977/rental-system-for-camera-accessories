import ShoppingCartOutlinedIcon from '@mui/icons-material/ShoppingCartOutlined';
import Badge from '@mui/material/Badge';
import SearchOutlinedIcon from '@mui/icons-material/SearchOutlined';
import LocationOnOutlinedIcon from '@mui/icons-material/LocationOnOutlined';

import React from "react";
import styled from "styled-components";
import { mobile } from "../responsive";


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
    ${mobile({ width: "50px" })}
`

const Center = styled.div`
    flex: 1;
    text-align: center;
`
const Logo = styled.h1`
    font-weight: bold;
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
  return (
    <Container>
        <Wrapper>
            <Left>
                <Language>EN</Language>
                <SearchContainer>
                    <Input></Input>
                    <SearchOutlinedIcon style={{color:"gray",fontSize:16}}></SearchOutlinedIcon>  
                </SearchContainer>  
            </Left>
            <Center>
                <Logo>RSFCA.</Logo>
            </Center>
            <Right>
                <MenuItem>
                    <LocationOnOutlinedIcon style={{color:"gray",fontSize:16}}></LocationOnOutlinedIcon>
                    &nbsp; DELHI
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
                <MenuItem>REGISTER</MenuItem>
                <MenuItem>SIGN IN</MenuItem>
                <MenuItem>
                    <Badge badgeContent={1} color="secondary">
                        <ShoppingCartOutlinedIcon color="action" />
                    </Badge>
                </MenuItem>
            </Right>
        </Wrapper>
    </Container>
  )
}

export default Navbar