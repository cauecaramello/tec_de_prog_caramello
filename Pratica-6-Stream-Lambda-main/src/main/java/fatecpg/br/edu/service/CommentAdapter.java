package fatecpg.br.edu.service;
import com.google.gson.*;
import java.lang.reflect.Type;

public class CommentAdapter implements JsonDeserializer<Comment>, JsonSerializer<Comment> {
    @Override
    public Comment deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        return new Comment(
            jsonObject.get("postId").getAsInt(),
            jsonObject.get("id").getAsInt(),
            jsonObject.get("name").getAsString(),
            jsonObject.get("email").getAsString(),
            jsonObject.get("body").getAsString()
        );
    }

    @Override
    public JsonElement serialize(Comment comment, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("postId", comment.postId());
        jsonObject.addProperty("id", comment.id());
        jsonObject.addProperty("name", comment.name());
        jsonObject.addProperty("email", comment.email());
        jsonObject.addProperty("body", comment.body());
        return jsonObject;
    }
}

