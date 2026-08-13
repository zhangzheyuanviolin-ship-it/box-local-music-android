            package p000;

            import java.io.BufferedReader;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.io.InputStreamReader;
            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import java.nio.CharBuffer;
            import java.nio.charset.Charset;
            import java.nio.charset.CharsetEncoder;
            import java.nio.charset.CodingErrorAction;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            
            public abstract class IlIl10 extends ilOO0iO1ool {
                public static void I0000Il00O(File file, File file2) throws IOException {
/* 5 */             if (!file.exists()) {
/* 551 */               throw new IlIOli1Ol0(file, null, "The source file doesn't exist.");
                    }
/* 11 */            if (file2.exists() && !file2.delete()) {
/* 27 */                throw new IlIOli1Ol0(file, file2, "Tried to overwrite the destination, but failed to delete it.");
                    }
/* 32 */            if (file.isDirectory()) {
/* 38 */                if (!file2.mkdirs()) {
/* 48 */                    throw new IOO1IOl1O10(file, file2, "Failed to create target directory.");
                        }
/* 40 */                return;
                    }
/* 49 */            File parentFile = file2.getParentFile();
/* 53 */            if (parentFile != null) {
/* 55 */                parentFile.mkdirs();
                    }
/* 60 */            FileInputStream fileInputStream = new FileInputStream(file);
                    try {
/* 65 */                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        try {
/* 70 */                    byte[] bArr = new byte[8192];
/* 76 */                    for (int i = fileInputStream.read(bArr); i >= 0; i = fileInputStream.read(bArr)) {
/* 79 */                        fileOutputStream.write(bArr, 0, i);
                            }
/* 87 */                    fileOutputStream.close();
/* 90 */                    fileInputStream.close();
                        } finally {
                        }
                    } finally {
                    }
                }

                public static void I0000O(File file) {
/* 7 */             Iterator it = I000l1(file, IlIl0l1lO.I00iiI).iterator();
                    while (true) {
/* 12 */                boolean z = true;
                        while (true) {
/* 14 */                    I011lIilI0lo i011lIilI0lo = (I011lIilI0lo) it;
/* 20 */                    if (!i011lIilI0lo.hasNext()) {
/* 49 */                        return;
                            }
/* 26 */                    File file2 = (File) i011lIilI0lo.next();
/* 32 */                    if (!file2.delete() && file2.exists()) {
/* 43 */                        z = false;
                            } else if (z) {
                                break;
                            } else {
/* 43 */                        z = false;
                            }
                        }
                    }
                }

                public static void I0000oI00(File file, IIOIlOoI111 iIOIlOoI111) throws IOException {
/* 15 */            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), IO1IOI.I00000oIO));
                    try {
/* 24 */                Iterator it = ((IOo0i10) lOliOoIi.I00000oIO(bufferedReader)).iterator();
/* 32 */                while (it.hasNext()) {
/* 38 */                    iIOIlOoI111.invoke(it.next());
                        }
/* 44 */                bufferedReader.close();
                    } finally {
                    }
                }

                public static String I0001Ioi1lo(File file) {
/* 9 */             return OlOoOIi0o.I00O0i0ii('.', file.getName(), "");
                }

                public static final IlIOooi00lO I000II(IlIOooi00lO ilIOooi00lO) {
/* 3 */             File file = ilIOooi00lO.I00000oIO;
/* 5 */             List<File> list = ilIOooi00lO.I00000oOI;
/* 13 */            ArrayList arrayList = new ArrayList(list.size());
/* 24 */            for (File file2 : list) {
/* 32 */                String name = file2.getName();
/* 42 */                if (!O0000Ioio00.I0000O(name, ".")) {
/* 51 */                    if (!O0000Ioio00.I0000O(name, "..")) {
/* 87 */                        arrayList.add(file2);
                            } else if (arrayList.isEmpty() || O0000Ioio00.I0000O(((File) IOOi0Ool1i.I00Io1o110i(arrayList)).getName(), "..")) {
/* 83 */                        arrayList.add(file2);
                            }
                        }
                    }
/* 91 */            return new IlIOooi00lO(file, arrayList);
                }

                public static byte[] I000O01llI0(File file) throws IOException {
/* 3 */             FileInputStream fileInputStream = new FileInputStream(file);
                    try {
/* 6 */                 long length = file.length();
/* 17 */                if (length > 2147483647L) {
/* 148 */                   throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
                        }
/* 19 */                int i = (int) length;
/* 20 */                byte[] bArrCopyOf = new byte[i];
/* 23 */                int i2 = i;
/* 24 */                int i3 = 0;
/* 25 */                while (i2 > 0) {
/* 27 */                    int i4 = fileInputStream.read(bArrCopyOf, i3, i2);
/* 31 */                    if (i4 < 0) {
                                break;
                            }
/* 33 */                    i2 -= i4;
/* 34 */                    i3 += i4;
                        }
/* 38 */                if (i2 > 0) {
/* 40 */                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, i3);
                        } else {
/* 45 */                    int i5 = fileInputStream.read();
/* 50 */                    if (i5 != -1) {
/* 57 */                        Il1ioiO il1ioiO = new Il1ioiO(8193);
/* 60 */                        il1ioiO.write(i5);
/* 63 */                        iOiOlIoI.I00000oIO(fileInputStream, il1ioiO);
/* 70 */                        int size = il1ioiO.size() + i;
/* 71 */                        if (size < 0) {
/* 117 */                           throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                                }
/* 73 */                        byte[] bArrI00000oIO = il1ioiO.I00000oIO();
/* 77 */                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
/* 85 */                        System.arraycopy(bArrI00000oIO, 0, bArrCopyOf, i, il1ioiO.size());
                            }
                        }
/* 88 */                fileInputStream.close();
/* 91 */                return bArrCopyOf;
                    } catch (Throwable th) {
                        try {
/* 149 */                   throw th;
                        } catch (Throwable th2) {
/* 151 */                   ii1OOii.I00000oIO(fileInputStream, th);
/* 186 */                   throw th2;
                        }
                    }
                }

                public static String I000OOo1O(File file) throws IOException {
/* 10 */            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), IO1IOI.I00000oIO);
                    try {
/* 13 */                String strI00000oOI = lOliOoIi.I00000oOI(inputStreamReader);
/* 17 */                inputStreamReader.close();
/* 20 */                return strI00000oOI;
                    } finally {
                    }
                }

                public static File I000OiO(File file, File file2) throws IOException {
                    String string;
/* 7 */             IlIOooi00lO ilIOooi00lOI000II = I000II(ilOO0iO1ool.I00000oOI(file));
/* 11 */            List list = ilIOooi00lOI000II.I00000oOI;
/* 17 */            IlIOooi00lO ilIOooi00lOI000II2 = I000II(ilOO0iO1ool.I00000oOI(file2));
/* 21 */            List list2 = ilIOooi00lOI000II2.I00000oOI;
/* 32 */            if (ilIOooi00lOI000II.I00000oIO.equals(ilIOooi00lOI000II2.I00000oIO)) {
/* 36 */                int size = list2.size();
/* 40 */                int size2 = list.size();
/* 44 */                int iMin = Math.min(size2, size);
/* 48 */                int i = 0;
/* 49 */                while (i < iMin && O0000Ioio00.I0000O(list.get(i), list2.get(i))) {
/* 65 */                    i++;
                        }
/* 70 */                StringBuilder sb = new StringBuilder();
                        int i2 = size - 1;
/* 75 */                if (i <= i2) {
/* 93 */                    while (!O0000Ioio00.I0000O(((File) list2.get(i2)).getName(), "..")) {
/* 96 */                        sb.append("..");
/* 99 */                        if (i2 != i) {
/* 103 */                           sb.append(File.separatorChar);
                                }
/* 106 */                       if (i2 != i) {
                                    i2--;
                                }
                            }
/* 34 */                    string = null;
                        }
/* 111 */               if (i < size2) {
/* 113 */                   if (i < size) {
/* 117 */                       sb.append(File.separatorChar);
                            }
/* 136 */                   IOOi0Ool1i.I00IioO0OiOi(IOOi0Ool1i.I001iOo1i0O(list, i), sb, File.separator, null, null, null, 124);
                        }
/* 139 */               string = sb.toString();
                    } else {
/* 34 */                string = null;
                    }
/* 143 */           if (string != null) {
/* 145 */               return new File(string);
                    }
/* 157 */           IioIoO10iOiI.I000iOII("this and base files have different roots: ", file, " and ", file2, 46);
/* 31 */            return null;
                }

                public static File I000iOII(File file, String str) {
/* 3 */             File file2 = new File(str);
/* 14 */            if (ilOO0iO1ool.I00000oIO(file2.getPath()) > 0) {
/* 16 */                return file2;
                    }
/* 17 */            String string = file.toString();
/* 25 */            if (string.length() != 0) {
/* 28 */                char c = File.separatorChar;
/* 34 */                if (!OlOoOIi0o.I0010I0i(string, c)) {
/* 71 */                    return new File(string + c + file2);
                        }
                    }
/* 50 */            return new File(string + file2);
                }

                public static final IlIl0l I000l1(File file, IlIl0l1lO ilIl0l1lO) {
/* 4 */             IlIl0l ilIl0l = new IlIl0l(0);
/* 7 */             ilIl0l.I00000oOI = file;
/* 9 */             ilIl0l.I0000Il00O = ilIl0l1lO;
/* 11 */            VarHandle.storeStoreFence();
/* 89 */            return ilIl0l;
                }

                public static final void I000lI(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
/* 7 */             if (str.length() < 16384) {
/* 13 */                fileOutputStream.write(str.getBytes(charset));
/* 16 */                return;
                    }
/* 17 */            CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
/* 21 */            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
/* 27 */            CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
/* 33 */            CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
/* 49 */            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
/* 54 */            int i = 0;
/* 55 */            int i2 = 0;
/* 60 */            while (i < str.length()) {
/* 69 */                int iMin = Math.min(8192 - i2, str.length() - i);
/* 73 */                int i3 = i + iMin;
/* 79 */                str.getChars(i, i3, charBufferAllocate.array(), i2);
/* 83 */                charBufferAllocate.limit(iMin + i2);
/* 90 */                i2 = 1;
/* 104 */               if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i3 == str.length()).isUnderflow()) {
/* 146 */                   I000II.I001IO000("Check failed.");
/* 215 */                   return;
                        }
/* 114 */               fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
/* 125 */               if (charBufferAllocate.position() != charBufferAllocate.limit()) {
/* 131 */                   charBufferAllocate.put(0, charBufferAllocate.get());
                        } else {
/* 135 */                   i2 = 0;
                        }
/* 136 */               charBufferAllocate.clear();
/* 139 */               byteBufferAllocate.clear();
/* 142 */               i = i3;
                    }
                }
            }
