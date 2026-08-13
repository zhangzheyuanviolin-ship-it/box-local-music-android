            package p000;

            import android.util.Log;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.Serializable;
            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            
/* 11 */    public final class Il1Iii0ii1oo {
                public final int I00000oIO;
                public final int I00000oOI;
                public final long I0000Il00O;
                public final byte[] I0000O;

                public Il1Iii0ii1oo(long j, byte[] bArr, int i, int i2) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = i2;
/* 8 */             this.I0000Il00O = j;
/* 10 */            this.I0000O = bArr;
                }

                public static Il1Iii0ii1oo I00000oIO(String str) {
/* 9 */             byte[] bytes = str.concat("\u0000").getBytes(Il1Ilio1Ol1.I00O0i0ii);
/* 17 */            return new Il1Iii0ii1oo(bytes, 2, bytes.length);
                }

                public static Il1Iii0ii1oo I00000oOI(long j, ByteOrder byteOrder) {
/* 2 */             long[] jArr = {j};
/* 16 */            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[Il1Ilio1Ol1.I00IOO[4] * jArr.length]);
/* 20 */            byteBufferWrap.order(byteOrder);
/* 24 */            for (long j2 : jArr) {
/* 29 */                byteBufferWrap.putInt((int) j2);
                    }
/* 42 */            return new Il1Iii0ii1oo(byteBufferWrap.array(), 4, jArr.length);
                }

                public static Il1Iii0ii1oo I0000Il00O(Il1IioIIooo[] il1IioIIoooArr, ByteOrder byteOrder) {
/* 10 */            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[Il1Ilio1Ol1.I00IOO[5] * il1IioIIoooArr.length]);
/* 14 */            byteBufferWrap.order(byteOrder);
/* 19 */            for (Il1IioIIooo il1IioIIooo : il1IioIIoooArr) {
/* 26 */                byteBufferWrap.putInt((int) il1IioIIooo.I00000oIO);
/* 32 */                byteBufferWrap.putInt((int) il1IioIIooo.I00000oOI);
                    }
/* 45 */            return new Il1Iii0ii1oo(byteBufferWrap.array(), 5, il1IioIIoooArr.length);
                }

                public static Il1Iii0ii1oo I0000O(int i, ByteOrder byteOrder) {
/* 1 */             int[] iArr = {i};
/* 14 */            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[Il1Ilio1Ol1.I00IOO[3] * iArr.length]);
/* 18 */            byteBufferWrap.order(byteOrder);
/* 23 */            for (int i2 : iArr) {
/* 28 */                byteBufferWrap.putShort((short) i2);
                    }
