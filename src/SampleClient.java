import java.io.*;
import java.net.Socket;

public class SampleClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 4953);

        // Gửi dữu liệu đến server
        OutputStream output = socket.getOutputStream();
        PrintWriter writer = new PrintWriter(output, true);
        writer.println("Xin chào từ client!");

        // Nhận phẩn hồi từ server
        InputStream input = socket.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        String response = reader.readLine();
        System.out.println("Phản hồi từ server: " + response);

        socket.close();
    }
}
