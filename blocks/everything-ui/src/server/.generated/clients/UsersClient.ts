//
// GENERATED SOURCE - DO NOT EDIT
//
import { RestClient } from '@kapeta/sdk-rest-client';
import { RestClientRequest } from '@kapeta/sdk-rest';
import { ConfigProvider } from '@kapeta/sdk-config';
import { Token } from '../../../.generated/entities/Token';
import { UserRegistration } from '../../../.generated/entities/UserRegistration';
import { User } from '../../../.generated/entities/User';
import { UserAuthPassword } from '../../../.generated/entities/UserAuthPassword';
import { TokenWithPassword } from '../../../.generated/entities/TokenWithPassword';

/**
 * Creates a new ready UsersClient.
 *
 * See https://github.com/kapetacom/sdk-nodejs-rest-client for more information.
 */
export async function createUsersClient(configProvider: ConfigProvider): Promise<UsersClient> {
    return new UsersClient(false).$withConfigProvider(configProvider);
}

/**
 * A client for the Users API.
 *
 * Note that this client is not ready to use until it is configured with a ```ConfigProvider```.
 * This happens automatically when using the ```createUsersClient``` function or
 * setting ```autoInit``` to true (the default).
 *
 * If you want to configure the client manually, set autoInit to false and call ```$withConfigProvider```.
 *
 * Recommended method is using ```createUsersClient(configProvider:ConfigProvider)```;
 *
 * See https://github.com/kapetacom/sdk-nodejs-rest-client for more information.
 */
export class UsersClient extends RestClient {
    constructor(autoInit: boolean = true) {
        super('users', autoInit);
    }

    /**
     *
     *
     * Throws if service responds with a status code higher than 399 and not 404.
     * For 404 responses, null is returned.
     *
     * HTTP: POST /users/register
     */
    async registerUser(payload: UserRegistration): Promise<Token | null> {
        const _result = await this.$execute('POST', '/users/register', [
            { name: 'payload', value: payload, transport: 'BODY', typeName: 'UserRegistration' },
        ]);

        if (_result === null) {
            return null;
        }
        return _result as Token;
    }

    /**
     *
     *
     * Creates a request that can be manipulated before sending it with the ```call()``` method.
     *
     * HTTP: POST /users/register
     */
    registerUserRequest(payload: UserRegistration): RestClientRequest<Token | null> {
        return this.$create('POST', '/users/register', [
            { name: 'payload', value: payload, transport: 'BODY', typeName: 'UserRegistration' },
        ]);
    }

    /**
     *
     *
     * Throws if service responds with a status code higher than 399 and not 404.
     * For 404 responses, null is returned.
     *
     * HTTP: POST /users/activate
     */
    async activateUser(token: Token): Promise<User | null> {
        const _result = await this.$execute('POST', '/users/activate', [
            { name: 'token', value: token, transport: 'BODY', typeName: 'Token' },
        ]);

        if (_result === null) {
            return null;
        }
        return _result as User;
    }

    /**
     *
     *
     * Creates a request that can be manipulated before sending it with the ```call()``` method.
     *
     * HTTP: POST /users/activate
     */
    activateUserRequest(token: Token): RestClientRequest<User | null> {
        return this.$create('POST', '/users/activate', [
            { name: 'token', value: token, transport: 'BODY', typeName: 'Token' },
        ]);
    }

    /**
     *
     *
     * Throws if service responds with a status code higher than 399 and not 404.
     * For 404 responses, null is returned.
     *
     * HTTP: POST /users/authenticate
     */
    async authenticate(auth: UserAuthPassword): Promise<Token | null> {
        const _result = await this.$execute('POST', '/users/authenticate', [
            { name: 'auth', value: auth, transport: 'BODY', typeName: 'UserAuthPassword' },
        ]);

        if (_result === null) {
            return null;
        }
        return _result as Token;
    }

    /**
     *
     *
     * Creates a request that can be manipulated before sending it with the ```call()``` method.
     *
     * HTTP: POST /users/authenticate
     */
    authenticateRequest(auth: UserAuthPassword): RestClientRequest<Token | null> {
        return this.$create('POST', '/users/authenticate', [
            { name: 'auth', value: auth, transport: 'BODY', typeName: 'UserAuthPassword' },
        ]);
    }

    /**
     *
     *
     * Throws if service responds with a status code higher than 399 and not 404.
     * For 404 responses, null is returned.
     *
     * HTTP: POST /users/recover-password
     */
    async recoverPassword(email: string): Promise<Token | null> {
        const _result = await this.$execute('POST', '/users/recover-password', [
            { name: 'email', value: email, transport: 'QUERY', typeName: 'string' },
        ]);

        if (_result === null) {
            return null;
        }
        return _result as Token;
    }

    /**
     *
     *
     * Creates a request that can be manipulated before sending it with the ```call()``` method.
     *
     * HTTP: POST /users/recover-password
     */
    recoverPasswordRequest(email: string): RestClientRequest<Token | null> {
        return this.$create('POST', '/users/recover-password', [
            { name: 'email', value: email, transport: 'QUERY', typeName: 'string' },
        ]);
    }

    /**
     *
     *
     * Throws if service responds with a status code higher than 399 and not 404.
     * For 404 responses, null is returned.
     *
     * HTTP: POST /users/recover-password/apply
     */
    async applyNewPassword(token: TokenWithPassword): Promise<void> {
        await this.$execute('POST', '/users/recover-password/apply', [
            { name: 'token', value: token, transport: 'BODY', typeName: 'TokenWithPassword' },
        ]);
    }

    /**
     *
     *
     * Creates a request that can be manipulated before sending it with the ```call()``` method.
     *
     * HTTP: POST /users/recover-password/apply
     */
    applyNewPasswordRequest(token: TokenWithPassword): RestClientRequest<void> {
        return this.$create('POST', '/users/recover-password/apply', [
            { name: 'token', value: token, transport: 'BODY', typeName: 'TokenWithPassword' },
        ]);
    }

    /**
     *
     *
     * Throws if service responds with a status code higher than 399 and not 404.
     * For 404 responses, null is returned.
     *
     * HTTP: GET /users/me
     */
    async getCurrentUser(): Promise<User | null> {
        const _result = await this.$execute('GET', '/users/me', []);

        if (_result === null) {
            return null;
        }
        return _result as User;
    }

    /**
     *
     *
     * Creates a request that can be manipulated before sending it with the ```call()``` method.
     *
     * HTTP: GET /users/me
     */
    getCurrentUserRequest(): RestClientRequest<User | null> {
        return this.$create('GET', '/users/me', []);
    }

    /**
     *
     *
     * Throws if service responds with a status code higher than 399 and not 404.
     * For 404 responses, null is returned.
     *
     * HTTP: POST /users/me
     */
    async updateCurrentUser(user: User): Promise<User | null> {
        const _result = await this.$execute('POST', '/users/me', [
            { name: 'user', value: user, transport: 'BODY', typeName: 'User' },
        ]);

        if (_result === null) {
            return null;
        }
        return _result as User;
    }

    /**
     *
     *
     * Creates a request that can be manipulated before sending it with the ```call()``` method.
     *
     * HTTP: POST /users/me
     */
    updateCurrentUserRequest(user: User): RestClientRequest<User | null> {
        return this.$create('POST', '/users/me', [{ name: 'user', value: user, transport: 'BODY', typeName: 'User' }]);
    }
}
