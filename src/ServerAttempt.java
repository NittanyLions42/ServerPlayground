import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerAttempt {

    ServerAttempt() throws IOException {
        ServerSocket serverSocket;
        try
        {
            serverSocket = new ServerSocket(4444);
        }
        catch (IOException ioException)
        {
            throw new IOException("Error: " + ioException);
        }

        Socket socket = serverSocket.accept();
        //InputStream input
    }
}
