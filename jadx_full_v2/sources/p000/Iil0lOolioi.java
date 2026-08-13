            package p000;

            import android.util.Log;
            import com.google.ai.edge.gallery.worker.DownloadWorker;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.BufferedInputStream;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.io.InterruptedIOException;
            import java.lang.invoke.VarHandle;
            import java.net.SocketException;
            import java.net.UnknownHostException;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.zip.ZipEntry;
            import java.util.zip.ZipInputStream;
            import javax.net.ssl.SSLException;
            
            public final class Iil0lOolioi extends Oll0io implements IlliIl1l11O {
                public List I00iOIl;
                public List I00iiI;
                public Iterator I00iiO;
                public Ool0olii10Ii I00iio;
                public File I00ilI0I1;
                public OI11ol I00ilO0;
                public long I00io1l;
                public int I00ioIO;
                public int I00l0I0l0lO1;
                public final String I00l0OO0IO;
                public final String I00li1OI;
                public final DownloadWorker I00ll1;
                public final String I00lli11;
                public final List I00lll10;
                public final List I00o0iI0io1;
                public final String I00o0l1o1o0;
                public final String I00o101lO;
                public final long I00oI0i;
                public final String I00oII;
                public final boolean I00oIiI10;
                public final String I00oO101o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Iil0lOolioi(String str, String str2, DownloadWorker downloadWorker, String str3, List list, List list2, String str4, String str5, long j, String str6, boolean z, String str7, IOoil1iiIilo iOoil1iiIilo) {
/* 26 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00l0OO0IO = str;
/* 3 */             this.I00li1OI = str2;
/* 5 */             this.I00ll1 = downloadWorker;
/* 7 */             this.I00lli11 = str3;
/* 9 */             this.I00lll10 = list;
/* 11 */            this.I00o0iI0io1 = list2;
/* 13 */            this.I00o0l1o1o0 = str4;
/* 15 */            this.I00o101lO = str5;
/* 17 */            this.I00oI0i = j;
/* 19 */            this.I00oII = str6;
/* 21 */            this.I00oIiI10 = z;
/* 23 */            this.I00oO101o = str7;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 29 */            return new Iil0lOolioi(this.I00l0OO0IO, this.I00li1OI, this.I00ll1, this.I00lli11, this.I00lll10, this.I00o0iI0io1, this.I00o0l1o1o0, this.I00o101lO, this.I00oI0i, this.I00oII, this.I00oIiI10, this.I00oO101o, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((Iil0lOolioi) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Code restructure failed: missing block: B:217:0x016e, code lost:
                
                    r10 = r24;
                    r6 = r37;
                    r24 = r15;
                    r1 = r3;
                    r0 = r5;
                    r5 = r8;
                    r3 = r9;
                    r4 = r36;
                    r15 = r20;
                    r22 = r24;
                    r9 = r35;
                    r24 = r10;
                    r10 = r34;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:114:0x03e7 A[Catch: all -> 0x03eb, CancellationException -> 0x058f, TryCatch #4 {all -> 0x03eb, blocks: (B:112:0x03b6, B:114:0x03e7, B:117:0x03ee, B:119:0x042f, B:121:0x0457, B:129:0x046b, B:136:0x047e, B:133:0x0471, B:134:0x0474, B:135:0x0475, B:137:0x048a, B:105:0x03a1, B:150:0x04e7, B:151:0x04ea, B:152:0x04eb), top: B:201:0x03b6 }] */
                /* JADX WARN: Removed duplicated region for block: B:119:0x042f A[Catch: all -> 0x03eb, CancellationException -> 0x058f, TryCatch #4 {all -> 0x03eb, blocks: (B:112:0x03b6, B:114:0x03e7, B:117:0x03ee, B:119:0x042f, B:121:0x0457, B:129:0x046b, B:136:0x047e, B:133:0x0471, B:134:0x0474, B:135:0x0475, B:137:0x048a, B:105:0x03a1, B:150:0x04e7, B:151:0x04ea, B:152:0x04eb), top: B:201:0x03b6 }] */
                /* JADX WARN: Removed duplicated region for block: B:150:0x04e7 A[Catch: all -> 0x03eb, CancellationException -> 0x058f, TryCatch #4 {all -> 0x03eb, blocks: (B:112:0x03b6, B:114:0x03e7, B:117:0x03ee, B:119:0x042f, B:121:0x0457, B:129:0x046b, B:136:0x047e, B:133:0x0471, B:134:0x0474, B:135:0x0475, B:137:0x048a, B:105:0x03a1, B:150:0x04e7, B:151:0x04ea, B:152:0x04eb), top: B:201:0x03b6 }] */
                /* JADX WARN: Removed duplicated region for block: B:158:0x04ff  */
                /* JADX WARN: Removed duplicated region for block: B:180:0x0535  */
                /* JADX WARN: Removed duplicated region for block: B:183:0x053b  */
                /* JADX WARN: Removed duplicated region for block: B:184:0x0557  */
                /* JADX WARN: Removed duplicated region for block: B:193:0x033e A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:52:0x0174 A[Catch: all -> 0x0058, CancellationException -> 0x058f, TryCatch #6 {CancellationException -> 0x058f, blocks: (B:14:0x003d, B:112:0x03b6, B:114:0x03e7, B:117:0x03ee, B:119:0x042f, B:121:0x0457, B:129:0x046b, B:136:0x047e, B:133:0x0471, B:134:0x0474, B:135:0x0475, B:137:0x048a, B:50:0x016e, B:52:0x0174, B:54:0x01b5, B:56:0x01bd, B:63:0x0207, B:64:0x0212, B:66:0x023f, B:67:0x0242, B:69:0x0251, B:73:0x02ce, B:75:0x02d2, B:91:0x033e, B:95:0x0349, B:97:0x034f, B:99:0x0366, B:100:0x0369, B:103:0x0372, B:105:0x03a1, B:150:0x04e7, B:151:0x04ea, B:152:0x04eb, B:26:0x00b2, B:29:0x00dc, B:30:0x00f0, B:45:0x011b, B:48:0x0132, B:49:0x0156, B:37:0x0104, B:39:0x0109), top: B:204:0x001f }] */
                /* JADX WARN: Removed duplicated region for block: B:75:0x02d2 A[Catch: all -> 0x02d9, CancellationException -> 0x058f, TRY_LEAVE, TryCatch #6 {CancellationException -> 0x058f, blocks: (B:14:0x003d, B:112:0x03b6, B:114:0x03e7, B:117:0x03ee, B:119:0x042f, B:121:0x0457, B:129:0x046b, B:136:0x047e, B:133:0x0471, B:134:0x0474, B:135:0x0475, B:137:0x048a, B:50:0x016e, B:52:0x0174, B:54:0x01b5, B:56:0x01bd, B:63:0x0207, B:64:0x0212, B:66:0x023f, B:67:0x0242, B:69:0x0251, B:73:0x02ce, B:75:0x02d2, B:91:0x033e, B:95:0x0349, B:97:0x034f, B:99:0x0366, B:100:0x0369, B:103:0x0372, B:105:0x03a1, B:150:0x04e7, B:151:0x04ea, B:152:0x04eb, B:26:0x00b2, B:29:0x00dc, B:30:0x00f0, B:45:0x011b, B:48:0x0132, B:49:0x0156, B:37:0x0104, B:39:0x0109), top: B:204:0x001f }] */
                /* JADX WARN: Removed duplicated region for block: B:79:0x02de  */
                /* JADX WARN: Removed duplicated region for block: B:88:0x0333  */
                /* JADX WARN: Removed duplicated region for block: B:95:0x0349 A[Catch: all -> 0x0342, CancellationException -> 0x058f, TryCatch #0 {all -> 0x0342, blocks: (B:91:0x033e, B:95:0x0349, B:97:0x034f, B:99:0x0366, B:100:0x0369, B:103:0x0372), top: B:193:0x033e }] */
                /* JADX WARN: Removed duplicated region for block: B:97:0x034f A[Catch: all -> 0x0342, CancellationException -> 0x058f, TryCatch #0 {all -> 0x0342, blocks: (B:91:0x033e, B:95:0x0349, B:97:0x034f, B:99:0x0366, B:100:0x0369, B:103:0x0372), top: B:193:0x033e }] */
                /* JADX WARN: Type inference failed for: r0v65, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r0v71, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r0v76, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r15v1, types: [OI11ol, Ool0olii10Ii, java.io.File] */
                /* JADX WARN: Type inference failed for: r15v11 */
                /* JADX WARN: Type inference failed for: r15v7 */
                /* JADX WARN: Type inference failed for: r1v51, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r4v10, types: [boolean] */
                /* JADX WARN: Type inference failed for: r5v42, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r8v14, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r8v18, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r8v21, types: [java.util.List] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x03b3 -> B:201:0x03b6). Please report as a decompilation issue!!! */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    boolean z;
                    boolean z2;
                    boolean z3;
                    String str;
                    boolean z4;
                    String str2;
                    ArrayList arrayList;
                    Iterator it;
                    ArrayList arrayList2;
                    long length;
                    OI11ol oI11ol;
                    int i;
                    Throwable th;
                    DownloadWorker downloadWorker;
                    String str3;
                    String str4;
                    String str5;
                    OoiIlOl1iI ooiIlOl1iI;
                    ?? r15;
                    ArrayList arrayList3;
                    ArrayList arrayList4;
                    Iterator it2;
                    File file;
                    Object objI0001Ioi1lo;
                    Long l;
                    String str6;
                    DownloadWorker downloadWorker2;
                    String str7;
                    ArrayList arrayList5;
                    Ool0olii10Ii ool0olii10Ii;
                    String str8;
                    String str9;
                    File file2;
                    Object objI0000Il00O;
                    Iterator it3;
                    long j;
                    int iBooleanValue;
                    int i2;
                    OI11ol oI11ol2;
                    Iterator it4;
/* 3 */             List list = this.I00lll10;
/* 5 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 7 */             int i3 = this.I00l0I0l0lO1;
/* 13 */            String str10 = this.I00lli11;
/* 15 */            OoiIlOl1iI ooiIlOl1iI2 = OoiIlOl1iI.I00000oIO;
/* 17 */            String str11 = this.I00oO101o;
/* 21 */            String str12 = this.I00l0OO0IO;
/* 23 */            String str13 = this.I00li1OI;
/* 25 */            String str14 = this.I00o101lO;
/* 27 */            String str15 = this.I00o0l1o1o0;
/* 30 */            DownloadWorker downloadWorker3 = this.I00ll1;
                    try {
                        try {
/* 32 */                    if (i3 == 0) {
/* 248 */                       str = null;
/* 250 */                       lIoii1l01l0i.I00000oOI(obj);
/* 253 */                       if (str12 == null || str13 == null) {
/* 1428 */                          return new O10o0OiIIll();
                                }
/* 261 */                       IliliOOliOi ililiOOliOiI0000O = DownloadWorker.I0000O(downloadWorker3, str10, 12);
/* 265 */                       z4 = true;
                                try {
/* 266 */                           this.I00l0I0l0lO1 = 1;
/* 272 */                           Object objI00000oIO = l10oIiO1Il.I00000oIO(downloadWorker3.setForegroundAsync(ililiOOliOiI0000O), this);
/* 276 */                           if (objI00000oIO != ii0111o) {
/* 279 */                               objI00000oIO = ooiIlOl1iI2;
                                    }
/* 280 */                           if (objI00000oIO == ii0111o) {
/* 947 */                               return ii0111o;
                                    }
                                } catch (Throwable th2) {
/* 1270 */                          th = th2;
/* 1271 */                          z = z4;
/* 1273 */                          downloadWorker3.getClass();
/* 1278 */                          if (th instanceof InterruptedIOException) {
                                    }
/* 1338 */                          if (!z2) {
                                    }
                                }
                            } else if (i3 == 1) {
/* 241 */                       str = null;
/* 243 */                       lIoii1l01l0i.I00000oOI(obj);
/* 246 */                       z4 = true;
                            } else {
/* 39 */                        if (i3 == 2) {
/* 205 */                           long j2 = this.I00io1l;
/* 207 */                           Ool0olii10Ii ool0olii10Ii2 = this.I00iio;
/* 209 */                           Iterator it5 = this.I00iiO;
/* 211 */                           List list2 = this.I00iiI;
/* 217 */                           List list3 = this.I00iOIl;
/* 221 */                           lIoii1l01l0i.I00000oOI(obj);
/* 226 */                           it = it5;
/* 229 */                           str2 = str11;
/* 231 */                           length = j2;
/* 520 */                           String str16 = ool0olii10Ii2.I00000oOI;
/* 522 */                           arrayList = list3;
/* 523 */                           arrayList2 = list2;
/* 525 */                           str10 = str10;
/* 527 */                           str = null;
/* 371 */                           while (it.hasNext()) {
                                    }
/* 1266 */                          return new O10o0oOio1(Ii11I1OOII1.I00000oOI);
                                }
/* 42 */                        if (i3 == 3) {
/* 157 */                           long j3 = this.I00io1l;
/* 159 */                           oI11ol = this.I00ilO0;
/* 161 */                           file2 = this.I00ilI0I1;
/* 163 */                           ool0olii10Ii = this.I00iio;
/* 167 */                           Iterator it6 = this.I00iiO;
/* 169 */                           List list4 = this.I00iiI;
/* 175 */                           List list5 = this.I00iOIl;
/* 179 */                           lIoii1l01l0i.I00000oOI(obj);
/* 182 */                           str6 = str15;
/* 184 */                           downloadWorker2 = downloadWorker3;
/* 186 */                           str9 = str13;
/* 187 */                           objI0000Il00O = obj;
/* 189 */                           arrayList5 = list4;
/* 192 */                           arrayList3 = list5;
/* 193 */                           j = j3;
/* 195 */                           str2 = str11;
/* 197 */                           it3 = it6;
/* 199 */                           str7 = str10;
/* 201 */                           str8 = str14;
/* 719 */                           Boolean bool = (Boolean) objI0000Il00O;
/* 735 */                           if (bool == null) {
                                    }
/* 727 */                           String str17 = str9;
/* 737 */                           DownloadWorker downloadWorker4 = this.I00ll1;
/* 741 */                           String str18 = str8;
/* 743 */                           long j4 = this.I00oI0i;
/* 745 */                           Ool0olii10Ii ool0olii10Ii3 = ool0olii10Ii;
/* 747 */                           String str19 = this.I00oII;
/* 754 */                           this.I00iOIl = arrayList3;
/* 759 */                           this.I00iiI = arrayList5;
/* 761 */                           this.I00iiO = it3;
/* 764 */                           this.I00iio = null;
/* 766 */                           this.I00ilI0I1 = file2;
/* 768 */                           this.I00ilO0 = oI11ol;
/* 770 */                           this.I00io1l = j;
/* 772 */                           this.I00ioIO = iBooleanValue;
/* 775 */                           this.I00l0I0l0lO1 = 4;
/* 777 */                           str5 = str17;
/* 779 */                           oI11ol2 = oI11ol;
/* 781 */                           i2 = iBooleanValue;
/* 785 */                           ooiIlOl1iI = ooiIlOl1iI2;
/* 787 */                           str4 = str18;
/* 789 */                           downloadWorker = downloadWorker2;
/* 791 */                           str3 = str6;
/* 797 */                           z = true;
/* 800 */                           r15 = 0;
/* 801 */                           str10 = str7;
/* 807 */                           it4 = it3;
/* 809 */                           file = file2;
/* 812 */                           objI0001Ioi1lo = downloadWorker4.I0001Ioi1lo(ool0olii10Ii3, file, j, j4, str10, str19, arrayList3, arrayList5, this);
/* 816 */                           if (objI0001Ioi1lo != ii0111o) {
                                    }
/* 947 */                           return ii0111o;
                                }
/* 45 */                        if (i3 == 4) {
/* 100 */                           i = this.I00ioIO;
/* 102 */                           oI11ol = this.I00ilO0;
/* 104 */                           File file3 = this.I00ilI0I1;
/* 106 */                           it2 = this.I00iiO;
/* 108 */                           List list6 = this.I00iiI;
/* 114 */                           List list7 = this.I00iOIl;
                                    try {
/* 118 */                               lIoii1l01l0i.I00000oOI(obj);
/* 123 */                               str2 = str11;
/* 125 */                               file = file3;
/* 127 */                               str3 = str15;
/* 129 */                               downloadWorker = downloadWorker3;
/* 131 */                               str4 = str14;
/* 133 */                               str5 = str13;
/* 135 */                               ooiIlOl1iI = ooiIlOl1iI2;
/* 137 */                               r15 = 0;
/* 145 */                               z = true;
/* 147 */                               arrayList3 = list7;
/* 148 */                               objI0001Ioi1lo = obj;
                                        arrayList4 = list6;
/* 827 */                               l = (Long) objI0001Ioi1lo;
/* 829 */                               if (i != 0) {
                                        }
/* 840 */                               if (l != null) {
                                        }
                                    } catch (Throwable th3) {
/* 152 */                               th = th3;
/* 1254 */                              if (i != 0) {
                                        }
/* 1259 */                              throw th;
                                    }
                                } else {
/* 48 */                            if (i3 != 5) {
/* 96 */                                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 37 */                                return null;
                                    }
/* 50 */                            long j5 = this.I00io1l;
/* 52 */                            Iterator it7 = this.I00iiO;
/* 54 */                            List list8 = this.I00iiI;
/* 58 */                            List list9 = this.I00iOIl;
/* 62 */                            lIoii1l01l0i.I00000oOI(obj);
/* 65 */                            str2 = str11;
/* 67 */                            str3 = str15;
/* 69 */                            str4 = str14;
/* 71 */                            str5 = str13;
/* 73 */                            ooiIlOl1iI = ooiIlOl1iI2;
/* 83 */                            z = true;
/* 85 */                            long j6 = j5;
                                    ArrayList arrayList6 = list9;
                                    ArrayList arrayList7 = list8;
                                    try {
/* 953 */                               File file4 = downloadWorker3.I0000Il00O;
/* 955 */                               String str20 = str2;
/* 957 */                               String str21 = str4;
/* 959 */                               String str22 = str3;
/* 965 */                               List listI000O01llI0 = IOOi1I.I000O01llI0(str22, str21, str20);
/* 973 */                               String str23 = File.separator;
/* 983 */                               long j7 = j6;
/* 991 */                               File file5 = new File(file4, IOOi0Ool1i.I00IlilI0i0i(listI000O01llI0, str23, null, null, null, 62));
/* 998 */                               if (!file5.exists()) {
/* 1000 */                                  file5.mkdirs();
                                        }
/* 1009 */                              byte[] bArr = new byte[Barcode.FORMAT_AZTEC];
/* 1011 */                              File file6 = downloadWorker3.I0000Il00O;
/* 1013 */                              Iterator it8 = it7;
/* 1017 */                              StringBuilder sb = new StringBuilder();
/* 1020 */                              sb.append(file6);
/* 1023 */                              sb.append(str23);
/* 1026 */                              sb.append(str22);
/* 1029 */                              sb.append(str23);
/* 1032 */                              sb.append(str21);
/* 1035 */                              sb.append(str23);
/* 1038 */                              String str24 = str5;
/* 1040 */                              sb.append(str24);
/* 1043 */                              String string = sb.toString();
/* 1063 */                              ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(string)));
/* 1066 */                              ZipEntry nextEntry = zipInputStream.getNextEntry();
                                        ArrayList arrayList8 = arrayList6;
/* 1070 */                              while (nextEntry != null) {
/* 1076 */                                  ZipEntry zipEntry = nextEntry;
/* 1080 */                                  File file7 = file5;
/* 1086 */                                  ArrayList arrayList9 = arrayList8;
/* 1102 */                                  String str25 = file5.getAbsolutePath() + File.separator + zipEntry.getName();
/* 1110 */                                  if (zipEntry.isDirectory()) {
/* 1148 */                                      new File(str25).mkdirs();
                                            } else {
/* 1114 */                                      FileOutputStream fileOutputStream = new FileOutputStream(str25);
                                                while (true) {
                                                    try {
/* 1117 */                                              int i4 = zipInputStream.read(bArr);
/* 1121 */                                              if (i4 <= 0) {
                                                            break;
                                                        }
/* 1124 */                                              fileOutputStream.write(bArr, 0, i4);
                                                    } catch (Throwable th4) {
                                                        try {
/* 1136 */                                                  throw th4;
                                                        } catch (Throwable th5) {
/* 1138 */                                                  ii1OOii.I00000oIO(fileOutputStream, th4);
/* 1141 */                                                  throw th5;
                                                        }
                                                    }
                                                }
/* 1132 */                                      ii1OOii.I00000oIO(fileOutputStream, null);
                                            }
/* 1151 */                                  zipInputStream.closeEntry();
/* 1154 */                                  nextEntry = zipInputStream.getNextEntry();
/* 1158 */                                  file5 = file7;
/* 1160 */                                  arrayList8 = arrayList9;
                                        }
/* 1163 */                              ArrayList arrayList10 = arrayList8;
/* 1166 */                              zipInputStream.close();
/* 1174 */                              new File(string).delete();
/* 1177 */                              it = it8;
/* 1179 */                              str = null;
/* 1181 */                              arrayList2 = arrayList7;
/* 1182 */                              str2 = str20;
/* 1184 */                              str15 = str22;
/* 1185 */                              ooiIlOl1iI2 = ooiIlOl1iI;
/* 1187 */                              arrayList = arrayList10;
/* 1189 */                              length = j7;
/* 1191 */                              str13 = str24;
/* 1193 */                              str14 = str21;
/* 371 */                               while (it.hasNext()) {
/* 377 */                                   ool0olii10Ii = (Ool0olii10Ii) it.next();
/* 379 */                                   ArrayList arrayList11 = arrayList;
/* 383 */                                   ArrayList arrayList12 = arrayList2;
/* 389 */                                   str7 = str10;
/* 393 */                                   File externalFilesDir = downloadWorker3.getApplicationContext().getExternalFilesDir(str);
/* 403 */                                   List listI000O01llI02 = IOOi1I.I000O01llI0(str15, str14, ool0olii10Ii.I00000oOI);
/* 411 */                                   String str26 = File.separator;
/* 429 */                                   File file8 = new File(externalFilesDir, IOOi0Ool1i.I00IlilI0i0i(listI000O01llI02, str26, null, null, null, 62));
/* 436 */                                   if (!file8.exists() || file8.length() <= 0) {
                                                try {
/* 567 */                                           File file9 = new File(downloadWorker3.getApplicationContext().getExternalFilesDir(null), IOOi0Ool1i.I00IlilI0i0i(IOOi1I.I000O01llI0(str15, str14), str26, null, null, null, 62));
/* 574 */                                           if (!file9.exists()) {
/* 576 */                                               file9.mkdirs();
                                                    }
/* 633 */                                           file2 = new File(downloadWorker3.getApplicationContext().getExternalFilesDir(null), IOOi0Ool1i.I00IlilI0i0i(IOOi1I.I000O01llI0(str15, str14, ool0olii10Ii.I00000oOI + ".gallerytmp"), str26, null, null, null, 62));
/* 636 */                                           ConcurrentHashMap concurrentHashMap = Iil0ll0OI.I00000oOI;
/* 638 */                                           String absolutePath = file2.getAbsolutePath();
/* 644 */                                           str6 = str15;
/* 647 */                                           Iil0iiOiI iil0iiOiI = new Iil0iiOiI(0);
/* 652 */                                           Iil0l0oOi iil0l0oOi = new Iil0l0oOi();
/* 655 */                                           iil0l0oOi.I00000oIO = iil0iiOiI;
/* 657 */                                           VarHandle.storeStoreFence();
/* 664 */                                           oI11ol = (OI11ol) concurrentHashMap.computeIfAbsent(absolutePath, iil0l0oOi);
/* 671 */                                           I0II0OiI i0II0OiI = new I0II0OiI(oI11ol, (IOoil1iiIilo) null, 16);
/* 678 */                                           this.I00iOIl = arrayList11;
/* 684 */                                           this.I00iiI = arrayList12;
/* 686 */                                           this.I00iiO = it;
/* 688 */                                           this.I00iio = ool0olii10Ii;
/* 690 */                                           this.I00ilI0I1 = file2;
/* 692 */                                           this.I00ilO0 = oI11ol;
/* 694 */                                           this.I00io1l = length;
/* 697 */                                           this.I00l0I0l0lO1 = 3;
/* 702 */                                           objI0000Il00O = lOlo0o.I0000Il00O(60000L, i0II0OiI, this);
/* 706 */                                           if (objI0000Il00O == ii0111o) {
/* 947 */                                               return ii0111o;
                                                    }
                                                    try {
                                                        try {
                                                            try {
/* 711 */                                                       it3 = it;
/* 712 */                                                       j = length;
/* 713 */                                                       str8 = str14;
/* 714 */                                                       str9 = str13;
/* 715 */                                                       arrayList5 = arrayList12;
/* 717 */                                                       arrayList3 = arrayList11;
/* 719 */                                                       Boolean bool2 = (Boolean) objI0000Il00O;
/* 735 */                                                       iBooleanValue = bool2 == null ? bool2.booleanValue() : 0;
/* 737 */                                                       DownloadWorker downloadWorker42 = this.I00ll1;
/* 741 */                                                       String str182 = str8;
/* 743 */                                                       long j42 = this.I00oI0i;
/* 745 */                                                       Ool0olii10Ii ool0olii10Ii32 = ool0olii10Ii;
/* 747 */                                                       String str192 = this.I00oII;
/* 754 */                                                       this.I00iOIl = arrayList3;
/* 759 */                                                       this.I00iiI = arrayList5;
/* 761 */                                                       this.I00iiO = it3;
/* 764 */                                                       this.I00iio = null;
/* 766 */                                                       this.I00ilI0I1 = file2;
/* 768 */                                                       this.I00ilO0 = oI11ol;
/* 770 */                                                       this.I00io1l = j;
/* 772 */                                                       this.I00ioIO = iBooleanValue;
/* 775 */                                                       this.I00l0I0l0lO1 = 4;
/* 812 */                                                       objI0001Ioi1lo = downloadWorker42.I0001Ioi1lo(ool0olii10Ii32, file, j, j42, str10, str192, arrayList3, arrayList5, this);
/* 816 */                                                       if (objI0001Ioi1lo != ii0111o) {
/* 820 */                                                           arrayList4 = arrayList5;
/* 821 */                                                           oI11ol = oI11ol2;
/* 823 */                                                           i = i2;
/* 825 */                                                           it2 = it4;
                                                                    try {
/* 827 */                                                               l = (Long) objI0001Ioi1lo;
/* 829 */                                                               if (i != 0) {
                                                                            try {
/* 2 */                                                                         oI11ol.I00000oOI(null);
                                                                            } catch (Throwable th6) {
/* 835 */                                                                       th = th6;
/* 836 */                                                                       downloadWorker3 = downloadWorker;
/* 1273 */                                                                      downloadWorker3.getClass();
/* 1278 */                                                                      if (!(th instanceof InterruptedIOException) || (th instanceof SocketException) || (th instanceof UnknownHostException) || (th instanceof SSLException)) {
/* 1334 */                                                                          z2 = z;
                                                                                } else {
/* 1295 */                                                                          if (th instanceof IOException) {
/* 1297 */                                                                              String message = th.getMessage();
/* 9 */                                                                                 String str27 = message != null ? message : "";
/* 1307 */                                                                              z3 = false;
/* 1312 */                                                                              if (OlOoOIi0o.I000oI1ioi(str27, "HTTP error code: 5", false) || OlOoOIi0o.I000oI1ioi(str27, "HTTP error code: 408", false) || OlOoOIi0o.I000oI1ioi(str27, "HTTP error code: 429", false)) {
                                                                                        }
                                                                                    } else {
/* 1331 */                                                                              z3 = false;
                                                                                    }
/* 1332 */                                                                          z2 = z3;
                                                                                }
/* 1338 */                                                                      if (!z2) {
/* 1359 */                                                                          Log.w("AGDownloadWorker", "Transient download error (" + th + ") — retrying");
/* 1364 */                                                                          return new O10o0o00();
                                                                                }
/* 1382 */                                                                      Log.e("AGDownloadWorker", "Download failed: " + th, th);
/* 1387 */                                                                      LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 1390 */                                                                      String message2 = th.getMessage();
/* 1394 */                                                                      if (message2 == null) {
/* 1400 */                                                                          message2 = th.getClass().getSimpleName();
                                                                                }
/* 1406 */                                                                      linkedHashMap.put("KEY_MODEL_DOWNLOAD_ERROR_MESSAGE", message2);
/* 1411 */                                                                      Ii11I1OOII1 ii11I1OOII1 = new Ii11I1OOII1(linkedHashMap);
/* 1414 */                                                                      il01ool0o.I0000Il00O(ii11I1OOII1);
/* 1419 */                                                                      return new O10o0OiIIll(ii11I1OOII1);
                                                                            }
                                                                        }
/* 840 */                                                               if (l != null) {
/* 844 */                                                                   return new O10o0OiIIll();
                                                                        }
/* 848 */                                                               long jLongValue = l.longValue();
/* 862 */                                                               File file10 = new File(OlOolloIIOl0.I000iOII(file.getAbsolutePath(), ".gallerytmp", ""));
/* 869 */                                                               if (file10.exists()) {
/* 871 */                                                                   file10.delete();
                                                                        }
/* 874 */                                                               file.renameTo(file10);
/* 879 */                                                               if (!this.I00oIiI10 || str2 == null) {
/* 1197 */                                                                  String str28 = str2;
/* 1199 */                                                                  downloadWorker3 = downloadWorker;
/* 1201 */                                                                  String str29 = r15;
/* 1205 */                                                                  length = jLongValue;
/* 1206 */                                                                  it = it2;
/* 1207 */                                                                  arrayList2 = arrayList4;
/* 1208 */                                                                  arrayList = arrayList3;
/* 1209 */                                                                  str15 = str3;
/* 1210 */                                                                  ooiIlOl1iI2 = ooiIlOl1iI;
/* 1212 */                                                                  str = str29;
/* 1214 */                                                                  str14 = str4;
/* 1216 */                                                                  str2 = str28;
/* 1218 */                                                                  str13 = str5;
/* 371 */                                                                   while (it.hasNext()) {
                                                                            }
                                                                        } else {
/* 885 */                                                                   LinkedHashMap linkedHashMap2 = new LinkedHashMap();
/* 892 */                                                                   linkedHashMap2.put("KEY_MODEL_START_UNZIPPING", Boolean.TRUE);
/* 897 */                                                                   Ii11I1OOII1 ii11I1OOII12 = new Ii11I1OOII1(linkedHashMap2);
/* 900 */                                                                   il01ool0o.I0000Il00O(ii11I1OOII12);
/* 906 */                                                                   this.I00iOIl = arrayList3;
/* 911 */                                                                   this.I00iiI = arrayList4;
/* 913 */                                                                   this.I00iiO = it2;
/* 915 */                                                                   this.I00iio = r15;
/* 917 */                                                                   this.I00ilI0I1 = r15;
/* 919 */                                                                   this.I00ilO0 = r15;
/* 921 */                                                                   this.I00io1l = jLongValue;
/* 923 */                                                                   this.I00ioIO = i;
/* 926 */                                                                   this.I00l0I0l0lO1 = 5;
/* 928 */                                                                   downloadWorker3 = downloadWorker;
/* 934 */                                                                   Object objI00000oIO2 = l10oIiO1Il.I00000oIO(downloadWorker3.setProgressAsync(ii11I1OOII12), this);
/* 940 */                                                                   if (objI00000oIO2 != Ii0111o.I00iOIl) {
/* 943 */                                                                       objI00000oIO2 = ooiIlOl1iI;
                                                                            }
/* 945 */                                                                   if (objI00000oIO2 != ii0111o) {
/* 948 */                                                                       j6 = jLongValue;
/* 949 */                                                                       it7 = it2;
/* 950 */                                                                       arrayList6 = arrayList3;
                                                                                arrayList7 = arrayList4;
/* 953 */                                                                       File file42 = downloadWorker3.I0000Il00O;
/* 955 */                                                                       String str202 = str2;
/* 957 */                                                                       String str212 = str4;
/* 959 */                                                                       String str222 = str3;
/* 965 */                                                                       List listI000O01llI03 = IOOi1I.I000O01llI0(str222, str212, str202);
/* 973 */                                                                       String str232 = File.separator;
/* 983 */                                                                       long j72 = j6;
/* 991 */                                                                       File file52 = new File(file42, IOOi0Ool1i.I00IlilI0i0i(listI000O01llI03, str232, null, null, null, 62));
/* 998 */                                                                       if (!file52.exists()) {
                                                                                }
/* 1009 */                                                                      byte[] bArr2 = new byte[Barcode.FORMAT_AZTEC];
/* 1011 */                                                                      File file62 = downloadWorker3.I0000Il00O;
/* 1013 */                                                                      Iterator it82 = it7;
/* 1017 */                                                                      StringBuilder sb2 = new StringBuilder();
/* 1020 */                                                                      sb2.append(file62);
/* 1023 */                                                                      sb2.append(str232);
/* 1026 */                                                                      sb2.append(str222);
/* 1029 */                                                                      sb2.append(str232);
/* 1032 */                                                                      sb2.append(str212);
/* 1035 */                                                                      sb2.append(str232);
/* 1038 */                                                                      String str242 = str5;
/* 1040 */                                                                      sb2.append(str242);
/* 1043 */                                                                      String string2 = sb2.toString();
/* 1063 */                                                                      ZipInputStream zipInputStream2 = new ZipInputStream(new BufferedInputStream(new FileInputStream(string2)));
/* 1066 */                                                                      ZipEntry nextEntry2 = zipInputStream2.getNextEntry();
                                                                                ArrayList arrayList82 = arrayList6;
/* 1070 */                                                                      while (nextEntry2 != null) {
                                                                                }
/* 1163 */                                                                      ArrayList arrayList102 = arrayList82;
/* 1166 */                                                                      zipInputStream2.close();
/* 1174 */                                                                      new File(string2).delete();
/* 1177 */                                                                      it = it82;
/* 1179 */                                                                      str = null;
/* 1181 */                                                                      arrayList2 = arrayList7;
/* 1182 */                                                                      str2 = str202;
/* 1184 */                                                                      str15 = str222;
/* 1185 */                                                                      ooiIlOl1iI2 = ooiIlOl1iI;
/* 1187 */                                                                      arrayList = arrayList102;
/* 1189 */                                                                      length = j72;
/* 1191 */                                                                      str13 = str242;
/* 1193 */                                                                      str14 = str212;
/* 371 */                                                                       while (it.hasNext()) {
                                                                                }
                                                                            }
                                                                        }
                                                                    } catch (Throwable th7) {
/* 1222 */                                                              th = th7;
/* 1254 */                                                              if (i != 0) {
/* 2 */                                                                     oI11ol.I00000oOI(null);
                                                                        }
/* 1259 */                                                              throw th;
                                                                    }
                                                                }
/* 947 */                                                       return ii0111o;
                                                            } catch (Throwable th8) {
/* 1226 */                                                      th = th8;
/* 1229 */                                                      oI11ol = oI11ol2;
/* 1231 */                                                      i = i2;
/* 1254 */                                                      if (i != 0) {
                                                                }
/* 1259 */                                                      throw th;
                                                            }
/* 777 */                                                   str5 = str17;
/* 779 */                                                   oI11ol2 = oI11ol;
/* 781 */                                                   i2 = iBooleanValue;
/* 785 */                                                   ooiIlOl1iI = ooiIlOl1iI2;
/* 787 */                                                   str4 = str182;
/* 789 */                                                   downloadWorker = downloadWorker2;
/* 791 */                                                   str3 = str6;
/* 797 */                                                   z = true;
/* 800 */                                                   r15 = 0;
/* 801 */                                                   str10 = str7;
/* 807 */                                                   it4 = it3;
/* 809 */                                                   file = file2;
                                                        } catch (Throwable th9) {
/* 1234 */                                                  th = th9;
/* 1237 */                                                  i2 = iBooleanValue;
                                                        }
/* 727 */                                               String str172 = str9;
                                                    } catch (Throwable th10) {
/* 1244 */                                              th = th10;
/* 1245 */                                              oI11ol2 = oI11ol;
/* 1247 */                                              i2 = iBooleanValue;
                                                    }
                                                } catch (Throwable th11) {
/* 730 */                                           th = th11;
/* 731 */                                           downloadWorker3 = downloadWorker2;
/* 90 */                                            z = true;
/* 1273 */                                          downloadWorker3.getClass();
/* 1278 */                                          if (th instanceof InterruptedIOException) {
                                                    }
/* 1338 */                                          if (!z2) {
                                                    }
                                                }
/* 592 */                                       downloadWorker2 = downloadWorker3;
                                            } else {
/* 450 */                                       length += file8.length();
/* 454 */                                       LinkedHashMap linkedHashMap3 = new LinkedHashMap();
/* 463 */                                       linkedHashMap3.put("KEY_MODEL_DOWNLOAD_RECEIVED_BYTES", Long.valueOf(length));
/* 468 */                                       Ii11I1OOII1 ii11I1OOII13 = new Ii11I1OOII1(linkedHashMap3);
/* 471 */                                       il01ool0o.I0000Il00O(ii11I1OOII13);
/* 478 */                                       this.I00iOIl = arrayList11;
/* 484 */                                       this.I00iiI = arrayList12;
/* 486 */                                       this.I00iiO = it;
/* 488 */                                       this.I00iio = ool0olii10Ii;
/* 491 */                                       this.I00ilI0I1 = null;
/* 493 */                                       this.I00ilO0 = null;
/* 495 */                                       this.I00io1l = length;
/* 498 */                                       this.I00l0I0l0lO1 = 2;
/* 504 */                                       Object objI00000oIO3 = l10oIiO1Il.I00000oIO(downloadWorker3.setProgressAsync(ii11I1OOII13), this);
/* 510 */                                       if (objI00000oIO3 != Ii0111o.I00iOIl) {
/* 513 */                                           objI00000oIO3 = ooiIlOl1iI2;
                                                }
/* 514 */                                       if (objI00000oIO3 == ii0111o) {
/* 947 */                                           return ii0111o;
                                                }
/* 520 */                                       String str30 = ool0olii10Ii.I00000oOI;
/* 522 */                                       arrayList = arrayList11;
/* 523 */                                       arrayList2 = arrayList12;
/* 525 */                                       str10 = str7;
/* 527 */                                       str = null;
                                            }
                                        }
/* 1266 */                              return new O10o0oOio1(Ii11I1OOII1.I00000oOI);
                                    } catch (Throwable th12) {
/* 1004 */                              th = th12;
/* 1273 */                              downloadWorker3.getClass();
/* 1278 */                              if (th instanceof InterruptedIOException) {
/* 1334 */                                  z2 = z;
                                        }
/* 1338 */                              if (!z2) {
                                        }
                                    }
                                }
                            }
/* 286 */                   ArrayList arrayList13 = new ArrayList();
/* 294 */                   arrayList13.add(new Ool0olii10Ii(str12, str13));
/* 300 */                   int size = list.size();
/* 304 */                   int i5 = 0;
/* 305 */                   while (i5 < size) {
/* 332 */                       arrayList13.add(new Ool0olii10Ii((String) list.get(i5), (String) this.I00o0iI0io1.get(i5)));
/* 335 */                       i5++;
/* 337 */                       str11 = str11;
/* 339 */                       list = list;
                            }
/* 343 */                   str2 = str11;
/* 345 */                   arrayList13.toString();
/* 350 */                   ArrayList arrayList14 = new ArrayList();
/* 355 */                   ArrayList arrayList15 = new ArrayList();
/* 362 */                   arrayList = arrayList14;
/* 358 */                   it = arrayList13.iterator();
/* 364 */                   arrayList2 = arrayList15;
/* 365 */                   length = 0;
/* 371 */                   while (it.hasNext()) {
                            }
/* 1266 */                  return new O10o0oOio1(Ii11I1OOII1.I00000oOI);
                        } catch (CancellationException e) {
/* 1425 */                  throw e;
                        }
                    } catch (Throwable th13) {
/* 89 */                th = th13;
                    }
                }
            }
