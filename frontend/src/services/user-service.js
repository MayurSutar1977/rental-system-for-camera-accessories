import httpClient from '../http-common-users';

const getAll = () => {
  return httpClient.get('/fatch-all-user');
};

const create = (data) => {
  return httpClient.post('', data);
};

const get = (id) => {
  return httpClient.get(`/get_by_id/${id}`);
};

const getProfile = (id) => {
  return httpClient.get(`/user-profile/${id}`);
};

const update = (data) => {
  return httpClient.put('', data);
};

const remove = (id) => {
  return httpClient.delete(`/${id}`);
};

const userServices = { getAll, create, get, getProfile, update, remove }

export default userServices;