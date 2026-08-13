            package p000;

            import android.graphics.Paint;
            import android.graphics.Path;
            import android.util.Log;
            import java.io.BufferedInputStream;
            import java.io.IOException;
            import java.io.InputStreamReader;
            import java.io.LineNumberReader;
            import java.io.StringWriter;
            import java.lang.invoke.VarHandle;
            import java.text.Bidi;
            import java.text.Normalizer;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Deque;
            import java.util.HashMap;
            import java.util.IdentityHashMap;
            import java.util.Iterator;
            import java.util.LinkedList;
            import java.util.List;
            import java.util.StringTokenizer;
            import java.util.WeakHashMap;
            import java.util.regex.Pattern;
            
            public final class OIll0O extends O0oIO111O {
                public static final float I00Io1o110i;
                public static final float I00IoIO0lI;
                public static final String[] I00IoO0;
                public static final HashMap I00IoiI;
                public final String I000lI;
                public final String I000o00OoI0I;
                public final String I000oI1ioi;
                public final String I00100l0;
                public final String I00100o1O0lo;
                public final String I0010I0i;
                public final String I0010o;
                public final String I00111O;
                public int I001IIilI0O;
                public final int I001IO000;
                public final int I001i1O0Ol;
                public int I001i1lo1io;
                public int I001iOo1i0O;
                public final boolean I001l0I00;
                public final boolean I001lIiIIo1O;
                public final float I001lllioOl;
                public final float I001lloI;
                public final float I00II0Ol1O0l;
                public final float I00II0oii1o;
                public ArrayList I00IO1;
                public final ArrayList I00IO1oi11O;
                public final HashMap I00IOO;
                public StringWriter I00IioO0OiOi;
                public boolean I00IlilI0i0i;
                public ArrayList I00Io1lO;

                /* JADX WARN: Removed duplicated region for block: B:19:0x0083 A[Catch: all -> 0x008e, IOException -> 0x0091, TryCatch #2 {IOException -> 0x0091, blocks: (B:17:0x007d, B:19:0x0083, B:25:0x009f, B:24:0x0093), top: B:45:0x007d, outer: #6 }] */
                /* JADX WARN: Removed duplicated region for block: B:24:0x0093 A[Catch: all -> 0x008e, IOException -> 0x0091, TryCatch #2 {IOException -> 0x0091, blocks: (B:17:0x007d, B:19:0x0083, B:25:0x009f, B:24:0x0093), top: B:45:0x007d, outer: #6 }] */
                static {
                    String property;
                    String property2;
                    String lowerCase;
/* 9 */             BufferedInputStream bufferedInputStream = null;
                    try {
/* 14 */                lowerCase = OIll0O.class.getSimpleName().toLowerCase();
/* 35 */                property = System.getProperty(lowerCase + ".indent");
                    } catch (SecurityException unused) {
/* 61 */                property = null;
                    }
                    try {
/* 56 */                property2 = System.getProperty(lowerCase + ".drop");
                    } catch (SecurityException unused2) {
/* 62 */                property2 = null;
/* 63 */                if (property != null) {
                            try {
/* 75 */                        I00Io1o110i = Float.parseFloat(property);
                            } catch (NumberFormatException unused3) {
                            }
                        }
/* 77 */                if (property2 != null) {
                            try {
/* 89 */                        I00IoIO0lI = Float.parseFloat(property2);
                            } catch (NumberFormatException unused4) {
                            }
                        }
/* 115 */               I00IoO0 = new String[]{"\\.", "\\d+\\.", "\\[\\d+\\]", "\\d+\\)", "[A-Z]\\.", "[a-z]\\.", "[A-Z]\\)", "[a-z]\\)", "[IVXL]+\\.", "[ivxl]+\\."};
/* 122 */               I00IoiI = new HashMap();
                        try {
/* 156 */                   if (!l1lioOO00.I00000oOI()) {
                            }
/* 160 */                   I00100l0(bufferedInputStream);
                        } catch (IOException e) {
/* 188 */                   Log.w("PdfBox-Android", "Could not parse BidiMirroring.txt, mirroring char map will be empty: " + e.getMessage());
                        }
                        try {
/* 163 */                   bufferedInputStream.close();
                        } catch (IOException e2) {
/* 168 */                   Log.e("PdfBox-Android", "Could not close BidiMirroring.txt ", e2);
/* 192 */                   return;
                        }
                    }
/* 63 */            if (property != null && property.length() > 0) {
/* 75 */                I00Io1o110i = Float.parseFloat(property);
                    }
/* 77 */            if (property2 != null && property2.length() > 0) {
/* 89 */                I00IoIO0lI = Float.parseFloat(property2);
                    }
/* 115 */           I00IoO0 = new String[]{"\\.", "\\d+\\.", "\\[\\d+\\]", "\\d+\\)", "[A-Z]\\.", "[a-z]\\.", "[A-Z]\\)", "[a-z]\\)", "[IVXL]+\\.", "[ivxl]+\\."};
/* 122 */           I00IoiI = new HashMap();
                    try {
/* 156 */               bufferedInputStream = !l1lioOO00.I00000oOI() ? new BufferedInputStream(l1lioOO00.I00000oIO("com/tom_roush/pdfbox/resources/text/BidiMirroring.txt")) : new BufferedInputStream(OIll0O.class.getResourceAsStream("/com/tom_roush/pdfbox/resources/text/BidiMirroring.txt"));
/* 160 */               I00100l0(bufferedInputStream);
/* 163 */               bufferedInputStream.close();
                    } finally {
                    }
                }

                public OIll0O() {
/* 11 */            this.I00000oIO = new HashMap(80);
/* 18 */            this.I0000O = new ArrayDeque();
/* 21 */            this.I000II = 0;
/* 28 */            this.I000iOII = new WeakHashMap();
/* 36 */            I00000oIO(new I1oooi0ol(0));
/* 45 */            I00000oIO(new I1oooi0ol(1));
/* 54 */            I00000oIO(new I1oooi0ol(2));
/* 63 */            I00000oIO(new I1oooi0ol(3));
/* 73 */            I00000oIO(new I1oooi0ol(11));
/* 83 */            I00000oIO(new I1oooi0ol(8));
/* 92 */            I00000oIO(new I1oooi0ol(7));
/* 101 */           I00000oIO(new I1oooi0ol(6));
/* 111 */           I00000oIO(new I1oooi0ol(9));
/* 120 */           I00000oIO(new I1oooi0ol(4));
/* 129 */           I00000oIO(new I1oooi0ol(5));
/* 139 */           I00000oIO(new I1oooi0ol(10));
/* 149 */           I00000oIO(new I1oooi0ol(18));
/* 159 */           I00000oIO(new I1oooi0ol(19));
/* 169 */           I00000oIO(new I1oooi0ol(14));
/* 179 */           I00000oIO(new I1oooi0ol(12));
/* 189 */           I00000oIO(new I1oooi0ol(15));
/* 199 */           I00000oIO(new I1oooi0ol(16));
/* 209 */           I00000oIO(new I1oooi0ol(17));
/* 219 */           I00000oIO(new I1oooi0ol(13));
/* 229 */           I00000oIO(new I1oooi0ol(20));
/* 239 */           I00000oIO(new I1oooi0ol(21));
/* 244 */           String property = System.getProperty("line.separator");
/* 248 */           this.I000lI = property;
/* 252 */           this.I000o00OoI0I = " ";
/* 256 */           this.I000oI1ioi = "";
/* 258 */           this.I00100l0 = "";
/* 260 */           this.I00100o1O0lo = "";
/* 262 */           this.I0010I0i = property;
/* 264 */           this.I0010o = "";
/* 266 */           this.I00111O = "";
/* 268 */           this.I001IIilI0O = 0;
/* 271 */           this.I001IO000 = 1;
/* 276 */           this.I001i1O0Ol = Integer.MAX_VALUE;
/* 279 */           this.I001i1lo1io = -1;
/* 281 */           this.I001iOo1i0O = -1;
/* 283 */           this.I001l0I00 = true;
/* 285 */           this.I001lIiIIo1O = true;
/* 289 */           this.I001lllioOl = I00Io1o110i;
/* 293 */           this.I001lloI = I00IoIO0lI;
/* 297 */           this.I00II0Ol1O0l = 0.5f;
/* 302 */           this.I00II0oii1o = 0.3f;
/* 305 */           this.I00IO1 = null;
/* 312 */           this.I00IO1oi11O = new ArrayList();
/* 319 */           this.I00IOO = new HashMap();
/* 321 */           this.I00Io1lO = null;
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static OIlioiI01OOo I000iOII(String str, ArrayList arrayList) {
                    String strI000lI;
/* 3 */             int length = str.length();
/* 7 */             StringBuilder sb = null;
/* 8 */             int i = 0;
/* 9 */             int i2 = 0;
/* 10 */            while (i < length) {
/* 12 */                char cCharAt = str.charAt(i);
/* 19 */                if ((64256 <= cCharAt && cCharAt <= 65023) || (65136 <= cCharAt && cCharAt <= 65279)) {
/* 36 */                    if (sb == null) {
/* 42 */                        sb = new StringBuilder(length * 2);
                            }
/* 45 */                    sb.append((CharSequence) str, i2, i);
/* 51 */                    if (cCharAt != 65010 || i <= 0) {
/* 96 */                        sb.append(Normalizer.normalize(str.substring(i, i + 1), Normalizer.Form.NFKC).trim());
/* 99 */                        i2 = i + 1;
                            } else {
                                int i3 = i - 1;
/* 63 */                        if (str.charAt(i3) == 1575 || str.charAt(i3) == 65165) {
/* 76 */                            sb.append("لله");
                                }
/* 99 */                        i2 = i + 1;
                            }
                        }
/* 101 */               i++;
                    }
/* 104 */           if (sb == null) {
/* 106 */               strI000lI = I000lI(str);
                    } else {
/* 111 */               sb.append((CharSequence) str, i2, i);
/* 118 */               strI000lI = I000lI(sb.toString());
                    }
/* 122 */           OIlioiI01OOo oIlioiI01OOo = new OIlioiI01OOo();
/* 125 */           oIlioiI01OOo.I00000oIO = strI000lI;
/* 551 */           return oIlioiI01OOo;
                }

                public static String I000lI(String str) {
/* 4 */             Bidi bidi = new Bidi(str, -2);
/* 11 */            if (!bidi.isMixed() && bidi.getBaseLevel() == 0) {
/* 19 */                return str;
                    }
/* 20 */            int runCount = bidi.getRunCount();
/* 24 */            byte[] bArr = new byte[runCount];
/* 26 */            Integer[] numArr = new Integer[runCount];
/* 30 */            for (int i = 0; i < runCount; i++) {
/* 37 */                bArr[i] = (byte) bidi.getRunLevel(i);
/* 43 */                numArr[i] = Integer.valueOf(i);
                    }
/* 48 */            Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
/* 53 */            StringBuilder sb = new StringBuilder();
/* 56 */            for (int i2 = 0; i2 < runCount; i2++) {
/* 60 */                int iIntValue = numArr[i2].intValue();
/* 64 */                int runStart = bidi.getRunStart(iIntValue);
/* 68 */                int runLimit = bidi.getRunLimit(iIntValue);
/* 76 */                if ((bArr[iIntValue] & 1) != 0) {
                            while (true) {
                                runLimit--;
/* 80 */                        if (runLimit >= runStart) {
/* 82 */                            char cCharAt = str.charAt(runLimit);
/* 94 */                            if (Character.isMirrored(str.codePointAt(runLimit))) {
/* 96 */                                Character chValueOf = Character.valueOf(cCharAt);
/* 100 */                               HashMap map = I00IoiI;
/* 106 */                               if (map.containsKey(chValueOf)) {
/* 116 */                                   sb.append(map.get(Character.valueOf(cCharAt)));
                                        } else {
/* 120 */                                   sb.append(cCharAt);
                                        }
                                    } else {
/* 124 */                               sb.append(cCharAt);
                                    }
                                }
                            }
                        } else {
/* 128 */                   sb.append((CharSequence) str, runStart, runLimit);
                        }
                    }
/* 134 */           return sb.toString();
                }

                public static LinkedList I000oI1ioi(ArrayList arrayList) {
/* 3 */             LinkedList linkedList = new LinkedList();
/* 8 */             StringBuilder sb = new StringBuilder();
/* 13 */            ArrayList arrayList2 = new ArrayList();
/* 16 */            Iterator it = arrayList.iterator();
/* 24 */            while (it.hasNext()) {
/* 32 */                Oo0l0OoolI0 oo0l0OoolI0 = ((OIlillio1i) it.next()).I00000oIO;
/* 34 */                if (oo0l0OoolI0 == null) {
/* 49 */                    linkedList.add(I000iOII(sb.toString(), new ArrayList(arrayList2)));
/* 54 */                    sb = new StringBuilder();
/* 57 */                    arrayList2.clear();
                        } else {
/* 63 */                    sb.append(oo0l0OoolI0.I00100l0);
/* 66 */                    arrayList2.add(oo0l0OoolI0);
                        }
                    }
/* 74 */            if (sb.length() > 0) {
/* 84 */                linkedList.add(I000iOII(sb.toString(), arrayList2));
                    }
/* 186 */           return linkedList;
                }

                public static void I00100l0(BufferedInputStream bufferedInputStream) throws IOException {
/* 8 */             LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(bufferedInputStream));
                    while (true) {
/* 11 */                String line = lineNumberReader.readLine();
/* 15 */                if (line == null) {
/* 17 */                    return;
                        }
/* 20 */                int iIndexOf = line.indexOf(35);
/* 26 */                if (iIndexOf != -1) {
/* 28 */                    line = line.substring(0, iIndexOf);
                        }
/* 37 */                if (line.length() >= 2) {
/* 44 */                    StringTokenizer stringTokenizer = new StringTokenizer(line, ";");
/* 47 */                    int iCountTokens = stringTokenizer.countTokens();
/* 51 */                    Character[] chArr = new Character[iCountTokens];
/* 54 */                    for (int i = 0; i < iCountTokens; i++) {
/* 75 */                        chArr[i] = Character.valueOf((char) Integer.parseInt(stringTokenizer.nextToken().trim(), 16));
                            }
/* 80 */                    if (iCountTokens == 2) {
/* 89 */                        I00IoiI.put(chArr[0], chArr[1]);
                            }
                        }
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:149:0x040c, code lost:
                
                    if (r12.I00000oOI == false) goto L136;
                 */
                /* JADX WARN: Removed duplicated region for block: B:136:0x03aa  */
                /* JADX WARN: Removed duplicated region for block: B:165:0x0438  */
                /* JADX WARN: Removed duplicated region for block: B:172:0x0455  */
                /* JADX WARN: Removed duplicated region for block: B:188:0x0497 A[PHI: r12 r13 r17 r18 r22
                  0x0497: PHI (r12v7 OIlioO1loio0) = (r12v6 OIlioO1loio0), (r12v12 OIlioO1loio0) binds: [B:116:0x0369, B:186:0x048d] A[DONT_GENERATE, DONT_INLINE]
                  0x0497: PHI (r13v6 float) = (r13v5 float), (r13v18 float) binds: [B:116:0x0369, B:186:0x048d] A[DONT_GENERATE, DONT_INLINE]
                  0x0497: PHI (r17v3 float) = (r17v2 float), (r17v8 float) binds: [B:116:0x0369, B:186:0x048d] A[DONT_GENERATE, DONT_INLINE]
                  0x0497: PHI (r18v3 float) = (r18v2 float), (r18v7 float) binds: [B:116:0x0369, B:186:0x048d] A[DONT_GENERATE, DONT_INLINE]
                  0x0497: PHI (r22v2 boolean) = (r22v1 boolean), (r22v4 boolean) binds: [B:116:0x0369, B:186:0x048d] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:70:0x01d0  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final String I000l1(OIliOo11 oIliOo11) throws IOException {
                    StringWriter stringWriter;
                    ArrayList arrayList;
                    HashMap map;
                    Iterator it;
                    int i;
                    int i2;
                    int i3;
                    float f;
                    int size;
                    HashMap map2;
                    Iterator it2;
                    float f2;
                    float f3;
                    float f4;
                    float f5;
                    boolean z;
                    Pattern patternI000o00OoI0I;
                    boolean z2;
                    String str;
                    OIloo1oil1 oIloo1oil1;
/* 5 */             StringWriter stringWriter2 = new StringWriter();
/* 8 */             boolean z3 = false;
/* 9 */             this.I001IIilI0O = 0;
/* 11 */            ArrayList arrayList2 = this.I00IO1oi11O;
/* 13 */            if (arrayList2 != null) {
/* 15 */                arrayList2.clear();
                    }
/* 18 */            HashMap map3 = this.I00IOO;
/* 20 */            map3.clear();
/* 23 */            this.I00IioO0OiOi = stringWriter2;
/* 29 */            OIlo1Ioo oIlo1IooI000O01llI0 = oIliOo11.I00000oIO().I000O01llI0();
/* 33 */            int i4 = -1;
/* 34 */            this.I001i1lo1io = -1;
/* 36 */            this.I001iOo1i0O = -1;
/* 38 */            Iterator it3 = oIlo1IooI000O01llI0.iterator();
                    while (true) {
/* 43 */                OIlo1IOiO0i oIlo1IOiO0i = (OIlo1IOiO0i) it3;
/* 49 */                if (!oIlo1IOiO0i.hasNext()) {
/* 1327 */                  return stringWriter2.toString();
                        }
/* 55 */                OIlo0iIOiOI oIlo0iIOiOI = (OIlo0iIOiOI) oIlo1IOiO0i.next();
/* 59 */                boolean z4 = true;
                        this.I001IIilI0O++;
/* 63 */                boolean zI000II = oIlo0iIOiOI.I000II();
/* 67 */                IIOoi0ooOoO iIOoi0ooOoO = oIlo0iIOiOI.I00iOIl;
/* 69 */                if (!zI000II || (i = this.I001IIilI0O) < this.I001IO000 || i > this.I001i1O0Ol || (((i2 = this.I001i1lo1io) != i4 && i < i2) || ((i3 = this.I001iOo1i0O) != i4 && i > i3))) {
/* 1305 */                  stringWriter = stringWriter2;
/* 1307 */                  arrayList = arrayList2;
/* 1309 */                  map = map3;
/* 1311 */                  it = it3;
                        } else {
/* 95 */                    if (this.I001lIiIIo1O) {
/* 102 */                       this.I00IO1 = new ArrayList();
/* 110 */                       IIOoIilO iIOoIilO = (IIOoIilO) iIOoi0ooOoO.I00oII(IIi0I0I0o.I00oO101o);
/* 112 */                       if (iIOoIilO == null) {
/* 116 */                           iIOoIilO = new IIOoIilO();
                                }
/* 119 */                       ArrayList arrayList3 = iIOoIilO.I00iOIl;
/* 127 */                       ArrayList arrayList4 = new ArrayList(arrayList3.size());
/* 135 */                       for (int i5 = z3 ? 1 : 0; i5 < arrayList3.size(); i5++) {
/* 137 */                           IIOoOiOI iIOoOiOII00lll10 = iIOoIilO.I00lll10(i5);
/* 145 */                           if (iIOoOiOII00lll10 instanceof IIOoi0ooOoO) {
/* 151 */                               oIloo1oil1 = new OIloo1oil1();
/* 154 */                               oIloo1oil1.I00iOIl = (IIOoi0ooOoO) iIOoOiOII00lll10;
/* 156 */                               VarHandle.storeStoreFence();
                                    } else {
/* 160 */                               oIloo1oil1 = null;
                                    }
/* 161 */                           arrayList4.add(oIloo1oil1);
                                }
/* 167 */                       f = 0.0f;
/* 169 */                       arrayList4.size();
/* 174 */                       iIOoIilO.I00iOIl.size();
/* 177 */                       Iterator it4 = arrayList4.iterator();
/* 186 */                       while (it4.hasNext()) {
/* 192 */                           OIloo1oil1 oIloo1oil12 = (OIloo1oil1) it4.next();
/* 194 */                           if (oIloo1oil12 != null) {
/* 196 */                               IIOoi0ooOoO iIOoi0ooOoO2 = oIloo1oil12.I00iOIl;
/* 198 */                               IIi0I0I0o iIi0I0I0o = IIi0I0I0o.I0I1lll0O0;
/* 204 */                               IIOoIilO iIOoIilO2 = (IIOoIilO) iIOoi0ooOoO2.I00oII(iIi0I0I0o);
/* 215 */                               if ((iIOoIilO2 != null ? new OIloOoil011l(iIOoIilO2) : null) != null) {
/* 223 */                                   IIOoIilO iIOoIilO3 = (IIOoIilO) iIOoi0ooOoO2.I00oII(iIi0I0I0o);
/* 233 */                                   OIloOoil011l oIloOoil011l = iIOoIilO3 != null ? new OIloOoil011l(iIOoIilO3) : null;
/* 234 */                                   OIloOoil011l oIloOoil011lI0001Ioi1lo = oIlo0iIOiOI.I0001Ioi1lo();
/* 238 */                                   float fI0000O = oIloOoil011lI0001Ioi1lo.I0000O();
/* 242 */                                   float fI00000oOI = oIloOoil011l.I00000oOI();
/* 246 */                                   IIOoIilO iIOoIilO4 = oIloOoil011l.I00iOIl;
/* 263 */                                   iIOoIilO4.I00oliIiO01i(1, new IIOolo0l(oIloOoil011lI0001Ioi1lo.I0000O() - oIloOoil011l.I0000O()));
/* 272 */                                   iIOoIilO4.I00oliIiO01i(3, new IIOolo0l(fI0000O - fI00000oOI));
/* 275 */                                   OIloOoil011l oIloOoil011lI0000oI00 = oIlo0iIOiOI.I0000oI00();
/* 285 */                                   if (oIloOoil011lI0000oI00.I00000oIO() != 0.0f || oIloOoil011lI0000oI00.I00000oOI() != 0.0f) {
/* 310 */                                       iIOoIilO4.I00oliIiO01i(z3 ? 1 : 0, new IIOolo0l(oIloOoil011l.I00000oIO() - oIloOoil011lI0000oI00.I00000oIO()));
/* 327 */                                       iIOoIilO4.I00oliIiO01i(1, new IIOolo0l(oIloOoil011l.I00000oOI() - oIloOoil011lI0000oI00.I00000oOI()));
/* 344 */                                       iIOoIilO4.I00oliIiO01i(2, new IIOolo0l(oIloOoil011l.I0000Il00O() - oIloOoil011lI0000oI00.I00000oIO()));
/* 362 */                                       iIOoIilO4.I00oliIiO01i(3, new IIOolo0l(oIloOoil011l.I0000O() - oIloOoil011lI0000oI00.I00000oOI()));
                                            }
/* 367 */                                   this.I00IO1.add(oIloOoil011l);
                                        }
                                    }
/* 375 */                           this.I00IO1.add(null);
                                }
/* 387 */                       size = (this.I00IO1.size() * 2) + 1;
                            } else {
/* 389 */                       f = 0.0f;
/* 391 */                       size = 1;
                            }
/* 392 */                   int size2 = arrayList2.size();
/* 396 */                   arrayList2.ensureCapacity(size);
/* 399 */                   int iMax = Math.max(size, size2);
/* 404 */                   for (int i6 = z3 ? 1 : 0; i6 < iMax; i6++) {
/* 406 */                       if (i6 < size2) {
/* 414 */                           ((List) arrayList2.get(i6)).clear();
                                } else if (size < size2) {
/* 420 */                           arrayList2.remove(i6);
                                } else {
/* 429 */                           arrayList2.add(new ArrayList());
                                }
                            }
/* 435 */                   map3.clear();
/* 440 */                   IIOoOiOI iIOoOiOII00000oOI = OIlo1Ioo.I00000oOI(IIi0I0I0o.I0II1i1l0, iIOoi0ooOoO);
/* 446 */                   if (iIOoOiOII00000oOI instanceof IIi0IoOo) {
/* 450 */                       int iI00lli11 = ((IIi0IoOo) iIOoOiOII00000oOI).I00lli11();
/* 465 */                       int i7 = iI00lli11 % 90 == 0 ? ((iI00lli11 % 360) + 360) % 360 : z3 ? 1 : 0;
/* 466 */                       this.I000O01llI0 = i7;
/* 468 */                       OIloOoil011l oIloOoil011lI0000oI002 = oIlo0iIOiOI.I0000oI00();
/* 472 */                       this.I000OOo1O = oIloOoil011lI0000oI002;
/* 480 */                       if (oIloOoil011lI0000oI002.I00000oIO() == f && this.I000OOo1O.I00000oOI() == f) {
/* 493 */                           this.I000OiO = null;
                                } else {
/* 514 */                           this.I000OiO = O1OoooIi1Ol0.I0000oI00(-this.I000OOo1O.I00000oIO(), -this.I000OOo1O.I00000oOI());
                                }
/* 516 */                       this.I0001Ioi1lo = oIlo0iIOiOI;
/* 520 */                       this.I0000O.clear();
/* 523 */                       Deque deque = this.I0000O;
/* 527 */                       OIloOoil011l oIloOoil011lI0000oI003 = oIlo0iIOiOI.I0000oI00();
/* 531 */                       OIlli0ooo oIlli0ooo = new OIlli0ooo();
/* 539 */                       oIlli0ooo.I00iiI = new ArrayList(1);
/* 546 */                       oIlli0ooo.I00iiO = new IdentityHashMap();
/* 553 */                       oIlli0ooo.I00iio = new O1OoooIi1Ol0();
/* 557 */                       OIlOo1Oil0 oIlOo1Oil0 = OIli00Ii.I00iiI.I00iOIl;
/* 561 */                       OIloo1o00o oIloo1o00o = new OIloo1o00o();
/* 564 */                       float f6 = f;
/* 566 */                       oIloo1o00o.I00iOIl = f6;
/* 568 */                       oIloo1o00o.I00iiI = f6;
/* 572 */                       oIloo1o00o.I00iiO = 100.0f;
/* 574 */                       oIloo1o00o.I00iio = f6;
/* 576 */                       Oi010iI0[] oi010iI0Arr = Oi010iI0.I00iOIl;
/* 578 */                       oIloo1o00o.I00io1l = f6;
/* 580 */                       oIlli0ooo.I00ilI0I1 = oIloo1o00o;
/* 582 */                       Paint.Cap cap = Paint.Cap.BUTT;
/* 584 */                       Paint.Join join = Paint.Join.MITER;
/* 586 */                       HashMap map4 = OIIo1IOo0IlO.I00000oIO;
/* 588 */                       ArrayList arrayList5 = oIlli0ooo.I00iiI;
/* 590 */                       float fI00000oIO = oIloOoil011lI0000oI003.I00000oIO();
/* 594 */                       float fI00000oOI2 = oIloOoil011lI0000oI003.I00000oOI();
/* 598 */                       float fI0000Il00O = oIloOoil011lI0000oI003.I0000Il00O();
/* 602 */                       float fI0000O2 = oIloOoil011lI0000oI003.I0000O();
/* 608 */                       Path path = new Path();
/* 611 */                       path.moveTo(fI00000oIO, fI00000oOI2);
/* 614 */                       path.lineTo(fI0000Il00O, fI00000oOI2);
/* 617 */                       path.lineTo(fI0000Il00O, fI0000O2);
/* 620 */                       path.lineTo(fI00000oIO, fI0000O2);
/* 623 */                       path.close();
/* 626 */                       arrayList5.add(path);
/* 629 */                       deque.push(oIlli0ooo);
/* 632 */                       OIlioO1loio0 oIlioO1loio0 = null;
/* 633 */                       this.I00000oOI = null;
/* 635 */                       this.I0000Il00O = null;
/* 637 */                       this.I0000oI00 = null;
/* 643 */                       if (oIlo0iIOiOI.I000II()) {
/* 645 */                           I0001Ioi1lo(oIlo0iIOiOI);
                                }
/* 652 */                       if (arrayList2.size() > 0) {
/* 658 */                           this.I00IioO0OiOi.write(this.I00100o1O0lo);
                                }
/* 661 */                       Iterator it5 = arrayList2.iterator();
/* 665 */                       boolean z5 = true;
/* 667 */                       OIlioO1loio0 oIlioO1loio02 = null;
/* 668 */                       float f7 = -3.4028235E38f;
/* 671 */                       float f8 = -1.0f;
/* 673 */                       float f9 = -1.0f;
/* 675 */                       float fMax = -1.0f;
/* 677 */                       float fMin = Float.MAX_VALUE;
/* 684 */                       while (it5.hasNext()) {
/* 690 */                           List<Oo0l0OoolI0> list = (List) it5.next();
/* 699 */                           this.I00IioO0OiOi.write(this.I0010o);
/* 704 */                           ArrayList arrayList6 = new ArrayList();
/* 711 */                           boolean z6 = z4;
/* 713 */                           float f10 = -1.0f;
/* 719 */                           for (Oo0l0OoolI0 oo0l0OoolI0 : list) {
/* 733 */                               OIlioO1loio0 oIlioO1loio03 = new OIlioO1loio0();
/* 736 */                               oIlioO1loio03.I00000oIO = z3;
/* 738 */                               oIlioO1loio03.I00000oOI = z3;
/* 740 */                               oIlioO1loio03.I0000Il00O = z3;
/* 742 */                               oIlioO1loio03.I0000O = z3;
/* 744 */                               oIlioO1loio03.I0000oI00 = oo0l0OoolI0;
/* 746 */                               String str2 = oo0l0OoolI0.I00100l0;
/* 748 */                               StringWriter stringWriter3 = stringWriter2;
/* 750 */                               int i8 = oo0l0OoolI0.I0000oI00;
/* 754 */                               float f11 = oo0l0OoolI0.I000OiO;
/* 756 */                               ArrayList arrayList7 = arrayList2;
/* 758 */                               float f12 = oo0l0OoolI0.I0001Ioi1lo;
/* 762 */                               if (oIlioO1loio0 != null) {
/* 764 */                                   OIll100 oIll100 = oo0l0OoolI0.I000l1;
/* 766 */                                   map2 = map3;
/* 768 */                                   Oo0l0OoolI0 oo0l0OoolI02 = oIlioO1loio0.I0000oI00;
/* 770 */                                   it2 = it3;
/* 774 */                                   if (oIll100 != oo0l0OoolI02.I000l1 || oo0l0OoolI0.I000lI != oo0l0OoolI02.I000lI) {
/* 784 */                                       f10 = -1.0f;
                                            }
                                        } else {
/* 787 */                                   map2 = map3;
/* 789 */                                   it2 = it3;
                                        }
/* 791 */                               float f13 = oo0l0OoolI0.I000II;
/* 794 */                               float fI0000Il00O2 = oo0l0OoolI0.I0000Il00O(i8);
/* 798 */                               float f14 = oo0l0OoolI0.I0000O;
/* 804 */                               int length = oo0l0OoolI0.I000oI1ioi.length;
/* 811 */                               if (f11 == 0.0f || Float.isNaN(f11)) {
/* 819 */                                   f2 = fI0000Il00O2;
/* 837 */                                   f3 = Float.MAX_VALUE;
                                        } else {
/* 824 */                                   f2 = fI0000Il00O2;
/* 826 */                                   float f15 = this.I00II0Ol1O0l;
/* 835 */                                   f3 = f9 < 0.0f ? f15 * f11 : f15 * ((f9 + f11) / 2.0f);
                                        }
/* 855 */                               f10 = f10 < 0.0f ? f2 / length : ((f2 / length) + f10) / 2.0f;
/* 872 */                               float fMin2 = f8 != -1.0f ? Math.min(f3, this.I00II0oii1o * f10) + f8 : -3.4028235E38f;
/* 874 */                               if (oIlioO1loio0 != null) {
/* 876 */                                   Oo0l0OoolI0 oo0l0OoolI03 = oIlioO1loio0.I0000oI00;
/* 878 */                                   if (z6) {
/* 881 */                                       oIlioO1loio0.I0000O = true;
/* 883 */                                       z6 = false;
                                            }
/* 892 */                                   if ((f7 >= f13 + 0.1f || f7 <= f13 - 0.1f) && ((f7 > f13 || f7 < f13 - f14) && (f13 > f7 || f13 < f7 - fMax))) {
/* 928 */                                       I00100o1O0lo(I000oI1ioi(arrayList6));
/* 931 */                                       arrayList6.clear();
/* 935 */                                       oIlioO1loio03.I00000oIO = true;
/* 937 */                                       if (oIlioO1loio02 == null) {
/* 939 */                                           z = true;
/* 1073 */                                          oIlioO1loio03.I00000oOI = z;
/* 1075 */                                          z2 = oIlioO1loio03.I00000oOI;
/* 1077 */                                          String str3 = this.I000lI;
/* 1079 */                                          if (z2) {
/* 1112 */                                              this.I00IioO0OiOi.write(str3);
                                                    } else if (oIlioO1loio0.I0000O) {
/* 1087 */                                              if (oIlioO1loio0.I00000oIO) {
/* 1091 */                                                  this.I00IioO0OiOi.write(str3);
                                                        }
/* 1094 */                                              I0010o();
                                                    } else {
/* 1100 */                                              this.I00IioO0OiOi.write(str3);
/* 1103 */                                              I0010I0i();
/* 1106 */                                              I0010o();
                                                    }
/* 1115 */                                          oIlioO1loio02 = oIlioO1loio03;
/* 1116 */                                          fMin2 = -3.4028235E38f;
/* 1118 */                                          f7 = -3.4028235E38f;
/* 1119 */                                          fMax = -1.0f;
/* 1121 */                                          fMin = Float.MAX_VALUE;
                                                } else {
/* 951 */                                           float fAbs = Math.abs(oo0l0OoolI0.I0001Ioi1lo() - oo0l0OoolI03.I0001Ioi1lo());
/* 967 */                                           float fRound = Math.round((this.I001lloI * fMax) * 1000.0f) / 1000.0f;
/* 980 */                                           float fI0000O3 = oo0l0OoolI0.I0000O() - oIlioO1loio02.I0000oI00.I0000O();
/* 992 */                                           float fRound2 = Math.round((this.I001lllioOl * f11) * 1000.0f) / 1000.0f;
/* 1010 */                                          float fRound3 = Math.round((oo0l0OoolI0.I0000Il00O(i8) * 0.25f) * 1000.0f) / 1000.0f;
/* 1014 */                                          if (fAbs <= fRound) {
/* 1019 */                                              if (fI0000O3 > fRound2) {
/* 1023 */                                                  if (oIlioO1loio02.I00000oOI) {
/* 1027 */                                                      oIlioO1loio03.I0000Il00O = true;
/* 1075 */                                                      z2 = oIlioO1loio03.I00000oOI;
/* 1077 */                                                      String str32 = this.I000lI;
/* 1079 */                                                      if (z2) {
                                                                }
/* 1115 */                                                      oIlioO1loio02 = oIlioO1loio03;
/* 1116 */                                                      fMin2 = -3.4028235E38f;
/* 1118 */                                                      f7 = -3.4028235E38f;
/* 1119 */                                                      fMax = -1.0f;
/* 1121 */                                                      fMin = Float.MAX_VALUE;
                                                            }
/* 939 */                                                   z = true;
/* 1073 */                                                  oIlioO1loio03.I00000oOI = z;
/* 1075 */                                                  z2 = oIlioO1loio03.I00000oOI;
/* 1077 */                                                  String str322 = this.I000lI;
/* 1079 */                                                  if (z2) {
                                                            }
/* 1115 */                                                  oIlioO1loio02 = oIlioO1loio03;
/* 1116 */                                                  fMin2 = -3.4028235E38f;
/* 1118 */                                                  f7 = -3.4028235E38f;
/* 1119 */                                                  fMax = -1.0f;
/* 1121 */                                                  fMin = Float.MAX_VALUE;
                                                        } else {
/* 1033 */                                                  if (fI0000O3 >= (-f11)) {
/* 1046 */                                                      if (Math.abs(fI0000O3) < fRound3) {
/* 1050 */                                                          if (oIlioO1loio02.I0000Il00O) {
/* 1053 */                                                              oIlioO1loio03.I0000Il00O = true;
                                                                    } else {
/* 1056 */                                                              z = true;
/* 1059 */                                                              if (oIlioO1loio02.I00000oOI && (patternI000o00OoI0I = I000o00OoI0I(oIlioO1loio02)) != null && patternI000o00OoI0I == I000o00OoI0I(oIlioO1loio03)) {
/* 1073 */                                                                  oIlioO1loio03.I00000oOI = z;
                                                                        }
                                                                    }
                                                                }
                                                            }
/* 1075 */                                                  z2 = oIlioO1loio03.I00000oOI;
/* 1077 */                                                  String str3222 = this.I000lI;
/* 1079 */                                                  if (z2) {
                                                            }
/* 1115 */                                                  oIlioO1loio02 = oIlioO1loio03;
/* 1116 */                                                  fMin2 = -3.4028235E38f;
/* 1118 */                                                  f7 = -3.4028235E38f;
/* 1119 */                                                  fMax = -1.0f;
/* 1121 */                                                  fMin = Float.MAX_VALUE;
                                                        }
                                                    }
                                                }
                                            }
/* 1126 */                                  if (fMin2 != -3.4028235E38f && fMin2 < f12) {
/* 1132 */                                      String str4 = this.I000o00OoI0I;
/* 1138 */                                      if (str4.isEmpty() || ((str = oo0l0OoolI03.I00100l0) != null && !str.endsWith(str4))) {
/* 1152 */                                          arrayList6.add(OIlillio1i.I00000oOI);
                                                }
                                            }
/* 1166 */                                  if (Math.abs(f12 - oo0l0OoolI03.I0001Ioi1lo) > f3 + f11) {
/* 1168 */                                      f7 = -3.4028235E38f;
/* 1170 */                                      f4 = -1.0f;
/* 1172 */                                      f5 = Float.MAX_VALUE;
                                            } else {
/* 1176 */                                      f4 = fMax;
/* 1178 */                                      f5 = fMin;
                                            }
                                        }
/* 1182 */                              if (f13 >= f7) {
/* 1184 */                                  f7 = f13;
                                        }
/* 1186 */                              f8 = f12 + f2;
/* 1188 */                              if (str2 != null) {
/* 1190 */                                  if (z5 && oIlioO1loio0 == null) {
/* 1194 */                                      I0010o();
                                            }
/* 1199 */                                  OIlillio1i oIlillio1i = new OIlillio1i();
/* 1202 */                                  oIlillio1i.I00000oIO = oo0l0OoolI0;
/* 1204 */                                  arrayList6.add(oIlillio1i);
                                        }
/* 1207 */                              fMax = Math.max(f4, f14);
/* 1213 */                              fMin = Math.min(f5, f13 - f14);
/* 1218 */                              if (z5) {
/* 1220 */                                  oIlioO1loio03.I00000oOI = true;
/* 1222 */                                  oIlioO1loio03.I00000oIO = true;
/* 1224 */                                  oIlioO1loio02 = oIlioO1loio03;
/* 1225 */                                  z5 = false;
                                        }
/* 1227 */                              f9 = f11;
/* 1228 */                              oIlioO1loio0 = oIlioO1loio03;
/* 1229 */                              arrayList2 = arrayList7;
/* 1231 */                              map3 = map2;
/* 1233 */                              it3 = it2;
/* 1235 */                              z3 = false;
/* 1236 */                              z4 = true;
/* 1237 */                              stringWriter2 = stringWriter3;
                                    }
/* 1241 */                          StringWriter stringWriter4 = stringWriter2;
/* 1243 */                          ArrayList arrayList8 = arrayList2;
/* 1245 */                          HashMap map5 = map3;
/* 1247 */                          Iterator it6 = it3;
/* 1249 */                          boolean z7 = z4;
/* 1258 */                          if (arrayList6.size() > 0) {
/* 1264 */                              I00100o1O0lo(I000oI1ioi(arrayList6));
/* 1267 */                              I0010I0i();
                                    }
/* 1274 */                          this.I00IioO0OiOi.write(this.I00111O);
/* 1277 */                          z4 = z7;
/* 1278 */                          stringWriter2 = stringWriter4;
/* 1280 */                          arrayList2 = arrayList8;
/* 1282 */                          map3 = map5;
/* 1284 */                          it3 = it6;
/* 1286 */                          z3 = false;
                                }
/* 1289 */                      stringWriter = stringWriter2;
/* 1291 */                      arrayList = arrayList2;
/* 1293 */                      map = map3;
/* 1295 */                      it = it3;
/* 1301 */                      this.I00IioO0OiOi.write(this.I0010I0i);
                            }
                        }
/* 1313 */              stringWriter2 = stringWriter;
/* 1315 */              arrayList2 = arrayList;
/* 1317 */              map3 = map;
/* 1319 */              it3 = it;
/* 1321 */              z3 = false;
/* 1322 */              i4 = -1;
                    }
                }

                public final Pattern I000o00OoI0I(OIlioO1loio0 oIlioO1loio0) {
/* 3 */             String str = oIlioO1loio0.I0000oI00.I00100l0;
/* 7 */             if (this.I00Io1lO == null) {
/* 14 */                this.I00Io1lO = new ArrayList();
/* 20 */                for (String str2 : I00IoO0) {
/* 30 */                    this.I00Io1lO.add(Pattern.compile(str2));
                        }
                    }
/* 38 */            Iterator it = this.I00Io1lO.iterator();
/* 46 */            while (it.hasNext()) {
/* 52 */                Pattern pattern = (Pattern) it.next();
/* 62 */                if (pattern.matcher(str).matches()) {
/* 64 */                    return pattern;
                        }
                    }
/* 65 */            return null;
                }

                public final void I00100o1O0lo(LinkedList linkedList) throws IOException {
/* 1 */             int size = linkedList.size();
/* 6 */             for (int i = 0; i < size; i++) {
/* 18 */                this.I00IioO0OiOi.write(((OIlioiI01OOo) linkedList.get(i)).I00000oIO);
/* 23 */                if (i < size - 1) {
/* 29 */                    this.I00IioO0OiOi.write(this.I000o00OoI0I);
                        }
                    }
                }

                public final void I0010I0i() throws IOException {
/* 3 */             if (!this.I00IlilI0i0i) {
/* 5 */                 I0010o();
                    }
/* 12 */            this.I00IioO0OiOi.write(this.I00100l0);
/* 16 */            this.I00IlilI0i0i = false;
                }

                public final void I0010o() throws IOException {
/* 3 */             if (this.I00IlilI0i0i) {
/* 5 */                 I0010I0i();
/* 9 */                 this.I00IlilI0i0i = false;
                    }
/* 15 */            this.I00IioO0OiOi.write(this.I000oI1ioi);
/* 19 */            this.I00IlilI0i0i = true;
                }
            }
