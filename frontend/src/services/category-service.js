import httpClient from '../http-common-categories';

const getAll = () => {
  return httpClient.get('/fetch-category');
};

const create = (data) => {
  return httpClient.post('', data);
};

const get = (id) => {
  return httpClient.get(`${id}`);
};

const update = (data) => {
  return httpClient.put('', data);
};

const remove = (id) => {
  return httpClient.delete(`/${id}`);
};

const categoryServices = { getAll, create, get, update, remove }

export default categoryServices;