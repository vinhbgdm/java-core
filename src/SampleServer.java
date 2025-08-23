import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SampleServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(4953);
        System.out.println("Server đang chờ kết nối...");

        Socket socket = serverSocket.accept();
        System.out.println("Client đã kết nối.");

        // Nhận dữ liệu từ client
        InputStream input = socket.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        String message = reader.readLine();
        System.out.println("Message từ client: " + message);

        // Gửi phẩn hồi đến client
        OutputStream output = socket.getOutputStream();
        PrintWriter writer = new PrintWriter(output, true);
        writer.println("Xin chào từ server!");

        socket.close();
        serverSocket.close();
    }
}
