package io.jaylee.function.springfunction.function;

import com.microsoft.azure.functions.*;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;
import io.jaylee.function.springfunction.model.User;
import org.springframework.cloud.function.adapter.azure.FunctionInvoker;

import java.util.Optional;

public class CreateUserFunctionHandler extends FunctionInvoker<User, String> {
    @FunctionName("createUserFunction")
    public HttpResponseMessage execute(
            @HttpTrigger(name = "request", methods = {HttpMethod.POST}, authLevel = AuthorizationLevel.ANONYMOUS) HttpRequestMessage<Optional<User>> request,
            ExecutionContext context) {
        Optional<User> user = request.getBody();

        user.ifPresent(u -> context.getLogger().info(u.toString()));
        context.getLogger().info(context.getFunctionName());

        return request
                .createResponseBuilder(HttpStatus.OK)
                .body(handleRequest(user.get(), context))
                .header("Content-Type", "application/json")
                .build();
    }
}
