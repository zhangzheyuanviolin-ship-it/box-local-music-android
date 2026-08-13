            package p000;

            import android.util.Log;
            import java.io.File;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.nio.channels.FileChannel;
            import java.util.HashMap;
            import java.util.concurrent.locks.Lock;
            
            public final class OOIlilIiil {
                public static final HashMap I0000oI00 = new HashMap();
                public boolean I00000oIO;
                public File I00000oOI;
                public Lock I0000Il00O;
                public FileChannel I0000O;

                public final void I00000oIO(boolean z) throws IOException {
/* 3 */             this.I0000Il00O.lock();
/* 6 */             if (z) {
/* 8 */                 File file = this.I00000oOI;
                        try {
/* 10 */                    if (file == null) {
/* 46 */                        throw new IOException("No lock directory was provided.");
                            }
/* 12 */                    File parentFile = file.getParentFile();
/* 16 */                    if (parentFile != null) {
/* 18 */                        parentFile.mkdirs();
                            }
/* 29 */                    FileChannel channel = new FileOutputStream(file).getChannel();
/* 33 */                    channel.lock();
/* 36 */                    this.I0000O = channel;
                        } catch (IOException e) {
/* 48 */                    this.I0000O = null;
/* 54 */                    Log.w("SupportSQLiteLock", "Unable to grab file lock.", e);
                        }
                    }
                }

                public final void I00000oOI() throws IOException {
                    try {
/* 1 */                 FileChannel fileChannel = this.I0000O;
/* 3 */                 if (fileChannel != null) {
/* 5 */                     fileChannel.close();
                        }
                    } catch (IOException unused) {
                    }
/* 10 */            this.I0000Il00O.unlock();
                }
            }
