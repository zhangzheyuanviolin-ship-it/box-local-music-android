            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            
/* 41 */    public final class O1oiOloOo {
                public final List I00000oIO;
                public final Map I00000oOI;
                public final Map I0000Il00O;
                public final Map I0000O;
                public final boolean I0000oI00;
                public final String I0001Ioi1lo;
                public final O1oIOiI11o0 I000II;
                public final List I000O01llI0;
                public final long I000OOo1O;
                public final long I000OiO;
                public final String I000iOII;
                public final float I000l1;
                public final String I000lI;
                public final String I000o00OoI0I;
                public final boolean I000oI1ioi;

                public O1oiOloOo(List list, Map map, Map map2, List list2, int i) {
/* 39 */            this(list, Il011I1OiO0I.I00iOIl, map, map2, true, "", O1oi0ol1o00.I00000oOI, (i & Barcode.FORMAT_ITF) != 0 ? Il01100l.I00iOIl : list2, 0L, 0L, null, 0.0f, null, null, false);
                }

                public static O1oiOloOo I00000oIO(O1oiOloOo o1oiOloOo, List list, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashMap linkedHashMap3, boolean z, String str, O1oIOiI11o0 o1oIOiI11o0, ArrayList arrayList, long j, long j2, String str2, float f, String str3, String str4, boolean z2, int i) {
                    List list2 = (i & 1) != 0 ? o1oiOloOo.I00000oIO : list;
                    Map map = (i & 2) != 0 ? o1oiOloOo.I00000oOI : linkedHashMap;
                    Map map2 = (i & 4) != 0 ? o1oiOloOo.I0000Il00O : linkedHashMap2;
                    Map map3 = (i & 8) != 0 ? o1oiOloOo.I0000O : linkedHashMap3;
                    boolean z3 = (i & 16) != 0 ? o1oiOloOo.I0000oI00 : z;
                    String str5 = (i & 32) != 0 ? o1oiOloOo.I0001Ioi1lo : str;
                    O1oIOiI11o0 o1oIOiI11o02 = (i & 64) != 0 ? o1oiOloOo.I000II : o1oIOiI11o0;
                    List list3 = (i & Barcode.FORMAT_ITF) != 0 ? o1oiOloOo.I000O01llI0 : arrayList;
                    long j3 = (i & Barcode.FORMAT_QR_CODE) != 0 ? o1oiOloOo.I000OOo1O : j;
                    long j4 = (i & Barcode.FORMAT_UPC_A) != 0 ? o1oiOloOo.I000OiO : j2;
                    String str6 = (i & Barcode.FORMAT_UPC_E) != 0 ? o1oiOloOo.I000iOII : str2;
                    float f2 = (i & Barcode.FORMAT_PDF417) != 0 ? o1oiOloOo.I000l1 : f;
                    List list4 = list2;
                    String str7 = (i & Barcode.FORMAT_AZTEC) != 0 ? o1oiOloOo.I000lI : str3;
                    String str8 = (i & 8192) != 0 ? o1oiOloOo.I000o00OoI0I : str4;
                    boolean z4 = (i & 16384) != 0 ? o1oiOloOo.I000oI1ioi : z2;
                    o1oiOloOo.getClass();
/* 1 */             return new O1oiOloOo(list4, map, map2, map3, z3, str5, o1oIOiI11o02, list3, j3, j4, str6, f2, str7, str8, z4);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof O1oiOloOo)) {
/* 7 */                 return false;
                    }
