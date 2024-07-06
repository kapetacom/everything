import { http, passthrough } from 'msw';

/**
 * HTTP: GET /api/rest/users/users/me
 * Response type: User
 */
export const Users_getCurrentUserHandler = http.get(
    '*/api/rest/users/users/me',

    () => {
        // TODO: Return a response of type User
        return passthrough();
    }
);
