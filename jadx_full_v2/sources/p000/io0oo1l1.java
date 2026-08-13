            package p000;

            import android.content.Context;
            import android.util.Log;
            import java.io.File;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.util.concurrent.locks.ReentrantLock;
            
            public final class io0oo1l1 {
                public static final ReentrantLock I000II = new ReentrantLock();
                public Context I00000oIO;
                public String I00000oOI;
                public File I0000Il00O;
                public File I0000O;
                public boolean I0000oI00;
                public FileOutputStream I0001Ioi1lo;

                public final File I00000oIO() {
/* 1 */             String str = this.I00000oOI;
/* 3 */             Context context = this.I00000oIO;
/* 9 */             if (!this.I0000oI00) {
/* 13 */                File noBackupFilesDir = context.getNoBackupFilesDir();
/* 20 */                if (noBackupFilesDir == null || !noBackupFilesDir.isDirectory()) {
/* 30 */                    Log.w("LockableAtomicFile", "noBackupFilesDir doesn't exist, using regular files directory instead");
/* 33 */                    noBackupFilesDir = context.getFilesDir();
/* 37 */                    if (noBackupFilesDir != null && !noBackupFilesDir.isDirectory()) {
                                try {
                                } catch (SecurityException e) {
/* 84 */                            if (Log.isLoggable("LockableAtomicFile", 5)) {
/* 96 */                                Log.w("LockableAtomicFile", "mkdirs threw an exception: ".concat(noBackupFilesDir.toString()), e);
                                    }
                                }
/* 50 */                        if (!noBackupFilesDir.mkdirs()) {
/* 56 */                            if (Log.isLoggable("LockableAtomicFile", 5)) {
/* 74 */                                Log.w("LockableAtomicFile", "mkdirs failed: " + noBackupFilesDir.toString());
                                    }
/* 77 */                            noBackupFilesDir = null;
                                }
                            }
                        }
/* 100 */               if (noBackupFilesDir == null) {
/* 102 */                   this.I0000Il00O = null;
/* 104 */                   this.I0000O = null;
                        } else {
/* 112 */                   this.I0000Il00O = new File(noBackupFilesDir, str);
/* 125 */                   this.I0000O = new File(noBackupFilesDir, str.concat(".lock"));
                        }
/* 128 */               this.I0000oI00 = true;
/* 135 */               if (Log.isLoggable("LockableAtomicFile", 3)) {
/* 145 */                   "file initialized: ".concat(String.valueOf(this.I0000Il00O));
                        }
                    }
/* 148 */           return this.I0000Il00O;
                }

                public final void I00000oOI() {
/* 5 */             if (I00000oIO() == null) {
/* 7 */                 return;
                    }
/* 10 */            I000II.lock();
                    try {
/* 15 */                File file = this.I0000O;
/* 17 */                if (file == null) {
/* 35 */                    throw null;
                        }
/* 19 */                FileOutputStream fileOutputStream = new FileOutputStream(file);
/* 22 */                this.I0001Ioi1lo = fileOutputStream;
/* 28 */                fileOutputStream.getChannel().lock();
                    } catch (IOException e) {
/* 36 */                I0000O();
/* 39 */                OoOil11Ol1o.I000oI1ioi(e);
                    }
                }

                public final void I0000Il00O(byte[] bArr) {
/* 9 */             if (I00000oIO() == null) {
/* 49 */                return;
                    }
/* 14 */            File fileI00000oIO = I00000oIO();
/* 18 */            fileI00000oIO.getClass();
/* 21 */            IoIlOo1o0IIl ioIlOo1o0IIl = new IoIlOo1o0IIl(fileI00000oIO);
                    try {
/* 24 */                FileOutputStream fileOutputStreamI00IoO0 = ioIlOo1o0IIl.I00IoO0();
                        try {
/* 28 */                    fileOutputStreamI00IoO0.write(bArr);
/* 31 */                    ioIlOo1o0IIl.I0010o(fileOutputStreamI00IoO0);
/* 39 */                    if (Log.isLoggable("LockableAtomicFile", 3)) {
/* 43 */                        String.valueOf(this.I0000Il00O);
                            }
                        } catch (Throwable th) {
/* 51 */                    ioIlOo1o0IIl.I00100o1O0lo(fileOutputStreamI00IoO0);
/* 64 */                    Log.e("LockableAtomicFile", "Failed to save to ".concat(String.valueOf(this.I0000Il00O)));
/* 67 */                    throw th;
                        }
                    } catch (IOException e) {
/* 78 */                Log.e("LockableAtomicFile", "Failed to save to ".concat(String.valueOf(this.I0000Il00O)), e);
                    }
                }

                public final void I0000O() {
/* 1 */             ReentrantLock reentrantLock = I000II;
/* 7 */             if (I00000oIO() == null) {
/* 9 */                 return;
                    }
                    try {
                        try {
/* 11 */                    FileOutputStream fileOutputStream = this.I0001Ioi1lo;
/* 13 */                    if (fileOutputStream != null) {
/* 15 */                        fileOutputStream.close();
                            }
                        } catch (IOException e) {
/* 34 */                    throw new IllegalStateException(e);
                        }
                    } finally {
/* 35 */                this.I0001Ioi1lo = null;
/* 37 */                reentrantLock.unlock();
                    }
                }
            }
