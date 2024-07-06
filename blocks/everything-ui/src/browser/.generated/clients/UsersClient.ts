//
// GENERATED SOURCE - DO NOT EDIT
//

import { useMemo } from 'react';
import { RestClient } from '@kapeta/sdk-web-rest-client';
import { RestClientRequest } from '@kapeta/sdk-rest';
import { Token } from '../../../.generated/entities/Token';
import { UserRegistration } from '../../../.generated/entities/UserRegistration';
import { User } from '../../../.generated/entities/User';
import { UserAuthPassword } from '../../../.generated/entities/UserAuthPassword';
import { TokenWithPassword } from '../../../.generated/entities/TokenWithPassword';

export type ConfigureUsersClient = (client: UsersClient) => UsersClient;

/**
 * Creates a new UsersClient for React components.
 * The client is configured with the provided configuration function.
 *
 * It is wrapped in a useMemo hook to ensure that the client is only created once.
 */
export const useUsersClient = (configure?: ConfigureUsersClient): UsersClient => {
    return useMemo(() => {
        const client = new UsersClient();
        if (configure) {
            return configure(client);
        }
        return client;
    }, [configure]);
};

/**
 * A client for the Users API.
 * Use the useUsersClient hook to create a client in React.
 *
 * Use the UsersClient directly in other contexts.
 */
export class UsersClient extends RestClient {
    constructor() {
        super('api/rest/users');
    }

    /**
     * HTTP: POST /api/rest/users/users/register
     */
    async registerUser(payload: UserRegistration): Promise<Token | null> {
        const _result = await this.$execute<Token>('POST', '/users/register', [
            { name: 'payload', value: payload, transport: 'BODY', typeName: 'UserRegistration' },
        ]);

        if (_result === null) {
            return null;
        }
        return _result as Token;
    }

    /**
     * Throws if service responds with a status code higher than 399 and not 404.
     * For 404 responses, null is returned.
     *
     * HTTP: POST /api/rest/users/users/register
     */
    registerUserRequest(payload: UserRegistration): RestClientRequest<Token | null> {
        return this.$create<Token>('POST', '/users/register', [
            { name: 'payload', value: payload, transport: 'BODY', typeName: 'UserRegistration' },
        ]);
    }

    /**
     * HTTP: POST /api/rest/users/users/activate
     */
    async activateUser(token: Token): Promise<User | null> {
        const _result = await this.$execute<User>('POST', '/users/activate', [
            { name: 'token', value: token, transport: 'BODY', typeName: 'Token' },
        ]);

        if (_result === null) {
            return null;
        }
        return _result as User;
    }

    /**
     * Throws if service responds with a status code higher than 399 and not 404.
     * For 404 responses, null is returned.
     *
     * HTTP: POST /api/rest/users/users/activate
     */
    activateUserRequest(token: Token): RestClientRequest<User | null> {
        return this.$create<User>('POST', '/users/activate', [
            { name: 'token', value: token, transport: 'BODY', typeName: 'Token' },
        ]);
    }

    /**
     * HTTP: POST /api/rest/users/users/authenticate
     */
    async authenticate(auth: UserAuthPassword): Promise<Token | null> {
        const _result = await this.$execute<Token>('POST', '/users/authenticate', [
            { name: 'auth', value: auth, transport: 'BODY', typeName: 'UserAuthPassword' },
        ]);

        if (_result === null) {
            return null;
        }
        return _result as Token;
    }

    /**
     * Throws if service responds with a status code higher than 399 and not 404.
     * For 404 responses, null is returned.
     *
     * HTTP: POST /api/rest/users/users/authenticate
     */
    authenticateRequest(auth: UserAuthPassword): RestClientRequest<Token | null> {
        return this.$create<Token>('POST', '/users/authenticate', [
            { name: 'auth', value: auth, transport: 'BODY', typeName: 'UserAuthPassword' },
        ]);
    }

    /**
     * HTTP: POST /api/rest/users/users/recover-password
     */
    async recoverPassword(email: string): Promise<Token | null> {
        const _result = await this.$execute<Token>('POST', '/users/recover-password', [
            { name: 'email', value: email, transport: 'QUERY', typeName: 'string' },
        ]);

        if (_result === null) {
            return null;
        }
        return _result as Token;
    }

    /**
     * Throws if service responds with a status code higher than 399 and not 404.
     * For 404 responses, null is returned.
     *
     * HTTP: POST /api/rest/users/users/recover-password
     */
    recoverPasswordRequest(email: string): RestClientRequest<Token | null> {
        return this.$create<Token>('POST', '/users/recover-password', [
            { name: 'email', value: email, transport: 'QUERY', typeName: 'string' },
        ]);
    }

    /**
     * HTTP: POST /api/rest/users/users/recover-password/apply
     */
    async applyNewPassword(token: TokenWithPassword): Promise<void> {
        await this.$execute<void>('POST', '/users/recover-password/apply', [
            { name: 'token', value: token, transport: 'BODY', typeName: 'TokenWithPassword' },
        ]);
    }

    /**
     * Throws if service responds with a status code higher than 399 and not 404.
     * For 404 responses, null is returned.
     *
     * HTTP: POST /api/rest/users/users/recover-password/apply
     */
    applyNewPasswordRequest(token: TokenWithPassword): RestClientRequest<void> {
        return this.$create<void>('POST', '/users/recover-password/apply', [
            { name: 'token', value: token, transport: 'BODY', typeName: 'TokenWithPassword' },
        ]);
    }

    /**
     * HTTP: GET /api/rest/users/users/me
     */
    async getCurrentUser(): Promise<User | null> {
        const _result = await this.$execute<User>('GET', '/users/me', []);

        if (_result === null) {
            return null;
        }
        return _result as User;
    }

    /**
     * Throws if service responds with a status code higher than 399 and not 404.
     * For 404 responses, null is returned.
     *
     * HTTP: GET /api/rest/users/users/me
     */
    getCurrentUserRequest(): RestClientRequest<User | null> {
        return this.$create<User>('GET', '/users/me', []);
    }

    /**
     * HTTP: POST /api/rest/users/users/me
     */
    async updateCurrentUser(user: User): Promise<User | null> {
        const _result = await this.$execute<User>('POST', '/users/me', [
            { name: 'user', value: user, transport: 'BODY', typeName: 'User' },
        ]);

        if (_result === null) {
            return null;
        }
        return _result as User;
    }

    /**
     * Throws if service responds with a status code higher than 399 and not 404.
     * For 404 responses, null is returned.
     *
     * HTTP: POST /api/rest/users/users/me
     */
    updateCurrentUserRequest(user: User): RestClientRequest<User | null> {
        return this.$create<User>('POST', '/users/me', [
            { name: 'user', value: user, transport: 'BODY', typeName: 'User' },
        ]);
    }
}
