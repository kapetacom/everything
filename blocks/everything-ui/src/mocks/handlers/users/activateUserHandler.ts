import { http, passthrough } from 'msw';

/**
 * HTTP: POST /api/rest/users/users/activate
 * Response type: User
 */
export const Users_activateUserHandler = http.post(
    '*/api/rest/users/users/activate',

    () => {
        // TODO: Return a response of type User
        return passthrough();
    }
);
