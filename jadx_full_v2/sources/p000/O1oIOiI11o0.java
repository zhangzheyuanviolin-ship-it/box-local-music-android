            package p000;

            import android.content.Context;
            import com.google.ai.edge.gallery.data.AICoreModelPreference;
            import com.google.ai.edge.gallery.data.AICoreModelReleaseStage;
            import com.google.ai.edge.gallery.data.Accelerator;
            import com.google.ai.edge.gallery.data.RuntimeType;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.File;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            
            public final class O1oIOiI11o0 {
                public final String I00000oIO;
                public final String I00000oOI;
                public final String I0000Il00O;
                public List I0000O;
                public final String I0000oI00;
                public final List I0001Ioi1lo;
                public final Integer I000II;
                public final String I000O01llI0;
                public final long I000OOo1O;
                public final String I000OiO;
                public final String I000iOII;
                public final List I000l1;
                public final boolean I000lI;
                public final AICoreModelReleaseStage I000o00OoI0I;
                public final AICoreModelPreference I000oI1ioi;
                public final RuntimeType I00100l0;
                public final String I00100o1O0lo;
                public final String I0010I0i;
                public final boolean I0010o;
                public final boolean I00111O;
                public final String I001IIilI0O;
                public final List I001IO000;
                public final boolean I001i1O0Ol;
                public final boolean I001i1lo1io;
                public final boolean I001iOo1i0O;
                public final boolean I001l0I00;
                public final boolean I001lIiIIo1O;
                public final boolean I001lllioOl;
                public final List I001lloI;
                public final Map I00II0Ol1O0l;
                public final int I00II0oii1o;
                public final List I00IO1;
                public final Accelerator I00IO1oi11O;
                public final boolean I00IOO;
                public final String I00IioO0OiOi;
                public Object I00IlilI0i0i;
                public boolean I00Io1lO;
                public boolean I00Io1o110i;
                public Map I00IoIO0lI;
                public Map I00IoO0;
                public long I00IoiI;
                public String I00Iooi00oi;

                public O1oIOiI11o0(String str, String str2, List list, String str3, List list2, Integer num, String str4, long j, String str5, String str6, List list3, boolean z, AICoreModelReleaseStage aICoreModelReleaseStage, AICoreModelPreference aICoreModelPreference, RuntimeType runtimeType, String str7, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, List list4, Map map, int i, List list5, Accelerator accelerator, int i2, int i3) {
                    Il01100l il01100l;
                    boolean z10;
/* 1 */             String str8 = (i2 & 4) != 0 ? "" : str2;
                    int i4 = i2 & 8;
                    Il01100l il01100l2 = Il01100l.I00iOIl;
                    List list6 = i4 != 0 ? il01100l2 : list;
/* 1 */             String str9 = (i2 & 16) != 0 ? "" : str3;
                    List list7 = (i2 & 32) != 0 ? il01100l2 : list2;
                    Integer num2 = (i2 & 64) != 0 ? null : num;
                    String str10 = (i2 & Barcode.FORMAT_UPC_E) != 0 ? "_" : str6;
                    List list8 = (i2 & Barcode.FORMAT_PDF417) != 0 ? il01100l2 : list3;
                    boolean z11 = (i2 & Barcode.FORMAT_AZTEC) != 0 ? false : z;
                    AICoreModelReleaseStage aICoreModelReleaseStage2 = (i2 & 8192) != 0 ? null : aICoreModelReleaseStage;
                    AICoreModelPreference aICoreModelPreference2 = (i2 & 16384) != 0 ? null : aICoreModelPreference;
/* 2 */             RuntimeType runtimeType2 = (i2 & 32768) != 0 ? RuntimeType.UNKNOWN : runtimeType;
/* 1 */             String str11 = (i2 & 131072) != 0 ? "" : str7;
                    if ((i2 & 262144) != 0) {
                        il01100l = il01100l2;
                        z10 = true;
                    } else {
                        il01100l = il01100l2;
                        z10 = z2;
                    }
                    boolean z12 = (i2 & 524288) != 0 ? true : z3;
                    boolean z13 = (i2 & 8388608) != 0 ? false : z4;
                    boolean z14 = (i2 & 16777216) != 0 ? false : z5;
                    boolean z15 = (i2 & 33554432) != 0 ? false : z6;
                    boolean z16 = (i2 & 67108864) != 0 ? false : z7;
                    boolean z17 = (i2 & 134217728) != 0 ? false : z8;
                    boolean z18 = (i2 & 268435456) != 0 ? false : z9;
                    List list9 = (i2 & 536870912) != 0 ? il01100l : list4;
                    int i5 = i2 & 1073741824;
                    boolean z19 = z10;
/* 3 */             Map map2 = Il011I1OiO0I.I00iOIl;
                    map2 = i5 == 0 ? map : map2;
                    int i6 = (i2 & Integer.MIN_VALUE) != 0 ? 0 : i;
                    List list10 = (i3 & 1) != 0 ? il01100l : list5;
/* 4 */             Accelerator accelerator2 = (i3 & 2) != 0 ? Accelerator.GPU : accelerator;
                    boolean z20 = (i3 & 4) == 0;
/* 6 */             this.I00000oIO = str;
/* 7 */             this.I00000oOI = "";
/* 8 */             this.I0000Il00O = str8;
/* 9 */             this.I0000O = list6;
/* 10 */            this.I0000oI00 = str9;
/* 11 */            this.I0001Ioi1lo = list7;
/* 12 */            this.I000II = num2;
/* 13 */            this.I000O01llI0 = str4;
/* 14 */            this.I000OOo1O = j;
/* 15 */            this.I000OiO = str5;
/* 16 */            this.I000iOII = str10;
/* 17 */            this.I000l1 = list8;
/* 18 */            this.I000lI = z11;
/* 19 */            this.I000o00OoI0I = aICoreModelReleaseStage2;
/* 20 */            this.I000oI1ioi = aICoreModelPreference2;
/* 21 */            this.I00100l0 = runtimeType2;
/* 22 */            this.I00100o1O0lo = "";
/* 23 */            this.I0010I0i = str11;
/* 24 */            this.I0010o = z19;
/* 25 */            this.I00111O = z12;
/* 26 */            this.I001IIilI0O = "";
/* 27 */            this.I001IO000 = il01100l;
/* 28 */            this.I001i1O0Ol = z13;
/* 29 */            this.I001i1lo1io = z14;
/* 30 */            this.I001iOo1i0O = z15;
/* 31 */            this.I001l0I00 = z16;
/* 32 */            this.I001lIiIIo1O = z17;
/* 33 */            this.I001lllioOl = z18;
/* 34 */            this.I001lloI = list9;
/* 35 */            this.I00II0Ol1O0l = map2;
/* 36 */            this.I00II0oii1o = i6;
/* 37 */            this.I00IO1 = list10;
/* 38 */            this.I00IO1oi11O = accelerator2;
/* 39 */            this.I00IOO = z20;
/* 40 */            this.I00IioO0OiOi = "";
/* 41 */            this.I00IlilI0i0i = null;
/* 42 */            this.I00Io1lO = false;
/* 43 */            this.I00Io1o110i = false;
/* 44 */            this.I00IoIO0lI = map2;
/* 45 */            this.I00IoO0 = map2;
/* 46 */            this.I00IoiI = 0L;
/* 47 */            this.I00Iooi00oi = null;
/* 49 */            this.I00IioO0OiOi = O1oi0ol1o00.I00000oIO.I0000oI00(str, "_");
                }

                public final O1oIOoi0oo I00000oIO(String str) {
                    Object next;
/* 5 */             Iterator it = this.I000l1.iterator();
                    while (true) {
/* 13 */                if (!it.hasNext()) {
/* 31 */                    next = null;
                            break;
                        }
/* 15 */                next = it.next();
/* 28 */                if (((O1oIOoi0oo) next).I00000oIO.equals(str)) {
                            break;
                        }
                    }
/* 32 */            return (O1oIOoi0oo) next;
                }

                public final String I00000oOI(Context context, String str) {
                    String absolutePath;
                    String absolutePath2;
                    String absolutePath3;
/* 3 */             String str2 = "";
/* 6 */             if (this.I00IOO) {
/* 8 */                 File externalFilesDir = context.getExternalFilesDir(null);
/* 12 */                if (externalFilesDir != null && (absolutePath3 = externalFilesDir.getAbsolutePath()) != null) {
/* 21 */                    str2 = absolutePath3;
                        }
/* 40 */                return IOOi0Ool1i.I00IlilI0i0i(IOOi1I.I000O01llI0(str2, str), File.separator, null, null, null, 62);
                    }
/* 45 */            String str3 = this.I0010I0i;
/* 51 */            if (str3.length() > 0) {
/* 53 */                return str3;
                    }
/* 54 */            String str4 = this.I00100o1O0lo;
/* 60 */            if (str4.length() > 0) {
/* 62 */                File externalFilesDir2 = context.getExternalFilesDir(null);
/* 66 */                if (externalFilesDir2 != null && (absolutePath2 = externalFilesDir2.getAbsolutePath()) != null) {
/* 75 */                    str2 = absolutePath2;
                        }
/* 94 */                return IOOi0Ool1i.I00IlilI0i0i(IOOi1I.I000O01llI0(str2, str4, str), File.separator, null, null, null, 62);
                    }
/* 99 */            File externalFilesDir3 = context.getExternalFilesDir(null);
/* 103 */           if (externalFilesDir3 != null && (absolutePath = externalFilesDir3.getAbsolutePath()) != null) {
/* 112 */               str2 = absolutePath;
                    }
/* 121 */           List listI000O01llI0 = IOOi1I.I000O01llI0(str2, this.I00IioO0OiOi, this.I000iOII);
/* 128 */           String str5 = File.separator;
/* 154 */           return IOOi0Ool1i.I00IlilI0i0i(IOOi1I.I000O01llI0(IOOi0Ool1i.I00IlilI0i0i(listI000O01llI0, str5, null, null, null, 62), str), str5, null, null, null, 62);
                }

                public final void I0000Il00O() {
/* 3 */             LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 16 */            for (IOlOo10O0l0 iOlOo10O0l0 : this.I0000O) {
/* 34 */                linkedHashMap.put(iOlOo10O0l0.I00000oOI().I00000oOI, iOlOo10O0l0.I00000oIO());
                    }
/* 38 */            this.I00IoIO0lI = linkedHashMap;
/* 44 */            Iterator it = this.I000l1.iterator();
/* 48 */            long j = 0;
/* 54 */            while (it.hasNext()) {
/* 64 */                j += ((O1oIOoi0oo) it.next()).I0000O;
                    }
/* 69 */            this.I00IoiI = this.I000OOo1O + j;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 435 */               return true;
                    }
/* 7 */             if (!(obj instanceof O1oIOiI11o0)) {
/* 433 */               return false;
                    }
/* 11 */            O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, o1oIOiI11o0.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, o1oIOiI11o0.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, o1oIOiI11o0.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, o1oIOiI11o0.I0000O) && O0000Ioio00.I0000O(this.I0000oI00, o1oIOiI11o0.I0000oI00) && O0000Ioio00.I0000O(this.I0001Ioi1lo, o1oIOiI11o0.I0001Ioi1lo) && O0000Ioio00.I0000O(this.I000II, o1oIOiI11o0.I000II) && O0000Ioio00.I0000O(this.I000O01llI0, o1oIOiI11o0.I000O01llI0) && this.I000OOo1O == o1oIOiI11o0.I000OOo1O && O0000Ioio00.I0000O(this.I000OiO, o1oIOiI11o0.I000OiO) && O0000Ioio00.I0000O(this.I000iOII, o1oIOiI11o0.I000iOII) && O0000Ioio00.I0000O(this.I000l1, o1oIOiI11o0.I000l1) && this.I000lI == o1oIOiI11o0.I000lI && this.I000o00OoI0I == o1oIOiI11o0.I000o00OoI0I && this.I000oI1ioi == o1oIOiI11o0.I000oI1ioi && this.I00100l0 == o1oIOiI11o0.I00100l0 && O0000Ioio00.I0000O(this.I00100o1O0lo, o1oIOiI11o0.I00100o1O0lo) && O0000Ioio00.I0000O(this.I0010I0i, o1oIOiI11o0.I0010I0i) && this.I0010o == o1oIOiI11o0.I0010o && this.I00111O == o1oIOiI11o0.I00111O && O0000Ioio00.I0000O(this.I001IIilI0O, o1oIOiI11o0.I001IIilI0O) && O0000Ioio00.I0000O(this.I001IO000, o1oIOiI11o0.I001IO000) && this.I001i1O0Ol == o1oIOiI11o0.I001i1O0Ol && this.I001i1lo1io == o1oIOiI11o0.I001i1lo1io && this.I001iOo1i0O == o1oIOiI11o0.I001iOo1i0O && this.I001l0I00 == o1oIOiI11o0.I001l0I00 && this.I001lIiIIo1O == o1oIOiI11o0.I001lIiIIo1O && this.I001lllioOl == o1oIOiI11o0.I001lllioOl && O0000Ioio00.I0000O(this.I001lloI, o1oIOiI11o0.I001lloI) && O0000Ioio00.I0000O(this.I00II0Ol1O0l, o1oIOiI11o0.I00II0Ol1O0l) && this.I00II0oii1o == o1oIOiI11o0.I00II0oii1o && O0000Ioio00.I0000O(this.I00IO1, o1oIOiI11o0.I00IO1) && this.I00IO1oi11O == o1oIOiI11o0.I00IO1oi11O && this.I00IOO == o1oIOiI11o0.I00IOO && O0000Ioio00.I0000O(this.I00IioO0OiOi, o1oIOiI11o0.I00IioO0OiOi) && O0000Ioio00.I0000O(this.I00IlilI0i0i, o1oIOiI11o0.I00IlilI0i0i) && this.I00Io1lO == o1oIOiI11o0.I00Io1lO && this.I00Io1o110i == o1oIOiI11o0.I00Io1o110i && O0000Ioio00.I0000O(this.I00IoIO0lI, o1oIOiI11o0.I00IoIO0lI) && O0000Ioio00.I0000O(this.I00IoO0, o1oIOiI11o0.I00IoO0) && this.I00IoiI == o1oIOiI11o0.I00IoiI && O0000Ioio00.I0000O(this.I00Iooi00oi, o1oIOiI11o0.I00Iooi00oi);
                }

                public final int hashCode() {
/* 36 */            int iI0000oI00 = IIl001iO0Io.I0000oI00(Oi010OO0.I000O01llI0(IIl001iO0Io.I0000oI00(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI), 31, this.I0000Il00O), 31, this.I0000O), 31, this.I0000oI00), 31, this.I0001Ioi1lo);
/* 41 */            Integer num = this.I000II;
/* 85 */            int iI000OOo1O = Oi010OO0.I000OOo1O(IIl001iO0Io.I0000oI00(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(IIlIOloOOO.I0000O(this.I000OOo1O, Oi010OO0.I000O01llI0((iI0000oI00 + (num == null ? 0 : num.hashCode())) * 31, 31, this.I000O01llI0), 31), 31, this.I000OiO), 31, this.I000iOII), 31, this.I000l1), 31, this.I000lI);
/* 89 */            AICoreModelReleaseStage aICoreModelReleaseStage = this.I000o00OoI0I;
/* 100 */           int iHashCode = (iI000OOo1O + (aICoreModelReleaseStage == null ? 0 : aICoreModelReleaseStage.hashCode())) * 31;
/* 101 */           AICoreModelPreference aICoreModelPreference = this.I000oI1ioi;
/* 237 */           int iI000O01llI0 = Oi010OO0.I000O01llI0(Oi010OO0.I000OOo1O((this.I00IO1oi11O.hashCode() + IIl001iO0Io.I0000oI00(IIl001iO0Io.I0000O(this.I00II0oii1o, Oi010OO0.I000iOII(this.I00II0Ol1O0l, IIl001iO0Io.I0000oI00(Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O(IIl001iO0Io.I0000oI00(Oi010OO0.I000O01llI0(Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0((this.I00100l0.hashCode() + ((iHashCode + (aICoreModelPreference == null ? 0 : aICoreModelPreference.hashCode())) * 31)) * 31, 31, this.I00100o1O0lo), 31, this.I0010I0i), 31, this.I0010o), 31, this.I00111O), 31, false), 31, this.I001IIilI0O), 31, this.I001IO000), 31, this.I001i1O0Ol), 31, this.I001i1lo1io), 31, this.I001iOo1i0O), 31, this.I001l0I00), 31, this.I001lIiIIo1O), 31, this.I001lllioOl), 31, this.I001lloI), 31), 31), 31, this.I00IO1)) * 31, 31, this.I00IOO), 31, this.I00IioO0OiOi);
/* 241 */           Object obj = this.I00IlilI0i0i;
/* 279 */           int iI0000O = IIlIOloOOO.I0000O(this.I00IoiI, Oi010OO0.I000iOII(this.I00IoO0, Oi010OO0.I000iOII(this.I00IoIO0lI, Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O((iI000O01llI0 + (obj == null ? 0 : obj.hashCode())) * 31, 31, this.I00Io1lO), 31, this.I00Io1o110i), 31), 31), 31);
/* 283 */           String str = this.I00Iooi00oi;
/* 292 */           return iI0000O + (str != null ? str.hashCode() : 0);
                }

                public final String toString() {
/* 1 */             List list = this.I0000O;
/* 3 */             Object obj = this.I00IlilI0i0i;
/* 5 */             boolean z = this.I00Io1lO;
/* 7 */             boolean z2 = this.I00Io1o110i;
/* 9 */             Map map = this.I00IoIO0lI;
/* 11 */            Map map2 = this.I00IoO0;
/* 13 */            long j = this.I00IoiI;
/* 15 */            String str = this.I00Iooi00oi;
/* 27 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("Model(name=", this.I00000oIO, ", displayName=", this.I00000oOI, ", info=");
/* 33 */            sbI00111O.append(this.I0000Il00O);
/* 38 */            sbI00111O.append(", configs=");
/* 41 */            sbI00111O.append(list);
/* 46 */            sbI00111O.append(", learnMoreUrl=");
/* 51 */            sbI00111O.append(this.I0000oI00);
/* 56 */            sbI00111O.append(", bestForTaskIds=");
/* 61 */            sbI00111O.append(this.I0001Ioi1lo);
/* 66 */            sbI00111O.append(", minDeviceMemoryInGb=");
/* 71 */            sbI00111O.append(this.I000II);
/* 76 */            sbI00111O.append(", url=");
/* 81 */            sbI00111O.append(this.I000O01llI0);
/* 86 */            sbI00111O.append(", sizeInBytes=");
/* 91 */            sbI00111O.append(this.I000OOo1O);
/* 96 */            sbI00111O.append(", downloadFileName=");
/* 101 */           sbI00111O.append(this.I000OiO);
/* 106 */           sbI00111O.append(", version=");
/* 111 */           sbI00111O.append(this.I000iOII);
/* 116 */           sbI00111O.append(", extraDataFiles=");
/* 121 */           sbI00111O.append(this.I000l1);
/* 126 */           sbI00111O.append(", isLlm=");
/* 131 */           sbI00111O.append(this.I000lI);
/* 136 */           sbI00111O.append(", aicoreReleaseStage=");
/* 141 */           sbI00111O.append(this.I000o00OoI0I);
/* 146 */           sbI00111O.append(", aicorePreference=");
/* 151 */           sbI00111O.append(this.I000oI1ioi);
/* 156 */           sbI00111O.append(", runtimeType=");
/* 161 */           sbI00111O.append(this.I00100l0);
/* 172 */           IIl001iO0Io.I001lIiIIo1O(sbI00111O, ", localFileRelativeDirPathOverride=", this.I00100o1O0lo, ", localModelFilePathOverride=", this.I0010I0i);
/* 177 */           sbI00111O.append(", showRunAgainButton=");
/* 182 */           sbI00111O.append(this.I0010o);
/* 187 */           sbI00111O.append(", showBenchmarkButton=");
/* 192 */           sbI00111O.append(this.I00111O);
/* 197 */           sbI00111O.append(", isZip=false, unzipDir=");
/* 202 */           sbI00111O.append(this.I001IIilI0O);
/* 207 */           sbI00111O.append(", llmPromptTemplates=");
/* 212 */           sbI00111O.append(this.I001IO000);
/* 217 */           sbI00111O.append(", llmSupportImage=");
/* 222 */           sbI00111O.append(this.I001i1O0Ol);
/* 227 */           sbI00111O.append(", llmSupportAudio=");
/* 232 */           sbI00111O.append(this.I001i1lo1io);
/* 237 */           sbI00111O.append(", llmSupportTinyGarden=");
/* 242 */           sbI00111O.append(this.I001iOo1i0O);
/* 247 */           sbI00111O.append(", llmSupportMobileActions=");
/* 252 */           sbI00111O.append(this.I001l0I00);
/* 257 */           sbI00111O.append(", llmSupportThinking=");
/* 262 */           sbI00111O.append(this.I001lIiIIo1O);
/* 267 */           sbI00111O.append(", llmSupportSpeculativeDecoding=");
/* 272 */           sbI00111O.append(this.I001lllioOl);
/* 277 */           sbI00111O.append(", capabilities=");
/* 282 */           sbI00111O.append(this.I001lloI);
/* 287 */           sbI00111O.append(", capabilityToTaskTypes=");
/* 292 */           sbI00111O.append(this.I00II0Ol1O0l);
/* 297 */           sbI00111O.append(", llmMaxToken=");
/* 302 */           sbI00111O.append(this.I00II0oii1o);
/* 307 */           sbI00111O.append(", accelerators=");
/* 312 */           sbI00111O.append(this.I00IO1);
/* 317 */           sbI00111O.append(", visionAccelerator=");
/* 322 */           sbI00111O.append(this.I00IO1oi11O);
/* 327 */           sbI00111O.append(", imported=");
/* 332 */           sbI00111O.append(this.I00IOO);
/* 337 */           sbI00111O.append(", normalizedName=");
/* 342 */           sbI00111O.append(this.I00IioO0OiOi);
/* 347 */           sbI00111O.append(", instance=");
/* 350 */           sbI00111O.append(obj);
/* 355 */           sbI00111O.append(", initializing=");
/* 358 */           sbI00111O.append(z);
/* 363 */           sbI00111O.append(", cleanUpAfterInit=");
/* 366 */           sbI00111O.append(z2);
/* 371 */           sbI00111O.append(", configValues=");
/* 374 */           sbI00111O.append(map);
/* 379 */           sbI00111O.append(", prevConfigValues=");
/* 382 */           sbI00111O.append(map2);
/* 387 */           sbI00111O.append(", totalBytes=");
/* 390 */           sbI00111O.append(j);
/* 395 */           sbI00111O.append(", accessToken=");
/* 400 */           return IIl001iO0Io.I00100l0(sbI00111O, str, ")");
                }
            }