/* 41 */            return new Il1Iii0ii1oo(byteBufferWrap.array(), 3, iArr.length);
                }

                public final double I0000oI00(ByteOrder byteOrder) {
/* 1 */             Object objI000O01llI0 = I000O01llI0(byteOrder);
/* 5 */             if (objI000O01llI0 == null) {
/* 168 */               throw new NumberFormatException("NULL can't be converted to a double value");
                    }
/* 9 */             if (objI000O01llI0 instanceof String) {
/* 13 */                return Double.parseDouble((String) objI000O01llI0);
                    }
/* 24 */            if (objI000O01llI0 instanceof long[]) {
/* 29 */                if (((long[]) objI000O01llI0).length == 1) {
/* 33 */                    return r3[0];
                        }
/* 40 */                throw new NumberFormatException("There are more than one component");
                    }
/* 43 */            if (objI000O01llI0 instanceof int[]) {
/* 48 */                if (((int[]) objI000O01llI0).length == 1) {
/* 52 */                    return r3[0];
                        }
/* 59 */                throw new NumberFormatException("There are more than one component");
                    }
/* 62 */            if (objI000O01llI0 instanceof double[]) {
/* 64 */                double[] dArr = (double[]) objI000O01llI0;
/* 67 */                if (dArr.length == 1) {
/* 69 */                    return dArr[0];
                        }
/* 77 */                throw new NumberFormatException("There are more than one component");
                    }
/* 80 */            if (!(objI000O01llI0 instanceof Il1IioIIooo[])) {
/* 110 */               throw new NumberFormatException("Couldn't find a double value");
                    }
/* 82 */            Il1IioIIooo[] il1IioIIoooArr = (Il1IioIIooo[]) objI000O01llI0;
/* 85 */            if (il1IioIIoooArr.length != 1) {
/* 102 */               throw new NumberFormatException("There are more than one component");
                    }
/* 87 */            Il1IioIIooo il1IioIIooo = il1IioIIoooArr[0];
/* 95 */            return il1IioIIooo.I00000oIO / il1IioIIooo.I00000oOI;
                }

                public final int I0001Ioi1lo(ByteOrder byteOrder) throws Throwable {
/* 1 */             Object objI000O01llI0 = I000O01llI0(byteOrder);
/* 5 */             if (objI000O01llI0 == null) {
/* 77 */                throw new NumberFormatException("NULL can't be converted to a integer value");
                    }
/* 9 */             if (objI000O01llI0 instanceof String) {
/* 13 */                return Integer.parseInt((String) objI000O01llI0);
                    }
/* 24 */            if (objI000O01llI0 instanceof long[]) {
/* 26 */                long[] jArr = (long[]) objI000O01llI0;
/* 29 */                if (jArr.length == 1) {
/* 33 */                    return (int) jArr[0];
                        }
/* 40 */                throw new NumberFormatException("There are more than one component");
                    }
/* 43 */            if (!(objI000O01llI0 instanceof int[])) {
/* 66 */                throw new NumberFormatException("Couldn't find a integer value");
                    }
/* 45 */            int[] iArr = (int[]) objI000O01llI0;
/* 48 */            if (iArr.length == 1) {
/* 50 */                return iArr[0];
                    }
/* 58 */            throw new NumberFormatException("There are more than one component");
                }

                public final String I000II(ByteOrder byteOrder) throws Throwable {
/* 1 */             Object objI000O01llI0 = I000O01llI0(byteOrder);
/* 5 */             if (objI000O01llI0 == null) {
/* 150 */               return null;
                    }
/* 11 */            if (objI000O01llI0 instanceof String) {
/* 13 */                return (String) objI000O01llI0;
                    }
/* 18 */            StringBuilder sb = new StringBuilder();
/* 25 */            int i = 0;
/* 26 */            if (objI000O01llI0 instanceof long[]) {
/* 28 */                long[] jArr = (long[]) objI000O01llI0;
/* 31 */                while (i < jArr.length) {
/* 35 */                    sb.append(jArr[i]);
/* 38 */                    i++;
/* 41 */                    if (i != jArr.length) {
/* 43 */                        sb.append(",");
                            }
                        }
/* 47 */                return sb.toString();
                    }
/* 54 */            if (objI000O01llI0 instanceof int[]) {
/* 56 */                int[] iArr = (int[]) objI000O01llI0;
/* 59 */                while (i < iArr.length) {
/* 63 */                    sb.append(iArr[i]);
/* 66 */                    i++;
/* 69 */                    if (i != iArr.length) {
/* 71 */                        sb.append(",");
                            }
                        }
/* 75 */                return sb.toString();
                    }
/* 82 */            if (objI000O01llI0 instanceof double[]) {
/* 84 */                double[] dArr = (double[]) objI000O01llI0;
/* 87 */                while (i < dArr.length) {
/* 91 */                    sb.append(dArr[i]);
/* 94 */                    i++;
/* 97 */                    if (i != dArr.length) {
/* 99 */                        sb.append(",");
                            }
                        }
/* 103 */               return sb.toString();
                    }
/* 110 */           if (!(objI000O01llI0 instanceof Il1IioIIooo[])) {
/* 150 */               return null;
                    }
/* 112 */           Il1IioIIooo[] il1IioIIoooArr = (Il1IioIIooo[]) objI000O01llI0;
/* 115 */           while (i < il1IioIIoooArr.length) {
/* 121 */               sb.append(il1IioIIoooArr[i].I00000oIO);
/* 126 */               sb.append('/');
/* 133 */               sb.append(il1IioIIoooArr[i].I00000oOI);
/* 136 */               i++;
/* 139 */               if (i != il1IioIIoooArr.length) {
/* 141 */                   sb.append(",");
                        }
                    }
/* 145 */           return sb.toString();
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:51), block:B:17:0x0032 */
                /* JADX WARN: Removed duplicated region for block: B:103:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Type inference failed for: r13v14, types: [int[]] */
                /* JADX WARN: Type inference failed for: r13v15, types: [long[]] */
                /* JADX WARN: Type inference failed for: r13v16, types: [Il1IioIIooo[]] */
                /* JADX WARN: Type inference failed for: r13v17, types: [int[]] */
                /* JADX WARN: Type inference failed for: r13v18, types: [int[]] */
                /* JADX WARN: Type inference failed for: r13v19, types: [Il1IioIIooo[]] */
                /* JADX WARN: Type inference failed for: r13v20, types: [double[]] */
                /* JADX WARN: Type inference failed for: r13v21, types: [java.io.Serializable] */
                /* JADX WARN: Type inference failed for: r13v22, types: [double[]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Serializable I000O01llI0(ByteOrder byteOrder) throws Throwable {
                    Il1Iii0iO il1Iii0iO;
                    InputStream inputStream;
                    String str;
                    byte b;
                    ?? r13;
/* 1 */             byte[] bArr = this.I0000O;
/* 7 */             InputStream inputStream2 = null;
                    try {
                        try {
/* 10 */                    il1Iii0iO = new Il1Iii0iO(bArr);
                            try {
/* 13 */                        il1Iii0iO.I00iiO = byteOrder;
/* 15 */                        int i = this.I00000oIO;
/* 22 */                        int length = 0;
/* 23 */                        int i2 = this.I00000oOI;
                                switch (i) {
                                    case 1:
                                    case 6:
/* 250 */                               if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
/* 283 */                                   str = new String(bArr, Il1Ilio1Ol1.I00O0i0ii);
                                            try {
/* 239 */                                       il1Iii0iO.close();
/* 242 */                                       return str;
                                            } catch (IOException e) {
/* 244 */                                       Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
/* 247 */                                       return str;
                                            }
                                        }
/* 267 */                               String str2 = new String(new char[]{(char) (b + 48)});
                                        try {
/* 270 */                                   il1Iii0iO.close();
/* 273 */                                   return str2;
                                        } catch (IOException e2) {
/* 275 */                                   Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
/* 278 */                                   return str2;
                                        }
                                    case 2:
                                    case 7:
/* 187 */                               if (i2 >= Il1Ilio1Ol1.I00IioO0OiOi.length) {
/* 189 */                                   int i3 = 0;
                                            while (true) {
/* 190 */                                       byte[] bArr2 = Il1Ilio1Ol1.I00IioO0OiOi;
/* 193 */                                       if (i3 >= bArr2.length) {
/* 205 */                                           length = bArr2.length;
                                                } else if (bArr[i3] == bArr2[i3]) {
/* 202 */                                           i3++;
                                                }
                                            }
                                        }
/* 208 */                               StringBuilder sb = new StringBuilder();
/* 211 */                               while (length < i2) {
/* 213 */                                   byte b2 = bArr[length];
/* 215 */                                   if (b2 == 0) {
/* 235 */                                       str = sb.toString();
/* 239 */                                       il1Iii0iO.close();
/* 242 */                                       return str;
                                            }
/* 220 */                                   if (b2 >= 32) {
/* 223 */                                       sb.append((char) b2);
                                            } else {
/* 229 */                                       sb.append('?');
                                            }
/* 232 */                                   length++;
                                        }
/* 235 */                               str = sb.toString();
/* 239 */                               il1Iii0iO.close();
/* 242 */                               return str;
                                    case 3:
/* 171 */                               r13 = new int[i2];
/* 173 */                               while (length < i2) {
/* 179 */                                   r13[length] = il1Iii0iO.readUnsignedShort();
/* 181 */                                   length++;
                                        }
                                        try {
/* 57 */                                    il1Iii0iO.close();
/* 60 */                                    return r13;
                                        } catch (IOException e3) {
/* 62 */                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
/* 65 */                                    return r13;
                                        }
                                    case 4:
/* 156 */                               r13 = new long[i2];
/* 158 */                               while (length < i2) {
/* 166 */                                   r13[length] = il1Iii0iO.readInt() & 4294967295L;
/* 168 */                                   length++;
                                        }
/* 57 */                                il1Iii0iO.close();
/* 60 */                                return r13;
                                    case 5:
/* 130 */                               r13 = new Il1IioIIooo[i2];
/* 132 */                               while (length < i2) {
/* 151 */                                   r13[length] = new Il1IioIIooo(il1Iii0iO.readInt() & 4294967295L, il1Iii0iO.readInt() & 4294967295L);
/* 153 */                                   length++;
                                        }
/* 57 */                                il1Iii0iO.close();
/* 60 */                                return r13;
                                    case 8:
/* 117 */                               r13 = new int[i2];
/* 119 */                               while (length < i2) {
/* 125 */                                   r13[length] = il1Iii0iO.readShort();
/* 127 */                                   length++;
                                        }
/* 57 */                                il1Iii0iO.close();
/* 60 */                                return r13;
                                    case 9:
/* 104 */                               r13 = new int[i2];
/* 106 */                               while (length < i2) {
/* 112 */                                   r13[length] = il1Iii0iO.readInt();
/* 114 */                                   length++;
                                        }
/* 57 */                                il1Iii0iO.close();
/* 60 */                                return r13;
                                    case 10:
/* 80 */                                r13 = new Il1IioIIooo[i2];
/* 82 */                                while (length < i2) {
/* 99 */                                    r13[length] = new Il1IioIIooo(il1Iii0iO.readInt(), il1Iii0iO.readInt());
/* 101 */                                   length++;
                                        }
/* 57 */                                il1Iii0iO.close();
/* 60 */                                return r13;
                                    case 11:
/* 66 */                                r13 = new double[i2];
/* 68 */                                while (length < i2) {
/* 75 */                                    r13[length] = il1Iii0iO.readFloat();
/* 77 */                                    length++;
                                        }
/* 57 */                                il1Iii0iO.close();
/* 60 */                                return r13;
                                    case 12:
/* 37 */                                r13 = new double[i2];
/* 39 */                                while (length < i2) {
/* 45 */                                    r13[length] = il1Iii0iO.readDouble();
/* 47 */                                    length++;
                                        }
/* 57 */                                il1Iii0iO.close();
/* 60 */                                return r13;
                                    default:
                                        try {
/* 28 */                                    il1Iii0iO.close();
/* 7 */                                     return null;
                                        } catch (IOException e4) {
/* 33 */                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
/* 7 */                                     return null;
                                        }
                                }
                            } catch (IOException e5) {
/* 54 */                        e = e5;
/* 293 */                       Log.w("ExifInterface", "IOException occurred during reading a value", e);
/* 296 */                       if (il1Iii0iO != null) {
                                    try {
/* 298 */                               il1Iii0iO.close();
                                    } catch (IOException e6) {
/* 303 */                               Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                                    }
                                }
/* 7 */                         return null;
                            }
                        } catch (Throwable th) {
/* 50 */                    th = th;
/* 51 */                    inputStream2 = inputStream;
/* 307 */                   if (inputStream2 != null) {
                                try {
/* 309 */                           inputStream2.close();
                                } catch (IOException e7) {
/* 314 */                           Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                                }
                            }
/* 317 */                   throw th;
                        }
                    } catch (IOException e8) {
/* 289 */               e = e8;
/* 290 */               il1Iii0iO = null;
                    } catch (Throwable th2) {
/* 287 */               th = th2;
/* 307 */               if (inputStream2 != null) {
                        }
/* 317 */               throw th;
                    }
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("(");
/* 14 */            sb.append(Il1Ilio1Ol1.I00IO1oi11O[this.I00000oIO]);
/* 19 */            sb.append(", data length:");
/* 27 */            return IIl001iO0Io.I000lI(this.I0000O.length, ")", sb);
                }

/* 12 */        public Il1Iii0ii1oo(byte[] bArr, int i, int i2) {
/* 13 */            this(-1L, bArr, i, i2);
                }
            }