/* 11 */            O1oiOloOo o1oiOloOo = (O1oiOloOo) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, o1oiOloOo.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, o1oiOloOo.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, o1oiOloOo.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, o1oiOloOo.I0000O) && this.I0000oI00 == o1oiOloOo.I0000oI00 && O0000Ioio00.I0000O(this.I0001Ioi1lo, o1oiOloOo.I0001Ioi1lo) && O0000Ioio00.I0000O(this.I000II, o1oiOloOo.I000II) && O0000Ioio00.I0000O(this.I000O01llI0, o1oiOloOo.I000O01llI0) && this.I000OOo1O == o1oiOloOo.I000OOo1O && this.I000OiO == o1oiOloOo.I000OiO && O0000Ioio00.I0000O(this.I000iOII, o1oiOloOo.I000iOII) && Float.compare(this.I000l1, o1oiOloOo.I000l1) == 0 && O0000Ioio00.I0000O(this.I000lI, o1oiOloOo.I000lI) && O0000Ioio00.I0000O(this.I000o00OoI0I, o1oiOloOo.I000o00OoI0I) && this.I000oI1ioi == o1oiOloOo.I000oI1ioi;
                }

                public final int hashCode() {
/* 62 */            int iI0000O = IIlIOloOOO.I0000O(this.I000OiO, IIlIOloOOO.I0000O(this.I000OOo1O, IIl001iO0Io.I0000oI00((this.I000II.hashCode() + Oi010OO0.I000O01llI0(Oi010OO0.I000OOo1O(Oi010OO0.I000iOII(this.I0000O, Oi010OO0.I000iOII(this.I0000Il00O, Oi010OO0.I000iOII(this.I00000oOI, this.I00000oIO.hashCode() * 31, 31), 31), 31), 31, this.I0000oI00), 31, this.I0001Ioi1lo)) * 31, 31, this.I000O01llI0), 31), 31);
/* 67 */            String str = this.I000iOII;
/* 81 */            int iI0000O2 = OooioIOo1.I0000O((iI0000O + (str == null ? 0 : str.hashCode())) * 31, 31, this.I000l1);
/* 85 */            String str2 = this.I000lI;
/* 96 */            int iHashCode = (iI0000O2 + (str2 == null ? 0 : str2.hashCode())) * 31;
/* 97 */            String str3 = this.I000o00OoI0I;
/* 114 */           return Boolean.hashCode(this.I000oI1ioi) + ((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("ModelManagerUiState(tasks=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", tasksByCategory=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", modelDownloadStatus=");
/* 30 */            sb.append(this.I0000Il00O);
/* 35 */            sb.append(", modelInitializationStatus=");
/* 40 */            sb.append(this.I0000O);
/* 45 */            sb.append(", loadingModelAllowlist=");
/* 50 */            sb.append(this.I0000oI00);
/* 55 */            sb.append(", loadingModelAllowlistError=");
/* 60 */            sb.append(this.I0001Ioi1lo);
/* 65 */            sb.append(", selectedModel=");
/* 70 */            sb.append(this.I000II);
/* 75 */            sb.append(", textInputHistory=");
/* 80 */            sb.append(this.I000O01llI0);
/* 85 */            sb.append(", configValuesUpdateTrigger=");
/* 90 */            sb.append(this.I000OOo1O);
/* 95 */            sb.append(", modelImportingUpdateTrigger=");
/* 100 */           sb.append(this.I000OiO);
/* 105 */           sb.append(", listImportingTaskId=");
/* 110 */           sb.append(this.I000iOII);
/* 115 */           sb.append(", listImportProgress=");
/* 120 */           sb.append(this.I000l1);
/* 125 */           sb.append(", listImportError=");
/* 136 */           IIl001iO0Io.I001lIiIIo1O(sb, this.I000lI, ", pendingShortcutTaskId=", this.I000o00OoI0I, ", pendingShortcutVoiceMode=");
/* 143 */           return IIlIOloOOO.I0010o(sb, this.I000oI1ioi, ")");
                }

/* 42 */        public O1oiOloOo(List list, Map map, Map map2, Map map3, boolean z, String str, O1oIOiI11o0 o1oIOiI11o0, List list2, long j, long j2, String str2, float f, String str3, String str4, boolean z2) {
/* 44 */            this.I00000oIO = list;
/* 45 */            this.I00000oOI = map;
/* 46 */            this.I0000Il00O = map2;
/* 47 */            this.I0000O = map3;
/* 48 */            this.I0000oI00 = z;
/* 49 */            this.I0001Ioi1lo = str;
/* 50 */            this.I000II = o1oIOiI11o0;
/* 51 */            this.I000O01llI0 = list2;
/* 52 */            this.I000OOo1O = j;
/* 53 */            this.I000OiO = j2;
/* 54 */            this.I000iOII = str2;
/* 55 */            this.I000l1 = f;
/* 56 */            this.I000lI = str3;
/* 57 */            this.I000o00OoI0I = str4;
/* 58 */            this.I000oI1ioi = z2;
                }
            }
