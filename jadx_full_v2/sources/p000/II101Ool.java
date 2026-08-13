            package p000;

            import java.io.IOException;
            import java.io.InputStream;
            import java.io.OutputStream;
            import java.util.zip.DataFormatException;
            import java.util.zip.Inflater;
            
/* 8 */     public final class II101Ool extends InputStream {
                public final int I00iOIl;
                public final Object I00iiI;

                public II101Ool(OOll1l0ll oOll1l0ll, IOOOIO1O ioooio1o) {
/* 2 */             this.I00iOIl = 4;
/* 4 */             this.I00iiI = ioooio1o;
                }

                @Override
                public int available() throws IOException {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj = this.I00iiI;
                    switch (i) {
                        case 1:
/* 41 */                    return ((II101Ool) obj).available();
                        case 2:
/* 13 */                    OOliO0 oOliO0 = (OOliO0) obj;
/* 17 */                    if (!oOliO0.I00iiO) {
/* 30 */                        return (int) Math.min(oOliO0.I00iiI.I00iiI, 2147483647L);
                            }
/* 34 */                    IioIoO10iOiI.I000OOo1O("closed");
/* 37 */                    return 0;
                        default:
/* 8 */                     return super.available();
                    }
                }

                @Override
                public void close() throws IOException {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj = this.I00iiI;
                    switch (i) {
                        case 0:
/* 29 */                    iOiOO1O1.I00000oIO((IIIoloiiI1) obj);
                            break;
                        case 1:
/* 18 */                    super.close();
/* 23 */                    ((II101Ool) obj).close();
                            break;
                        case 2:
/* 14 */                    ((OOliO0) obj).close();
                            break;
                        default:
/* 8 */                     super.close();
                            break;
                    }
                }

                @Override
                public final int read(byte[] bArr, int i, int i2) throws DataFormatException, IOException {
/* 1 */             int i3 = this.I00iOIl;
/* 5 */             Object obj = this.I00iiI;
                    switch (i3) {
                        case 0:
/* 161 */                   IIIoloiiI1 iIIoloiiI1 = (IIIoloiiI1) obj;
/* 167 */                   if (!iIIoloiiI1.I000O01llI0()) {
/* 178 */                       if (iIIoloiiI1.I000II().I00II0Ol1O0l()) {
/* 187 */                           iOi1IOoIO0l.I00000oOI(new I0II0OiI(iIIoloiiI1, (IOoil1iiIilo) null, 6));
                                }
/* 190 */                       III1oo00i1li iII1oo00i1liI000II = iIIoloiiI1.I000II();
/* 194 */                       iII1oo00i1liI000II.getClass();
/* 209 */                       int iI0000Il00O = iIIoloiiI1.I000II().I0000Il00O(bArr, i, Math.min((int) iII1oo00i1liI000II.I00iiO, i2) + i);
/* 213 */                       if (iI0000Il00O >= 0) {
/* 215 */                           return iI0000Il00O;
                                }
/* 221 */                       if (!iIIoloiiI1.I000O01llI0()) {
/* 3 */                             return 0;
                                }
                            }
/* 4 */                     return -1;
                        case 1:
/* 156 */                   return ((II101Ool) obj).read(bArr, i, i2);
                        case 2:
/* 104 */                   OOliO0 oOliO0 = (OOliO0) obj;
/* 106 */                   III1o0lOio0 iII1o0lOio0 = oOliO0.I00iiI;
/* 110 */                   if (oOliO0.I00iiO) {
/* 150 */                       IioIoO10iOiI.I000OOo1O("closed");
/* 3 */                         return 0;
                            }
/* 116 */                   iO1oO1OoOoii.I00000oOI(bArr.length, i, i2);
/* 125 */                   if (iII1o0lOio0.I00iiI == 0 && oOliO0.I00iOIl.read(iII1o0lOio0, 8192L) == -1) {
/* 4 */                         return -1;
                            }
/* 143 */                   return iII1o0lOio0.read(bArr, i, i2);
                        case 3:
/* 21 */                    Inflater inflater = (Inflater) ((OOll1l0ll) obj).I00iiI;
                            try {
/* 23 */                        int iInflate = inflater.inflate(bArr, i, i2);
/* 27 */                        if (iInflate > 0) {
/* 29 */                            return iInflate;
                                }
/* 31 */                        if (i2 == 0) {
/* 3 */                             return 0;
                                }
/* 37 */                        if (inflater.getRemaining() == 0) {
/* 4 */                             return -1;
                                }
/* 43 */                        int remaining = inflater.getRemaining();
/* 68 */                        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 70 + String.valueOf(remaining).length());
/* 73 */                        sb.append("Read no bytes (requested up to ");
/* 76 */                        sb.append(i2);
/* 81 */                        sb.append(") but did not reach end of stream, had ");
/* 84 */                        sb.append(remaining);
/* 94 */                        throw new IOException(sb.toString());
                            } catch (DataFormatException e) {
/* 103 */                       throw new IOException(e);
                            }
                        default:
/* 12 */                    return ((IOOOIO1O) obj).I00II0oii1o(bArr, i, i2);
                    }
                }

                @Override
                public long skip(long j) {
                    switch (this.I00iOIl) {
                        case 4:
/* 15 */                    if (j <= 0) {
/* 11 */                        return 0L;
                            }
/* 29 */                    int i = j > 2147483647L ? Integer.MAX_VALUE : (int) j;
/* 34 */                    ((IOOOIO1O) this.I00iiI).I00IO1(i);
/* 37 */                    return i;
                        default:
/* 6 */                     return super.skip(j);
                    }
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 2:
/* 28 */                    return ((OOliO0) this.I00iiI) + ".inputStream()";
                        default:
/* 6 */                     return super.toString();
                    }
                }

                @Override
                public long transferTo(OutputStream outputStream) throws IOException {
                    switch (this.I00iOIl) {
                        case 2:
/* 13 */                    OOliO0 oOliO0 = (OOliO0) this.I00iiI;
/* 15 */                    III1o0lOio0 iII1o0lOio0 = oOliO0.I00iiI;
/* 21 */                    if (oOliO0.I00iiO) {
/* 109 */                       IioIoO10iOiI.I000OOo1O("closed");
/* 19 */                        return 0L;
                            }
/* 23 */                    long j = 0;
                            while (true) {
/* 28 */                        if (iII1o0lOio0.I00iiI == 0 && oOliO0.I00iOIl.read(iII1o0lOio0, 8192L) == -1) {
/* 45 */                            return j;
                                }
/* 47 */                        long j2 = iII1o0lOio0.I00iiI;
/* 49 */                        j += j2;
/* 53 */                        iO1oO1OoOoii.I00000oOI(j2, 0L, j2);
/* 56 */                        Oii1OOIOo oii1OOIOo = iII1o0lOio0.I00iOIl;
/* 60 */                        while (j2 > 0) {
/* 72 */                            int iMin = (int) Math.min(j2, oii1OOIOo.I0000Il00O - oii1OOIOo.I00000oOI);
/* 77 */                            outputStream.write(oii1OOIOo.I00000oIO, oii1OOIOo.I00000oOI, iMin);
/* 82 */                            int i = oii1OOIOo.I00000oOI + iMin;
/* 83 */                            oii1OOIOo.I00000oOI = i;
                                    long j3 = iMin;
                                    iII1o0lOio0.I00iiI -= j3;
/* 91 */                            j2 -= j3;
/* 94 */                            if (i == oii1OOIOo.I0000Il00O) {
/* 96 */                                Oii1OOIOo oii1OOIOoI00000oIO = oii1OOIOo.I00000oIO();
/* 100 */                               iII1o0lOio0.I00iOIl = oii1OOIOoI00000oIO;
/* 102 */                               Oii1iI10.I00000oIO(oii1OOIOo);
/* 105 */                               oii1OOIOo = oii1OOIOoI00000oIO;
                                    }
                                }
                            }
                            break;
                        default:
/* 6 */                     return super.transferTo(outputStream);
                    }
                }

