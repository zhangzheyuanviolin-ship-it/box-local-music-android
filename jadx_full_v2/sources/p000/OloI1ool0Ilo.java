            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.ByteArrayOutputStream;
            import java.io.FileInputStream;
            import java.io.FilterInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.nio.charset.Charset;
            import java.nio.charset.UnsupportedCharsetException;
            import java.nio.file.attribute.FileTime;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Comparator;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.stream.Collectors;
            
/* 95 */    public final class OloI1ool0Ilo extends FilterInputStream {
                public final byte[] I00iOIl;
                public long I00iiI;
                public final byte[] I00iiO;
                public final byte[] I00iio;
                public boolean I00ilI0I1;
                public long I00ilO0;
                public long I00io1l;
                public ArrayList I00ioIO;
                public int I00l0I0l0lO1;
                public OloI1l I00l0OO0IO;
                public final OIIl00o10 I00li1OI;
                public HashMap I00ll1;
                public final ArrayList I00lli11;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OloI1ool0Ilo(I1lllO i1lllO) {
/* 7 */             super(i1lllO);
/* 1 */             int i = IO1IOO.I00000oIO;
/* 3 */             Charset charsetDefaultCharset = Charset.defaultCharset();
/* 13 */            this.I00iOIl = new byte[1];
/* 15 */            if (charsetDefaultCharset == null) {
/* 17 */                Charset.defaultCharset();
                    }
/* 24 */            this.I00iiO = new byte[Barcode.FORMAT_QR_CODE];
/* 31 */            this.I00ll1 = new HashMap();
/* 38 */            this.I00lli11 = new ArrayList();
/* 40 */            int i2 = i0I0OI0I00o.I00000oIO;
/* 44 */            Charset charsetDefaultCharset2 = Charset.defaultCharset();
                    try {
/* 48 */                charsetDefaultCharset2 = Charset.defaultCharset();
                    } catch (UnsupportedCharsetException unused) {
                    }
/* 52 */            Charset charsetDefaultCharset3 = Charset.defaultCharset();
                    try {
/* 56 */                int i3 = IO1IOO.I00000oIO;
/* 58 */                charsetDefaultCharset3 = Charset.defaultCharset();
                    } catch (UnsupportedCharsetException unused2) {
                    }
/* 62 */            String strName = charsetDefaultCharset3.name();
/* 84 */            this.I00li1OI = new OIIl00o10(charsetDefaultCharset2, i0I0OI0I00o.I00000oOI(strName == null ? Charset.defaultCharset().name() : strName));
/* 90 */            this.I00iio = new byte[Barcode.FORMAT_UPC_A];
                }

                public final void I00000oIO(ArrayList arrayList, HashMap map) throws IOException {
                    String str;
                    String str2;
/* 1 */             OloI1l oloI1l = this.I00l0OO0IO;
/* 3 */             oloI1l.getClass();
/* 18 */            for (Map.Entry entry : map.entrySet()) {
/* 30 */                str = (String) entry.getKey();
/* 36 */                str2 = (String) entry.getValue();
/* 38 */                str.getClass();
                        switch (str) {
                            case "SCHILY.devmajor":
/* 479 */                       int iI00000oIO = l1oioiOo.I00000oIO(str2);
/* 483 */                       if (iI00000oIO >= 0) {
/* 485 */                           if (iI00000oIO < 0) {
/* 495 */                               I000II.I000iOII(Oi010OO0.I000oI1ioi(iI00000oIO, "Major device number is out of range: "));
/* 498 */                               return;
                                    }
                                    break;
                                } else {
/* 501 */                           IioIoO10iOiI.I000OOo1O("Corrupted TAR archive. Dev-Major is negative");
/* 504 */                           return;
                                }
                            case "SCHILY.devminor":
/* 453 */                       int iI00000oIO2 = l1oioiOo.I00000oIO(str2);
/* 457 */                       if (iI00000oIO2 >= 0) {
/* 459 */                           if (iI00000oIO2 < 0) {
/* 469 */                               I000II.I000iOII(Oi010OO0.I000oI1ioi(iI00000oIO2, "Minor device number is out of range: "));
/* 472 */                               return;
                                    }
                                    break;
                                } else {
/* 475 */                           IioIoO10iOiI.I000OOo1O("Corrupted TAR archive. Dev-Minor is negative");
/* 478 */                           return;
                                }
                            case "GNU.sparse.realsize":
/* 414 */                       oloI1l.I000II = true;
/* 416 */                       oloI1l.I000O01llI0 = true;
/* 422 */                       if (map.containsKey("GNU.sparse.name")) {
/* 430 */                           oloI1l.I00000oIO = (String) map.get("GNU.sparse.name");
                                }
/* 436 */                       if (map.containsKey("GNU.sparse.realsize")) {
/* 449 */                           oloI1l.I0001Ioi1lo = l1oioiOo.I00000oIO((String) map.get("GNU.sparse.realsize"));
                                    break;
                                } else {
                                    break;
                                }
                            case "GNU.sparse.size":
/* 383 */                       oloI1l.I000II = true;
/* 396 */                       oloI1l.I0001Ioi1lo = l1oioiOo.I00000oIO((String) map.get("GNU.sparse.size"));
/* 402 */                       if (map.containsKey("GNU.sparse.name")) {
/* 410 */                           oloI1l.I00000oIO = (String) map.get("GNU.sparse.name");
                                    break;
                                } else {
                                    break;
                                }
                            case "gid":
/* 378 */                       l1oioiOo.I00000oOI(str2);
                                break;
                            case "uid":
/* 373 */                       l1oioiOo.I00000oOI(str2);
                                break;
                            case "path":
/* 368 */                       oloI1l.I000II(str2);
                                break;
                            case "size":
/* 336 */                       long jI00000oOI = l1oioiOo.I00000oOI(str2);
/* 344 */                       if (jI00000oOI >= 0) {
/* 346 */                           if (jI00000oOI >= 0) {
/* 348 */                               oloI1l.I00000oOI = jI00000oOI;
                                        break;
                                    } else {
/* 358 */                               I000II.I000iOII(IlIi0I0.I000iOII(jI00000oOI, "Size is out of range: "));
/* 361 */                               return;
                                    }
                                } else {
/* 364 */                           IioIoO10iOiI.I000OOo1O("Corrupted TAR archive. Entry size is negative");
/* 367 */                           return;
                                }
                            case "atime":
/* 331 */                       FileTime.from(OloI1l.I0000oI00(str2));
                                break;
                            case "ctime":
/* 322 */                       FileTime.from(OloI1l.I0000oI00(str2));
                                break;
                            case "gname":
                            case "uname":
                            case "linkpath":
                                break;
                            case "mtime":
/* 313 */                       Objects.requireNonNull(FileTime.from(OloI1l.I0000oI00(str2)), "time");
                                break;
                            case "LIBARCHIVE.creationtime":
/* 298 */                       FileTime.from(OloI1l.I0000oI00(str2));
                                break;
                            case "SCHILY.filetype":
/* 268 */                       if ("sparse".equals(str2)) {
/* 270 */                           oloI1l.I000OOo1O = true;
/* 278 */                           if (map.containsKey("SCHILY.realsize")) {
/* 290 */                               oloI1l.I0001Ioi1lo = l1oioiOo.I00000oOI((String) map.get("SCHILY.realsize"));
                                        break;
                                    } else {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            default:
/* 257 */                       oloI1l.I000OiO.put(str, str2);
                                break;
                        }
                    }
/* 507 */           this.I00l0OO0IO.I0000O = arrayList;
                }

                public final void I0000Il00O() throws IOException {
                    List<OloII110OI0> list;
/* 2 */             this.I00l0I0l0lO1 = -1;
/* 9 */             this.I00ioIO = new ArrayList();
/* 11 */            OloI1l oloI1l = this.I00l0OO0IO;
/* 13 */            ArrayList arrayList = oloI1l.I0000O;
/* 18 */            if (arrayList == null || arrayList.isEmpty()) {
/* 190 */               list = Collections.EMPTY_LIST;
                    } else {
/* 64 */                list = (List) oloI1l.I0000O.stream().filter(new OloI0lIOOil0()).sorted(Comparator.comparingLong(new OloI1i())).collect(Collectors.toList());
/* 66 */                int size = list.size();
/* 70 */                int i = 0;
/* 71 */                while (i < size) {
/* 77 */                    OloII110OI0 oloII110OI0 = (OloII110OI0) list.get(i);
/* 79 */                    i++;
/* 81 */                    if (i < size && oloII110OI0.I00000oIO + oloII110OI0.I00000oOI > ((OloII110OI0) list.get(i)).I00000oIO) {
/* 116 */                       IioIoO10iOiI.I000OOo1O(IIl001iO0Io.I00100l0(new StringBuilder("Corrupted TAR archive. Sparse blocks for "), oloI1l.I00000oIO, " overlap each other."));
/* 119 */                       return;
                            } else if (oloII110OI0.I00000oIO + oloII110OI0.I00000oOI < 0) {
/* 145 */                       IioIoO10iOiI.I000OOo1O(IIl001iO0Io.I00100l0(new StringBuilder("Unreadable TAR archive. Offset and numbytes for sparse block in "), oloI1l.I00000oIO, " too large."));
/* 148 */                       return;
                            }
                        }
/* 153 */               if (!list.isEmpty()) {
/* 161 */                   OloII110OI0 oloII110OI02 = (OloII110OI0) list.get(size - 1);
/* 181 */                   if (oloII110OI02.I00000oIO + oloII110OI02.I00000oOI > (!oloI1l.I0000O() ? oloI1l.I00000oOI : oloI1l.I0001Ioi1lo)) {
/* 186 */                       IioIoO10iOiI.I000OOo1O("Corrupted TAR archive. Sparse block extends beyond real size of the entry");
/* 189 */                       return;
                            }
                        }
                    }
/* 194 */           OloII0 oloII0 = new OloII0();
/* 201 */           long j = 0;
/* 206 */           for (OloII110OI0 oloII110OI03 : list) {
/* 216 */               long j2 = oloII110OI03.I00000oIO - j;
/* 219 */               if (j2 < 0) {
/* 261 */                   IioIoO10iOiI.I000OOo1O("Corrupted struct sparse detected");
/* 264 */                   return;
                        }
/* 221 */               if (j2 > 0) {
/* 230 */                   this.I00ioIO.add(new II1Ool(oloII0, j2));
                        }
/* 237 */               if (oloII110OI03.I00000oOI > 0) {
/* 250 */                   this.I00ioIO.add(new II1Ool(((FilterInputStream) this).in, oloII110OI03.I00000oOI));
                        }
/* 257 */               j = oloII110OI03.I00000oIO + oloII110OI03.I00000oOI;
                    }
/* 271 */           if (this.I00ioIO.isEmpty()) {
/* 541 */               return;
                    }
/* 273 */           this.I00l0I0l0lO1 = 0;
                }

                public final void I000II(long j) {
/* 5 */             if (j != -1) {
                        this.I00iiI += j;
                    }
                }

                public final byte[] I000O01llI0() throws IOException {
/* 3 */             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
/* 6 */                 byte[] bArr = this.I00iiO;
/* 8 */                 int i = read(bArr);
/* 12 */                if (i < 0) {
                            break;
                        }
/* 15 */                byteArrayOutputStream.write(bArr, 0, i);
                    }
/* 19 */            I000l1();
/* 24 */            if (this.I00l0OO0IO == null) {
/* 26 */                return null;
                    }
/* 28 */            byte[] byteArray = byteArrayOutputStream.toByteArray();
/* 32 */            int length = byteArray.length;
/* 33 */            while (length > 0 && byteArray[length - 1] == 0) {
                        length--;
                    }
                    return length != byteArray.length ? Arrays.copyOf(byteArray, length) : byteArray;
                }

                /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00d7  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x00fd  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x0100 A[Catch: NumberFormatException -> 0x0104, TryCatch #0 {NumberFormatException -> 0x0104, blocks: (B:49:0x00ef, B:57:0x0100, B:60:0x0106, B:62:0x010e), top: B:86:0x00ef }] */
                /* JADX WARN: Removed duplicated region for block: B:60:0x0106 A[Catch: NumberFormatException -> 0x0104, TryCatch #0 {NumberFormatException -> 0x0104, blocks: (B:49:0x00ef, B:57:0x0100, B:60:0x0106, B:62:0x010e), top: B:86:0x00ef }] */
                /* JADX WARN: Removed duplicated region for block: B:65:0x011d  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final OloI1l I000l1() throws IOException {
                    OloI1l oloI1l;
                    byte b;
                    OloI1l oloI1l2;
                    boolean z;
/* 4 */             if (!this.I00ilI0I1) {
/* 13 */                if (this.I00l0OO0IO != null) {
/* 25 */                    IoOlilOO.I00000oIO(this, Long.MAX_VALUE, new IoOlii0(1));
/* 32 */                    if (!I001i1lo1io()) {
/* 34 */                        long j = this.I00ilO0;
/* 38 */                        if (j > 0 && j % this.I00iio.length != 0) {
/* 51 */                            long jAvailable = ((FilterInputStream) this).in.available();
/* 56 */                            long j2 = this.I00ilO0;
/* 58 */                            byte[] bArr = this.I00iio;
/* 70 */                            long length = (((j2 / bArr.length) + 1) * bArr.length) - j2;
/* 78 */                            long jI00000oIO = IoOlilOO.I00000oIO(((FilterInputStream) this).in, length, new IoOlii0(1));
/* 86 */                            if (((FilterInputStream) this).in instanceof FileInputStream) {
/* 88 */                                jI00000oIO = Math.min(jI00000oIO, jAvailable);
                                    }
/* 94 */                            if (jI00000oIO != length) {
/* 102 */                               IioIoO10iOiI.I000OOo1O("Truncated TAR archive");
/* 3 */                                 return null;
                                    }
/* 96 */                            I000II(jI00000oIO);
                                }
                            }
                        }
/* 106 */               byte[] bArrI00100l0 = I00100l0();
/* 110 */               if (bArrI00100l0 == null) {
/* 112 */                   this.I00l0OO0IO = null;
/* 3 */                     return null;
                        }
                        try {
/* 121 */                   OloI1l oloI1l3 = new OloI1l(this.I00ll1, bArrI00100l0, this.I00li1OI);
/* 124 */                   this.I00l0OO0IO = oloI1l3;
/* 126 */                   this.I00io1l = 0L;
/* 130 */                   this.I00ilO0 = oloI1l3.I00000oOI;
/* 136 */                   if (oloI1l3.I0000Il00O != 75) {
/* 161 */                       if (this.I00l0OO0IO.I0000Il00O == 76) {
/* 163 */                           byte[] bArrI000O01llI0 = I000O01llI0();
/* 167 */                           if (bArrI000O01llI0 != null) {
/* 172 */                               String strI00000oOI = this.I00li1OI.I00000oOI(bArrI000O01llI0);
/* 178 */                               this.I00l0OO0IO.I000II(strI00000oOI);
/* 187 */                               if (this.I00l0OO0IO.I00000oOI() && !strI00000oOI.endsWith("/")) {
/* 203 */                                   this.I00l0OO0IO.I000II(strI00000oOI.concat("/"));
                                        }
                                    }
                                }
/* 206 */                       oloI1l = this.I00l0OO0IO;
/* 214 */                       if (oloI1l.I0000Il00O == 103) {
/* 226 */                           this.I00ll1 = OloII1oI.I0000oI00(this, this.I00lli11, this.I00ll1, this.I00ilO0);
/* 228 */                           I000l1();
/* 231 */                           oloI1l = this.I00l0OO0IO;
/* 233 */                           if (oloI1l == null) {
/* 236 */                               IioIoO10iOiI.I000OOo1O("Error detected parsing the pax header");
/* 3 */                                 return null;
                                    }
                                }
                                try {
/* 240 */                           b = oloI1l.I0000Il00O;
/* 255 */                           if (!(b != 120 || b == 88)) {
/* 257 */                               I001l0I00();
                                    } else if (!this.I00ll1.isEmpty()) {
/* 275 */                               I00000oIO(this.I00lli11, this.I00ll1);
                                    }
/* 278 */                           oloI1l2 = this.I00l0OO0IO;
/* 284 */                           if (oloI1l2.I0000Il00O == 83) {
/* 288 */                               if (oloI1l2.I0000oI00) {
/* 323 */                                   do {
/* 290 */                                       byte[] bArrI00100l02 = I00100l0();
/* 294 */                                       if (bArrI00100l02 == null) {
/* 328 */                                           IioIoO10iOiI.I000OOo1O("premature end of tar archive. Didn't find extended_header after header with extended flag.");
/* 3 */                                             return null;
                                                }
/* 304 */                                       ArrayList arrayList = new ArrayList(OloII1oI.I000II(bArrI00100l02, 0, 21));
/* 315 */                                       z = bArrI00100l02[504] == 1;
/* 320 */                                       this.I00l0OO0IO.I0000O.addAll(arrayList);
/* 323 */                                   } while (z);
                                        }
/* 332 */                               I0000Il00O();
                                    }
/* 335 */                           OloI1l oloI1l4 = this.I00l0OO0IO;
/* 339 */                           this.I00ilO0 = oloI1l4.I00000oOI;
/* 341 */                           return oloI1l4;
                                } catch (NumberFormatException e) {
/* 347 */                           throw new IOException("Error detected parsing the pax header", e);
                                }
                            }
/* 138 */                   byte[] bArrI000O01llI02 = I000O01llI0();
/* 142 */                   if (bArrI000O01llI02 != null) {
/* 145 */                       OloI1l oloI1l5 = this.I00l0OO0IO;
/* 149 */                       this.I00li1OI.I00000oOI(bArrI000O01llI02);
/* 152 */                       oloI1l5.getClass();
/* 161 */                       if (this.I00l0OO0IO.I0000Il00O == 76) {
                                }
/* 206 */                       oloI1l = this.I00l0OO0IO;
/* 214 */                       if (oloI1l.I0000Il00O == 103) {
                                }
/* 240 */                       b = oloI1l.I0000Il00O;
/* 255 */                       if (!(b != 120 || b == 88)) {
                                }
/* 278 */                       oloI1l2 = this.I00l0OO0IO;
/* 284 */                       if (oloI1l2.I0000Il00O == 83) {
                                }
/* 335 */                       OloI1l oloI1l42 = this.I00l0OO0IO;
/* 339 */                       this.I00ilO0 = oloI1l42.I00000oOI;
/* 341 */                       return oloI1l42;
                            }
                        } catch (IllegalArgumentException e2) {
/* 541 */                   throw new IOException("Error detected parsing the header", e2);
                        }
                    }
/* 3 */             return null;
                }

                public final byte[] I00100l0() throws IOException {
                    boolean z;
/* 1 */             byte[] bArrI00IOO = I00IOO();
/* 5 */             boolean z2 = false;
/* 7 */             if (bArrI00IOO != null) {
/* 11 */                int length = this.I00iio.length;
/* 13 */                for (int i = 0; i < length; i++) {
/* 17 */                    if (bArrI00IOO[i] != 0) {
/* 19 */                        z = false;
                                break;
                            }
                        }
/* 24 */                z = true;
                    } else {
/* 24 */                z = true;
                    }
/* 25 */            this.I00ilI0I1 = z;
/* 27 */            if (!z || bArrI00IOO == null) {
/* 541 */               return bArrI00IOO;
                    }
/* 33 */            boolean zMarkSupported = ((FilterInputStream) this).in.markSupported();
/* 37 */            if (zMarkSupported) {
/* 44 */                ((FilterInputStream) this).in.mark(this.I00iio.length);
                    }
                    try {
/* 47 */                byte[] bArrI00IOO2 = I00IOO();
/* 51 */                if (bArrI00IOO2 != null) {
/* 55 */                    int length2 = this.I00iio.length;
/* 57 */                    for (int i2 = 0; i2 < length2; i2++) {
/* 61 */                        if (bArrI00IOO2[i2] != 0) {
                                    break;
                                }
                            }
/* 67 */                    z2 = true;
                        } else {
/* 67 */                    z2 = true;
                        }
/* 68 */                if (!z2 && zMarkSupported) {
                        }
/* 90 */                long j = this.I00iiI % 10240;
/* 95 */                if (j <= 0) {
/* 112 */                   return null;
                        }
/* 109 */               I000II(IoOlilOO.I00000oIO(((FilterInputStream) this).in, 10240 - j, new IoOlii0(1)));
/* 112 */               return null;
                    } finally {
/* 115 */               if (zMarkSupported) {
                            this.I00iiI -= this.I00iio.length;
/* 128 */                   ((FilterInputStream) this).in.reset();
                        }
                    }
                }

                public final boolean I001i1lo1io() {
/* 1 */             OloI1l oloI1l = this.I00l0OO0IO;
                    return oloI1l != null && oloI1l.I00000oOI();
                }

                public final void I001l0I00() throws IOException {
/* 5 */             ArrayList arrayList = new ArrayList();
/* 12 */            HashMap mapI0000oI00 = OloII1oI.I0000oI00(this, arrayList, this.I00ll1, this.I00ilO0);
/* 23 */            char c = 1;
/* 24 */            long j = 0;
/* 26 */            if (mapI0000oI00.containsKey("GNU.sparse.map")) {
/* 34 */                String str = (String) mapI0000oI00.get("GNU.sparse.map");
/* 38 */                ArrayList arrayList2 = new ArrayList();
/* 43 */                String[] strArrSplit = str.split(",");
/* 50 */                if (strArrSplit.length % 2 == 1) {
/* 111 */                   IioIoO10iOiI.I000OOo1O("Corrupted TAR archive. Bad format in GNU.sparse.map PAX Header");
/* 114 */                   return;
                        }
/* 54 */                for (int i = 0; i < strArrSplit.length; i += 2) {
/* 58 */                    long jI00000oOI = l1oioiOo.I00000oOI(strArrSplit[i]);
/* 64 */                    if (jI00000oOI < 0) {
/* 97 */                        IioIoO10iOiI.I000OOo1O("Corrupted TAR archive. Sparse struct offset contains negative value");
/* 100 */                       return;
                            }
/* 70 */                    long jI00000oOI2 = l1oioiOo.I00000oOI(strArrSplit[i + 1]);
/* 76 */                    if (jI00000oOI2 < 0) {
/* 91 */                        IioIoO10iOiI.I000OOo1O("Corrupted TAR archive. Sparse struct numbytes contains negative value");
/* 94 */                        return;
                            }
/* 83 */                    arrayList2.add(new OloII110OI0(jI00000oOI, jI00000oOI2));
                        }
/* 105 */               arrayList = new ArrayList(Collections.unmodifiableList(arrayList2));
                    }
/* 115 */           I000l1();
/* 120 */           if (this.I00l0OO0IO == null) {
/* 244 */               IioIoO10iOiI.I000OOo1O("premature end of tar archive. Didn't find any entry after PAX header.");
/* 541 */               return;
                    }
/* 122 */           I00000oIO(arrayList, mapI0000oI00);
/* 129 */           if (this.I00l0OO0IO.I000O01llI0) {
/* 131 */               InputStream inputStream = ((FilterInputStream) this).in;
/* 135 */               int length = this.I00iio.length;
/* 138 */               ArrayList arrayList3 = new ArrayList();
/* 141 */               long[] jArrI0001Ioi1lo = OloII1oI.I0001Ioi1lo(inputStream);
/* 145 */               long j2 = jArrI0001Ioi1lo[0];
/* 149 */               if (j2 < 0) {
/* 234 */                   IioIoO10iOiI.I000OOo1O("Corrupted TAR archive. Negative value in sparse headers block");
/* 237 */                   return;
                        }
/* 151 */               long j3 = jArrI0001Ioi1lo[1];
                        while (true) {
/* 155 */                   long j4 = j2 - 1;
/* 159 */                   if (j2 <= j) {
                                long j5 = length;
/* 224 */                       IoOlilOO.I00000oIO(inputStream, j5 - (j3 % j5), new IoOlii0(0));
/* 229 */                       this.I00l0OO0IO.I0000O = arrayList3;
                                break;
                            }
/* 161 */                   long[] jArrI0001Ioi1lo2 = OloII1oI.I0001Ioi1lo(inputStream);
/* 165 */                   long j6 = jArrI0001Ioi1lo2[0];
/* 169 */                   if (j6 < j) {
/* 212 */                       IioIoO10iOiI.I000OOo1O("Corrupted TAR archive. Sparse header block offset contains negative value");
/* 215 */                       return;
                            }
/* 173 */                   long j7 = j3 + jArrI0001Ioi1lo2[c];
/* 174 */                   long[] jArrI0001Ioi1lo3 = OloII1oI.I0001Ioi1lo(inputStream);
/* 178 */                   char c2 = c;
/* 179 */                   long j8 = j;
/* 181 */                   long j9 = jArrI0001Ioi1lo3[0];
/* 185 */                   if (j9 < j8) {
/* 206 */                       IioIoO10iOiI.I000OOo1O("Corrupted TAR archive. Sparse header block numbytes contains negative value");
/* 209 */                       return;
                            }
/* 189 */                   j3 = j7 + jArrI0001Ioi1lo3[c2];
/* 196 */                   arrayList3.add(new OloII110OI0(j6, j9));
/* 199 */                   j2 = j4;
/* 200 */                   c = c2;
/* 201 */                   j = j8;
                        }
                    }
/* 238 */           I0000Il00O();
                }

                public final byte[] I00IOO() throws IOException {
                    int i;
/* 1 */             InputStream inputStream = ((FilterInputStream) this).in;
/* 3 */             byte[] bArr = this.I00iio;
/* 5 */             int length = bArr.length;
/* 7 */             if (length < 0 || length > bArr.length || length < 0) {
/* 63 */                OoOil11Ol1o.I001i1lo1io();
/* 6 */                 return null;
                    }
/* 14 */            byte[] bArr2 = IoOlilOO.I00000oIO;
/* 16 */            if (length == 0) {
/* 18 */                i = 0;
                    } else {
/* 20 */                Objects.requireNonNull(inputStream);
/* 23 */                if (length < 0) {
/* 59 */                    I000II.I000iOII(Oi010OO0.I000oI1ioi(length, "Length must not be negative: "));
/* 6 */                     return null;
                        }
/* 25 */                int i2 = length;
/* 26 */                while (i2 > 0) {
/* 30 */                    int i3 = inputStream.read(bArr, length - i2, i2);
/* 35 */                    if (-1 == i3) {
                                break;
                            }
/* 38 */                    i2 -= i3;
                        }
/* 40 */                i = length - i2;
                    }
/* 43 */            I000II(i);
/* 46 */            byte[] bArr3 = this.I00iio;
/* 49 */            if (i != bArr3.length) {
/* 6 */                 return null;
                    }
/* 52 */            return bArr3;
                }

                public final int I00IioO0OiOi(byte[] bArr, int i, int i2) throws IOException {
/* 1 */             ArrayList arrayList = this.I00ioIO;
/* 3 */             if (arrayList == null || arrayList.isEmpty()) {
/* 85 */                return ((FilterInputStream) this).in.read(bArr, i, i2);
                    }
/* 21 */            if (this.I00l0I0l0lO1 >= this.I00ioIO.size()) {
/* 20 */                return -1;
                    }
/* 34 */            int i3 = ((InputStream) this.I00ioIO.get(this.I00l0I0l0lO1)).read(bArr, i, i2);
/* 48 */            if (this.I00l0I0l0lO1 == this.I00ioIO.size() - 1) {
/* 82 */                return i3;
                    }
/* 51 */            if (i3 == -1) {
                        this.I00l0I0l0lO1++;
/* 59 */                return I00IioO0OiOi(bArr, i, i2);
                    }
/* 64 */            if (i3 >= i2) {
/* 82 */                return i3;
                    }
                    this.I00l0I0l0lO1++;
/* 74 */            int iI00IioO0OiOi = I00IioO0OiOi(bArr, i + i3, i2 - i3);
                    return iI00IioO0OiOi == -1 ? i3 : i3 + iI00IioO0OiOi;
                }

                @Override
                public final int available() {
/* 5 */             if (I001i1lo1io()) {
/* 7 */                 return 0;
                    }
/* 9 */             OloI1l oloI1l = this.I00l0OO0IO;
/* 24 */            long j = (!oloI1l.I0000O() ? oloI1l.I00000oOI : oloI1l.I0001Ioi1lo) - this.I00io1l;
/* 30 */            if (j > 2147483647L) {
/* 32 */                return Integer.MAX_VALUE;
                    }
/* 36 */            return (int) j;
                }

                @Override
                public final void close() throws IOException {
/* 1 */             ArrayList arrayList = this.I00ioIO;
/* 3 */             if (arrayList != null) {
/* 5 */                 Iterator it = arrayList.iterator();
/* 13 */                while (it.hasNext()) {
/* 21 */                    ((InputStream) it.next()).close();
                        }
                    }
/* 27 */            ((FilterInputStream) this).in.close();
                }

                @Override
                public final synchronized void mark(int i) {
                }

                @Override
                public final boolean markSupported() {
/* 1 */             return false;
                }

                @Override
                public final int read(byte[] bArr, int i, int i2) throws IOException {
/* 2 */             if (i2 == 0) {
/* 1 */                 return 0;
                    }
/* 8 */             if (!this.I00ilI0I1 && !I001i1lo1io()) {
/* 17 */                OloI1l oloI1l = this.I00l0OO0IO;
/* 19 */                if (oloI1l == null) {
/* 92 */                    I000II.I001IO000("No current tar entry");
/* 1 */                     return 0;
                        }
/* 36 */                if (this.I00io1l < (!oloI1l.I0000O() ? oloI1l.I00000oOI : oloI1l.I0001Ioi1lo)) {
/* 43 */                    int iMin = Math.min(i2, available());
/* 62 */                    int iI00IioO0OiOi = this.I00l0OO0IO.I0000O() ? I00IioO0OiOi(bArr, i, iMin) : ((FilterInputStream) this).in.read(bArr, i, iMin);
/* 66 */                    if (iI00IioO0OiOi != -1) {
                                long j = iI00IioO0OiOi;
/* 81 */                        I000II(j);
                                this.I00io1l += j;
/* 89 */                        return iI00IioO0OiOi;
                            }
/* 68 */                    if (iMin <= 0) {
/* 71 */                        this.I00ilI0I1 = true;
/* 73 */                        return iI00IioO0OiOi;
                            }
/* 76 */                    IioIoO10iOiI.I000OOo1O("Truncated TAR archive");
/* 1 */                     return 0;
                        }
                    }
/* 7 */             return -1;
                }

                @Override
                public final synchronized void reset() {
                }

                @Override
                public final long skip(long j) throws IOException {
                    long jSkip;
/* 1 */             long jSkip2 = 0;
/* 5 */             if (j <= 0 || I001i1lo1io()) {
/* 1 */                 return 0L;
                    }
/* 17 */            long jAvailable = ((FilterInputStream) this).in.available();
/* 22 */            OloI1l oloI1l = this.I00l0OO0IO;
/* 38 */            long jMin = Math.min(j, (!oloI1l.I0000O() ? oloI1l.I00000oOI : oloI1l.I0001Ioi1lo) - this.I00io1l);
/* 49 */            if (this.I00l0OO0IO.I0000O()) {
/* 83 */                ArrayList arrayList = this.I00ioIO;
/* 85 */                if (arrayList == null || arrayList.isEmpty()) {
/* 139 */                   jSkip = ((FilterInputStream) this).in.skip(jMin);
                        } else {
/* 96 */                    while (jSkip2 < jMin && this.I00l0I0l0lO1 < this.I00ioIO.size()) {
/* 124 */                       jSkip2 += ((InputStream) this.I00ioIO.get(this.I00l0I0l0lO1)).skip(jMin - jSkip2);
/* 127 */                       if (jSkip2 < jMin) {
                                    this.I00l0I0l0lO1++;
                                }
                            }
/* 135 */                   jSkip = jSkip2;
                        }
                    } else {
/* 58 */                jSkip = IoOlilOO.I00000oIO(((FilterInputStream) this).in, jMin, new IoOlii0(1));
/* 66 */                if (((FilterInputStream) this).in instanceof FileInputStream) {
/* 68 */                    jSkip = Math.min(jSkip, jAvailable);
                        }
/* 74 */                if (jSkip != jMin) {
/* 79 */                    IioIoO10iOiI.I000OOo1O("Truncated TAR archive");
/* 1 */                     return 0L;
                        }
                    }
/* 144 */           I000II(jSkip);
                    this.I00io1l += jSkip;
/* 152 */           return jSkip;
                }

                @Override
/* 96 */        public final int read() {
/* 97 */            byte[] bArr = this.I00iOIl;
                    if (read(bArr, 0, 1) == -1) {
                        return -1;
                    }
/* 98 */            return bArr[0] & 255;
                }
            }
