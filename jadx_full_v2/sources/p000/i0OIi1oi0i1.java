            package p000;

            import java.io.File;
            import java.io.FileInputStream;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.RandomAccessFile;
            import java.lang.invoke.VarHandle;
            import java.util.Properties;
            
            public final class i0OIi1oi0i1 {
                public static final OlOilIlol1 I000O01llI0 = new OlOilIlol1("SliceMetadataManager");
                public final i0Il00O1 I00000oOI;
                public final String I0000Il00O;
                public final int I0000O;
                public final long I0000oI00;
                public final String I0001Ioi1lo;
                public final byte[] I00000oIO = new byte[8192];
                public int I000II = -1;

                public i0OIi1oi0i1(i0Il00O1 i0il00o1, String str, int i, long j, String str2) {
/* 10 */            this.I00000oOI = i0il00o1;
/* 12 */            this.I0000Il00O = str;
/* 14 */            this.I0000O = i;
/* 16 */            this.I0000oI00 = j;
/* 18 */            this.I0001Ioi1lo = str2;
                }

                public final int I00000oIO() throws IOException {
/* 1 */             i0Il00O1 i0il00o1 = this.I00000oOI;
/* 3 */             i0il00o1.getClass();
/* 41 */            File file = new File(new File(new File(new File(i0il00o1.I0000Il00O(this.I0000O, this.I0000oI00, this.I0000Il00O), "_slices"), "_metadata"), this.I0001Ioi1lo), "checkpoint.dat");
/* 48 */            if (!file.exists()) {
/* 50 */                return 0;
                    }
/* 54 */            FileInputStream fileInputStream = new FileInputStream(file);
                    try {
/* 59 */                Properties properties = new Properties();
/* 62 */                properties.load(fileInputStream);
/* 65 */                fileInputStream.close();
/* 81 */                if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
/* 83 */                    return -1;
                        }
/* 91 */                if (properties.getProperty("previousChunk") != null) {
/* 101 */                   return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
                        }
/* 111 */               throw new i0O0lI1oiO("Slice checkpoint file corrupt.");
                    } catch (Throwable th) {
                        try {
/* 113 */                   fileInputStream.close();
                        } catch (Throwable th2) {
/* 118 */                   th.addSuppressed(th2);
                        }
/* 541 */               throw th;
                    }
                }

                public final i0IoI0 I00000oOI() throws IOException, NumberFormatException {
/* 3 */             i0Il00O1 i0il00o1 = this.I00000oOI;
/* 5 */             i0il00o1.getClass();
/* 43 */            File file = new File(new File(new File(new File(i0il00o1.I0000Il00O(this.I0000O, this.I0000oI00, this.I0000Il00O), "_slices"), "_metadata"), this.I0001Ioi1lo), "checkpoint.dat");
/* 50 */            if (!file.exists()) {
/* 541 */               throw new i0O0lI1oiO("Slice checkpoint file does not exist.");
                    }
/* 54 */            Properties properties = new Properties();
/* 59 */            FileInputStream fileInputStream = new FileInputStream(file);
                    try {
/* 62 */                properties.load(fileInputStream);
/* 65 */                fileInputStream.close();
/* 76 */                if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
/* 173 */                   throw new i0O0lI1oiO("Slice checkpoint file corrupt.");
                        }
                        try {
/* 90 */                    int i = Integer.parseInt(properties.getProperty("fileStatus"));
/* 96 */                    String property = properties.getProperty("fileName");
/* 106 */                   long j = Long.parseLong(properties.getProperty("fileOffset", "-1"));
/* 116 */                   long j2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
/* 124 */                   int i2 = Integer.parseInt(properties.getProperty("previousChunk"));
/* 140 */                   this.I000II = Integer.parseInt(properties.getProperty("metadataFileCounter", OIllioIilO.I01OO1I));
/* 144 */                   i0IoI0 i0ioi0 = new i0IoI0();
/* 147 */                   i0ioi0.I00000oIO = i;
/* 149 */                   i0ioi0.I00000oOI = property;
/* 151 */                   i0ioi0.I0000Il00O = j;
/* 153 */                   i0ioi0.I0000O = j2;
/* 155 */                   i0ioi0.I0000oI00 = i2;
/* 157 */                   VarHandle.storeStoreFence();
/* 160 */                   return i0ioi0;
                        } catch (NumberFormatException e) {
/* 167 */                   throw new i0O0lI1oiO("Slice checkpoint file corrupt.", e);
                        }
                    } catch (Throwable th) {
                        try {
/* 175 */                   fileInputStream.close();
                        } catch (Throwable th2) {
/* 180 */                   th.addSuppressed(th2);
                        }
/* 183 */               throw th;
                    }
                }

                public final File I0000Il00O() {
/* 3 */             i0Il00O1 i0il00o1 = this.I00000oOI;
/* 5 */             i0il00o1.getClass();
/* 36 */            File file = new File(new File(new File(i0il00o1.I0000Il00O(this.I0000O, this.I0000oI00, this.I0000Il00O), "_slices"), "_metadata"), this.I0001Ioi1lo);
/* 43 */            if (!file.exists()) {
/* 45 */                file.mkdirs();
                    }
/* 67 */            return new File(file, this.I000II + "-NAM.dat");
                }

                public final void I0000O(long j, byte[] bArr, int i, int i2) throws IOException {
/* 9 */             RandomAccessFile randomAccessFile = new RandomAccessFile(I0000Il00O(), "rw");
                    try {
/* 12 */                randomAccessFile.seek(j);
/* 15 */                randomAccessFile.write(bArr, i, i2);
/* 18 */                randomAccessFile.close();
                    } catch (Throwable th) {
                        try {
/* 23 */                    randomAccessFile.close();
                        } catch (Throwable th2) {
/* 28 */                    th.addSuppressed(th2);
                        }
/* 483 */               throw th;
                    }
                }

                public final void I0000oI00(int i) throws IOException {
/* 3 */             Properties properties = new Properties();
/* 10 */            properties.put("fileStatus", "3");
/* 27 */            properties.put("fileOffset", String.valueOf(I0000Il00O().length()));
/* 36 */            properties.put("previousChunk", String.valueOf(i));
/* 47 */            properties.put("metadataFileCounter", String.valueOf(this.I000II));
/* 56 */            FileOutputStream fileOutputStream = new FileOutputStream(I000l1());
                    try {
/* 60 */                properties.store(fileOutputStream, (String) null);
/* 63 */                fileOutputStream.close();
                    } catch (Throwable th) {
                        try {
/* 68 */                    fileOutputStream.close();
                        } catch (Throwable th2) {
/* 73 */                    th.addSuppressed(th2);
                        }
/* 186 */               throw th;
                    }
                }

                public final void I0001Ioi1lo(long j, long j2, int i, String str) throws IOException {
/* 3 */             Properties properties = new Properties();
/* 10 */            properties.put("fileStatus", "1");
/* 15 */            properties.put("fileName", str);
/* 24 */            properties.put("fileOffset", String.valueOf(j));
/* 33 */            properties.put("remainingBytes", String.valueOf(j2));
/* 42 */            properties.put("previousChunk", String.valueOf(i));
/* 53 */            properties.put("metadataFileCounter", String.valueOf(this.I000II));
/* 62 */            FileOutputStream fileOutputStream = new FileOutputStream(I000l1());
                    try {
/* 66 */                properties.store(fileOutputStream, (String) null);
/* 69 */                fileOutputStream.close();
                    } catch (Throwable th) {
                        try {
/* 74 */                    fileOutputStream.close();
                        } catch (Throwable th2) {
/* 79 */                    th.addSuppressed(th2);
                        }
/* 483 */               throw th;
                    }
                }

                public final void I000II(int i, byte[] bArr) throws IOException {
/* 3 */             Properties properties = new Properties();
/* 10 */            properties.put("fileStatus", "2");
/* 19 */            properties.put("previousChunk", String.valueOf(i));
/* 30 */            properties.put("metadataFileCounter", String.valueOf(this.I000II));
/* 39 */            FileOutputStream fileOutputStream = new FileOutputStream(I000l1());
                    try {
/* 43 */                properties.store(fileOutputStream, (String) null);
/* 46 */                fileOutputStream.close();
/* 49 */                i0Il00O1 i0il00o1 = this.I00000oOI;
/* 51 */                i0il00o1.getClass();
/* 89 */                File file = new File(new File(new File(new File(i0il00o1.I0000Il00O(this.I0000O, this.I0000oI00, this.I0000Il00O), "_slices"), "_metadata"), this.I0001Ioi1lo), "checkpoint_ext.dat");
/* 96 */                if (file.exists()) {
/* 98 */                    file.delete();
                        }
/* 103 */               fileOutputStream = new FileOutputStream(file);
                        try {
/* 106 */                   fileOutputStream.write(bArr);
/* 109 */                   fileOutputStream.close();
                        } finally {
                            try {
/* 114 */                       fileOutputStream.close();
                            } catch (Throwable th) {
/* 119 */                       th.addSuppressed(th);
                            }
                        }
                    } catch (Throwable th2) {
/* 551 */               throw th2;
                    }
                }

                public final void I000O01llI0(int i) throws IOException {
/* 3 */             Properties properties = new Properties();
/* 10 */            properties.put("fileStatus", "4");
/* 19 */            properties.put("previousChunk", String.valueOf(i));
/* 30 */            properties.put("metadataFileCounter", String.valueOf(this.I000II));
/* 39 */            FileOutputStream fileOutputStream = new FileOutputStream(I000l1());
                    try {
/* 43 */                properties.store(fileOutputStream, (String) null);
/* 46 */                fileOutputStream.close();
                    } catch (Throwable th) {
                        try {
/* 51 */                    fileOutputStream.close();
                        } catch (Throwable th2) {
/* 56 */                    th.addSuppressed(th2);
                        }
/* 186 */               throw th;
                    }
                }

                public final void I000OOo1O(byte[] bArr) throws IOException {
                    this.I000II++;
/* 9 */             i0Il00O1 i0il00o1 = this.I00000oOI;
/* 11 */            i0il00o1.getClass();
/* 42 */            File file = new File(new File(new File(i0il00o1.I0000Il00O(this.I0000O, this.I0000oI00, this.I0000Il00O), "_slices"), "_metadata"), this.I0001Ioi1lo);
/* 49 */            if (!file.exists()) {
/* 51 */                file.mkdirs();
                    }
                    try {
/* 78 */                FileOutputStream fileOutputStream = new FileOutputStream(new File(file, this.I000II + "-LFH.dat"));
                        try {
/* 81 */                    fileOutputStream.write(bArr);
/* 84 */                    fileOutputStream.close();
                        } finally {
                        }
                    } catch (IOException e) {
/* 186 */               throw new i0O0lI1oiO("Could not write metadata file.", e);
                    }
                }

                public final void I000OiO(InputStream inputStream, byte[] bArr) throws IOException {
/* 1 */             byte[] bArr2 = this.I00000oIO;
                    this.I000II++;
/* 15 */            FileOutputStream fileOutputStream = new FileOutputStream(I0000Il00O());
                    try {
/* 18 */                fileOutputStream.write(bArr);
/* 21 */                int i = inputStream.read(bArr2);
/* 25 */                while (i > 0) {
/* 28 */                    fileOutputStream.write(bArr2, 0, i);
/* 31 */                    i = inputStream.read(bArr2);
                        }
/* 38 */                fileOutputStream.close();
                    } catch (Throwable th) {
                        try {
/* 42 */                    fileOutputStream.close();
                        } catch (Throwable th2) {
/* 47 */                    th.addSuppressed(th2);
                        }
/* 89 */                throw th;
                    }
                }

                public final void I000iOII(int i, byte[] bArr) throws IOException {
                    this.I000II++;
/* 13 */            FileOutputStream fileOutputStream = new FileOutputStream(I0000Il00O());
                    try {
/* 17 */                fileOutputStream.write(bArr, 0, i);
/* 20 */                fileOutputStream.close();
                    } catch (Throwable th) {
                        try {
/* 25 */                    fileOutputStream.close();
                        } catch (Throwable th2) {
/* 30 */                    th.addSuppressed(th2);
                        }
/* 89 */                throw th;
                    }
                }

                public final File I000l1() throws IOException {
/* 1 */             i0Il00O1 i0il00o1 = this.I00000oOI;
/* 3 */             i0il00o1.getClass();
/* 41 */            File file = new File(new File(new File(new File(i0il00o1.I0000Il00O(this.I0000O, this.I0000oI00, this.I0000Il00O), "_slices"), "_metadata"), this.I0001Ioi1lo), "checkpoint.dat");
/* 48 */            file.getParentFile().mkdirs();
/* 51 */            file.createNewFile();
/* 113 */           return file;
                }
            }