/* 9 */         public II101Ool(Object obj, int i) {
/* 10 */            this.I00iOIl = i;
                    this.I00iiI = obj;
                }

                @Override
/* 224 */       public final int read() throws IOException {
                    int i = this.I00iOIl;
                    Object obj = this.I00iiI;
                    switch (i) {
                        case 0:
/* 233 */                   IIIoloiiI1 iIIoloiiI1 = (IIIoloiiI1) obj;
                            if (iIIoloiiI1.I000O01llI0()) {
                                return -1;
                            }
/* 234 */                   if (iIIoloiiI1.I000II().I00II0Ol1O0l()) {
/* 236 */                       iOi1IOoIO0l.I00000oOI(new I0II0OiI(iIIoloiiI1, (IOoil1iiIilo) null, 6));
                            }
/* 237 */                   if (iIIoloiiI1.I000O01llI0()) {
                                return -1;
                            }
/* 238 */                   return iIIoloiiI1.I000II().readByte() & 255;
                        case 1:
/* 232 */                   return ((II101Ool) obj).read();
                        case 2:
/* 227 */                   OOliO0 oOliO0 = (OOliO0) obj;
                            III1o0lOio0 iII1o0lOio0 = oOliO0.I00iiI;
                            if (oOliO0.I00iiO) {
/* 231 */                       IioIoO10iOiI.I000OOo1O("closed");
                                return 0;
                            }
                            if (iII1o0lOio0.I00iiI == 0 && oOliO0.I00iOIl.read(iII1o0lOio0, 8192L) == -1) {
                                return -1;
                            }
/* 230 */                   return iII1o0lOio0.readByte() & 255;
                        case 3:
/* 226 */                   byte[] bArr = new byte[1];
                            if (read(bArr, 0, 1) == -1) {
                                return -1;
                            }
                            return bArr[0];
                        default:
                            byte[] bArr2 = new byte[1];
/* 225 */                   if (((IOOOIO1O) obj).I00II0oii1o(bArr2, 0, 1) == -1) {
                                return -1;
                            }
                            return bArr2[0];
                    }
                }
            }
