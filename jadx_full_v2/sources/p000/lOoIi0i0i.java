            package p000;

            import android.util.Log;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.ByteArrayOutputStream;
            import java.io.File;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.io.OutputStream;
            import java.io.RandomAccessFile;
            import java.nio.charset.Charset;
            import java.util.Collection;
            import java.util.Iterator;
            
            public abstract class lOoIi0i0i {
                public static final boolean I00000oIO(File file, String str, String str2) {
                    try {
/* 1 */                 Charset charset = IO1IOI.I00000oIO;
/* 3 */                 byte[] bytes = str.getBytes(charset);
/* 7 */                 byte[] bytes2 = str2.getBytes(charset);
/* 13 */                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 18 */                byteArrayOutputStream.write(10);
/* 22 */                I0000oI00(byteArrayOutputStream, bytes.length);
/* 25 */                byteArrayOutputStream.write(bytes);
/* 30 */                byteArrayOutputStream.write(18);
/* 34 */                I0000oI00(byteArrayOutputStream, bytes2.length);
/* 37 */                byteArrayOutputStream.write(bytes2);
/* 40 */                byte[] byteArray = byteArrayOutputStream.toByteArray();
/* 47 */                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                        try {
/* 52 */                    fileOutputStream.write(114);
/* 56 */                    I0000oI00(fileOutputStream, byteArray.length);
/* 59 */                    fileOutputStream.write(byteArray);
/* 62 */                    fileOutputStream.close();
/* 46 */                    return true;
                        } finally {
                        }
                    } catch (Throwable th) {
/* 95 */                Log.e("TtsTask", "appendOnnxMetadataEntry failed for " + file.getName(), th);
/* 98 */                return false;
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
                
                    if (I0000Il00O(r7, r8, r0.read(r7)) != false) goto L11;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final boolean I00000oOI(File file, String str) {
/* 3 */             byte[] bytes = str.getBytes(IO1IOI.I00000oIO);
                    try {
/* 11 */                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                        try {
/* 14 */                    long length = randomAccessFile.length();
/* 26 */                    byte[] bArr = new byte[(int) Math.min(131072L, length)];
/* 30 */                    randomAccessFile.seek(0L);
/* 42 */                    if (!I0000Il00O(bArr, bytes, randomAccessFile.read(bArr))) {
/* 47 */                        if (length > 131072) {
/* 51 */                            byte[] bArr2 = new byte[131072];
/* 54 */                            randomAccessFile.seek(length - 131072);
                                }
/* 73 */                        randomAccessFile.close();
/* 83 */                        return false;
                            }
/* 67 */                    randomAccessFile.close();
/* 41 */                    return true;
                        } finally {
                        }
                    } catch (Throwable unused) {
/* 83 */                return false;
                    }
                }

                public static final boolean I0000Il00O(byte[] bArr, byte[] bArr2, int i) {
/* 7 */             Iterable iooO11l = new IooO11l(0, i - bArr2.length, 1);
/* 12 */            if (!(iooO11l instanceof Collection) || !((Collection) iooO11l).isEmpty()) {
/* 24 */                Iterator it = iooO11l.iterator();
/* 33 */                while (((IooO10lI) it).I00iiO) {
/* 38 */                    int iNextInt = ((IooIlO1) it).nextInt();
/* 46 */                    Iterable iooO11l2 = new IooO11l(0, bArr2.length - 1, 1);
/* 51 */                    if (!(iooO11l2 instanceof Collection) || !((Collection) iooO11l2).isEmpty()) {
/* 63 */                        Iterator it2 = iooO11l2.iterator();
/* 72 */                        while (((IooO10lI) it2).I00iiO) {
/* 77 */                            int iNextInt2 = ((IooIlO1) it2).nextInt();
/* 87 */                            if (bArr[iNextInt + iNextInt2] == bArr2[iNextInt2]) {
                                    }
                                }
                            }
/* 6 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public static final O1oIOiI11o0 I0000O(String str, String str2, String str3, String str4, long j) {
/* 72 */            return new O1oIOiI11o0(str, str4, null, "https://huggingface.co/csukuangfj/vits-piper-".concat(str2), null, null, IIl001iO0Io.I000oI1ioi("https://huggingface.co/csukuangfj/vits-piper-", str2, "/resolve/main/", str3), j, str3, "main", null, false, null, null, null, null, false, false, false, false, false, false, false, false, null, null, 0, null, null, -788374, 2047);
                }

                public static final void I0000oI00(OutputStream outputStream, int i) throws IOException {
/* 3 */             while (i > 127) {
/* 9 */                 outputStream.write((i & 127) | Barcode.FORMAT_ITF);
/* 12 */                i >>>= 7;
                    }
/* 15 */            outputStream.write(i);
                }
            }
