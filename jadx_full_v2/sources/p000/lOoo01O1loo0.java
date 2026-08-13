            package p000;

            import android.content.Context;
            import android.net.Uri;
            import android.os.ParcelFileDescriptor;
            import java.io.FileInputStream;
            import java.io.IOException;
            import java.nio.MappedByteBuffer;
            import java.nio.channels.FileChannel;
            
            public abstract class lOoo01O1loo0 {
                public static MappedByteBuffer I00000oIO(Context context, Uri uri) throws IOException {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
                    try {
/* 8 */                 parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
                    } catch (IOException unused) {
                    }
/* 12 */            if (parcelFileDescriptorOpenFileDescriptor == null) {
/* 14 */                if (parcelFileDescriptorOpenFileDescriptor != null) {
/* 16 */                    parcelFileDescriptorOpenFileDescriptor.close();
/* 5 */                     return null;
                        }
/* 5 */                 return null;
                    }
                    try {
/* 26 */                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                        try {
/* 29 */                    FileChannel channel = fileInputStream.getChannel();
/* 41 */                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
/* 45 */                    fileInputStream.close();
/* 48 */                    parcelFileDescriptorOpenFileDescriptor.close();
/* 51 */                    return map;
                        } finally {
                        }
                    } finally {
                    }
                }
            }
