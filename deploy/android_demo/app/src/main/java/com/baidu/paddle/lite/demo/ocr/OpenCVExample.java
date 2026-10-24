import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class OpenCVExample {
    static {
        System.loadLibrary("opencv_java4"); // Load OpenCV
    }

    public static void main(String[] args) {
        Mat image = Imgcodecs.imread("path/to/image.jpg");
        if (image.empty()) {
            System.out.println("Could not read the image.");
            return;
        }

        Mat gray = new Mat();
        Imgproc.cvtColor(image, gray, Imgproc.COLOR_BGR2GRAY);
        Imgcodecs.imwrite("path/to/output.jpg", gray);

        System.out.println("Converted image to grayscale.");
    }
}
