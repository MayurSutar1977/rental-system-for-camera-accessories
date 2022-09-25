import React, { useEffect, useState } from 'react'
import { useParams } from 'react-router-dom';
import styled from "styled-components"
import { mobile } from "../responsive";
import userServices from '../services/user-service';

const Container = styled.div`
    width: 100vw;
    height: 100vh;
    display: flex;
    position: relative;
    overflow: hidden;
`
const Wrapper = styled.div`
    height: 100%;
    width: 100%;
    display: flex;
    /* transform: translate(${props=>props.slideIndex * -100}vw);
    transition: all 1.5s ease; */
`
const Menu = styled.div`
    height: 80%;
    flex:2;
    /* width: 20%; */
    display: flex;
    flex-direction:column;
    align-items: center;
    justify-content: center;
    padding: 20px;
    /* border :solid black; */
    background-color : lightblue;
`
const MenuItem = styled.div`
    font-size: 14px ;
    cursor: pointer;
    margin-left: 20px ;
    padding : 10px;
    display: flex;
    align-items: center;
    ${mobile({ fontSize: "12px", marginLeft: "10px" })}
`
const Profile = styled.div`
    /* width: 80%; */
    flex:8;
    padding: 20px;
    /* border :solid black; */
`
const PersonalInfo = styled.div`
    display: flex;
    flex-direction:column;
    align-items: left;
    justify-content: center;
`
const Image = styled.img`
    height: 140px;
    width: 140px;
`
const Name = styled.h1`
    font-size: 24px;
    margin-top: 10px;
`
const Info = styled.div`
    margin-top: 20px;
    font-size: 20px;
    font-weight: 500;
    letter-spacing: 3px;
`
const List = styled.ul`
  margin: 0;
  padding: 0;
  list-style: none;
  display: flex;
  /* flex-wrap: wrap; */
  font-size: 14px ;
`;

const ListItem = styled.li`
  width: 50%;
  margin-bottom: 10px;
`;
const Address = styled.div`
    margin-top: 20px;
    font-size: 20px;
    font-weight: 500;
    letter-spacing: 3px;
    /* border:solid black; */
`
const BookingDetails = styled.div`
margin-top: 20px;
font-size: 20px;
font-weight: 500;
letter-spacing: 3px;
background-color: transparent;
cursor: pointer;
   
`

const ViewUserProfile = () => {
    
  let { id } = useParams();

  const [userProfil, setUserProfil] = useState([]);
 
  const init = () => {
    userServices.getProfile(parseInt(id))
    .then(response => {
      console.log('Printing user data', response.data.result);
      setUserProfil(response.data.result);
    })
    .catch(error => {
      console.log('Something went wrong', error);
    }) 
  }

  useEffect(() => {
    init();
  }, []);

  return (
    <Container>
        <Wrapper>
        <Menu>
            <MenuItem>UPDATE PROFILE</MenuItem>
            <MenuItem>UPDATE ADDRESS</MenuItem>
            <MenuItem>UPDATE PASSWORD</MenuItem>
            <MenuItem>ORDER HISTORY</MenuItem>
            <MenuItem>SIGN OUT</MenuItem>
        </Menu>
        <Profile>
            <PersonalInfo>
                <Image src={userProfil.profileImage} alt="image not found"></Image>
                <Name>USER NAME</Name>
                <Info>PERSONAL INFO
                    <List>
                        <ListItem>first name:{userProfil.firstName}</ListItem>
                        <ListItem>last name:{userProfil.lastName}</ListItem>
                        <ListItem>email:{userProfil.email}</ListItem>
                    </List>
                </Info>
            </PersonalInfo>
            <Address>ADDRESS
                <List>
                    <ListItem>HOME</ListItem>
                    <ListItem>city</ListItem>
                    <ListItem>state</ListItem>
                    <ListItem>HOME</ListItem>
                    <ListItem>city</ListItem>
                    <ListItem>state</ListItem>
                </List>
            </Address>
            <BookingDetails>BOOKING DETAILS
                <List>
                    <ListItem>HOME</ListItem>
                    <ListItem>city</ListItem>
                    <ListItem>state</ListItem>
                    <ListItem>HOME</ListItem>
                    <ListItem>city</ListItem>
                    <ListItem>state</ListItem>
                </List>
            </BookingDetails>
        </Profile>
        </Wrapper>
    </Container>
  )
}

export default ViewUserProfile