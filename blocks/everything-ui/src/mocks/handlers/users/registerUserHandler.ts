import { http, passthrough } from 'msw';

/**
 * HTTP: POST /api/rest/users/users/register
 * Response type: Token
 */
export const Users_registerUserHandler = http.post(
    '*/api/rest/users/users/register',

    () => {
        // TODO: Return a response of type Token
        return passthrough();
    }
);
