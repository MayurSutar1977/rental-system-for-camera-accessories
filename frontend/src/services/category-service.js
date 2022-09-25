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

const getByName = (catName) => {
  return httpClient.get(`/find-category-by-name/${catName}`);
};

const update = (data) => {
  return httpClient.put('', data);
};

const remove = (id) => {
  return httpClient.delete(`/${id}`);
};

const categoryServices = { getAll, create, get, getByName ,update, remove }

export default categoryServices;