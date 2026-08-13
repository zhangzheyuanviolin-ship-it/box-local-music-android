            package p000;

            import android.os.Parcel;
            import android.os.SystemClock;
            import android.util.Log;
            import androidx.profileinstaller.ProfileInstallReceiver;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.File;
            import java.lang.invoke.VarHandle;
            import java.text.SimpleDateFormat;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Date;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.Set;
            import java.util.concurrent.atomic.AtomicInteger;
            import kotlin.jvm.functions.Function1;
            
/* 45 */    public final class Oi1ol0llI implements IIOOlli1, OO1ll1, OOIoilO1I10I, IIoi0lIOo, I11101ii1, i00Io1IOlo0, OOooilOIIl0I, l0iolil1I1, ioooOO1I1, lo11I0lO {
                public static Oi1ol0llI I00iiO;
                public static final Oi1oo0 I00iio = new Oi1oo0(0, 0, 0, false, false);
                public static final IloolOiO0 I00ilI0I1 = new IloolOiO0(1);
                public static final o0lo000iOiio I00ilO0 = new o0lo000iOiio();
                public final int I00iOIl;
                public Object I00iiI;

                public Oi1ol0llI(int i) {
/* 1 */             this.I00iOIl = i;
                    switch (i) {
                        case 8:
/* 43 */                    this.I00iiI = new OlI00Io1(iIIllI.I00000oIO);
                            break;
                        case 12:
/* 30 */                    this.I00iiI = new OI110O0(new O0lO1lilIooO[16]);
                            break;
                        default:
/* 15 */                    this.I00iiI = new AtomicInteger(0);
                            break;
                    }
                }

                public static synchronized Oi1ol0llI I000l1() {
                    Oi1ol0llI oi1ol0llI;
/* 4 */             oi1ol0llI = I00iiO;
/* 6 */             if (oi1ol0llI == null) {
/* 12 */                oi1ol0llI = new Oi1ol0llI(0, false);
/* 15 */                I00iiO = oi1ol0llI;
                    }
/* 21 */            return oi1ol0llI;
                }

                public static void I000o00OoI0I(File file, ArrayList arrayList) {
                    File[] fileArrListFiles;
/* 5 */             if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
/* 17 */                for (File file2 : fileArrListFiles) {
/* 25 */                    if (!file2.isDirectory()) {
/* 50 */                        String lowerCase = file2.getName().toLowerCase(Locale.US);
/* 60 */                        if ((lowerCase.endsWith(".ttf") || lowerCase.endsWith(".otf") || lowerCase.endsWith(".pfb") || lowerCase.endsWith(".ttc")) && !lowerCase.startsWith("fonts.")) {
/* 98 */                            arrayList.add(file2.toURI());
                                }
                            } else if (!file2.getName().startsWith(".")) {
/* 40 */                        I000o00OoI0I(file2, arrayList);
                            }
                        }
                    }
                }

                public static void I0010I0i(String str, o0llO01llII1 o0llo01llii1) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 28 */            sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(o0llo01llii1.I00000oOI / 1000000)));
/* 33 */            sb.append(": logging error [");
/* 36 */            o0oOlOiI o0ooloii = o0llo01llii1.I0000O;
/* 38 */            if (o0ooloii == null) {
/* 65 */                I000II.I001IO000("cannot request log site information prior to postProcess()");
/* 106 */               return;
                    }
/* 41 */            ll1lIIi1oii.I00000oIO(1, o0ooloii, sb);
/* 46 */            sb.append("]: ");
/* 49 */            sb.append(str);
/* 54 */            System.err.println(sb);
/* 59 */            System.err.flush();
                }

                @Override
                public long I00000oIO(IooO1IOlo iooO1IOlo, long j, O0iOOoiioO o0iOOoiioO, long j2) {
/* 62 */            return (iioO10.I00000oIO(iooO1IOlo.I00000oOI + ((int) (r0 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true) & 4294967295L) | (iioO10.I00000oIO(iooO1IOlo.I00000oIO + ((int) (((IooO0O) ((IllOOo00lI) this.I00iiI).invoke()).I00000oIO >> 32)), (int) (j2 >> 32), (int) (j >> 32), o0iOOoiioO == O0iOOoiioO.I00iOIl) << 32);
                }

                public void I00000oOI(O0iiOioolIi o0iiOioolIi) {
/* 5 */             if (!o0iiOioolIi.I00Io1lO()) {
/* 9 */                 IolioOO1.I0000Il00O("DepthSortedSet.add called on an unattached node");
                    }
/* 16 */            ((OlI00Io1) this.I00iiI).add(o0iiOioolIi);
                }

                public O0lO1lilIooO I0000Il00O(int i, int i2) {
/* 3 */             O0lO1lilIooO o0lO1lilIooO = new O0lO1lilIooO();
/* 6 */             o0lO1lilIooO.I00000oIO = i;
/* 8 */             o0lO1lilIooO.I00000oOI = i2;
/* 10 */            if (i < 0) {
/* 15 */                Ioll0IliO1l.I00000oIO("negative start index");
                    }
/* 18 */            if (i2 < i) {
/* 26 */                Ioll0IliO1l.I00000oIO("end index greater than start");
                    }
/* 20 */            VarHandle.storeStoreFence();
/* 34 */            ((OI110O0) this.I00iiI).I00000oOI(o0lO1lilIooO);
/* 37 */            return o0lO1lilIooO;
                }

                public void I0000O(byte b) {
/* 5 */             ((Parcel) this.I00iiI).writeByte(b);
                }

                public void I0000oI00(float f) {
/* 5 */             ((Parcel) this.I00iiI).writeFloat(f);
                }

                @Override
                public void I0001Ioi1lo(int i, Object obj) {
                    String str;
                    switch (i) {
                        case 1:
/* 34 */                    str = "RESULT_INSTALL_SUCCESS";
                            break;
                        case 2:
/* 31 */                    str = "RESULT_ALREADY_INSTALLED";
                            break;
                        case 3:
/* 28 */                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                            break;
                        case 4:
/* 25 */                    str = "RESULT_NOT_WRITABLE";
                            break;
                        case 5:
/* 22 */                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                            break;
                        case 6:
/* 19 */                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                            break;
                        case 7:
/* 16 */                    str = "RESULT_IO_EXCEPTION";
                            break;
                        case 8:
/* 13 */                    str = "RESULT_PARSE_EXCEPTION";
                            break;
                        case 9:
                        default:
/* 4 */                     str = "";
                            break;
                        case 10:
/* 10 */                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                            break;
                        case 11:
/* 7 */                     str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                            break;
                    }
/* 37 */            if (i == 6 || i == 7 || i == 8) {
/* 51 */                Log.e("ProfileInstaller", str, (Throwable) obj);
                    }
/* 58 */            ((ProfileInstallReceiver) this.I00iiI).setResultCode(i);
                }

                public void I000II(long j) {
/* 1 */             long jI0000Il00O = Oo0o1OiIo.I0000Il00O(j);
/* 11 */            byte b = 0;
/* 12 */            if (!Oo0o1iioOiO.I00000oOI(jI0000Il00O, 0L)) {
/* 24 */                if (Oo0o1iioOiO.I00000oOI(jI0000Il00O, 4294967296L)) {
/* 26 */                    b = 1;
                        } else if (Oo0o1iioOiO.I00000oOI(jI0000Il00O, 8589934592L)) {
/* 39 */                    b = 2;
                        }
                    }
/* 40 */            I0000O(b);
/* 51 */            if (Oo0o1iioOiO.I00000oOI(Oo0o1OiIo.I0000Il00O(j), 0L)) {
/* 77 */                return;
                    }
/* 57 */            I0000oI00(Oo0o1OiIo.I0000O(j));
                }

                public O0iIl1 I000O01llI0(O00l1iI0ol o00l1iI0ol, IIiIoIl11IO iIiIoIl11IO, boolean z, o01l1ioOo0 o01l1iooo0, I11I1111oi0 i11I1111oi0, OoOIo1ioI0 ooOIo1ioI0, boolean z2, Function1 function1) {
/* 8 */             Ol0IO1iloi ol0IO1iloi = new Ol0IO1iloi(iIiIoIl11IO, z, o01l1iooo0, i11I1111oi0, false);
/* 15 */            O0iIl1 o0iIl1 = (O0iIl1) function1.invoke(o00l1iI0ol);
/* 17 */            Collection collectionI000o00OoI0I = o00l1iI0ol.I000o00OoI0I();
/* 31 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(collectionI000o00OoI0I, 10));
/* 34 */            Iterator it = collectionI000o00OoI0I.iterator();
/* 42 */            while (it.hasNext()) {
/* 56 */                arrayList.add((O0iIl1) function1.invoke((IIiO00o1o) it.next()));
                    }
/* 63 */            return I000OOo1O(ol0IO1iloi, o0iIl1, arrayList, ooOIo1ioI0, z2);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:118:0x0238  */
                /* JADX WARN: Removed duplicated region for block: B:129:0x024e  */
                /* JADX WARN: Removed duplicated region for block: B:134:0x0262  */
                /* JADX WARN: Removed duplicated region for block: B:140:0x0276  */
                /* JADX WARN: Removed duplicated region for block: B:184:0x02e3  */
                /* JADX WARN: Removed duplicated region for block: B:198:0x030b  */
                /* JADX WARN: Removed duplicated region for block: B:262:0x03d5 A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:264:0x03d9  */
                /* JADX WARN: Removed duplicated region for block: B:271:0x03e9  */
                /* JADX WARN: Removed duplicated region for block: B:275:0x03fb  */
                /* JADX WARN: Removed duplicated region for block: B:284:0x0416  */
                /* JADX WARN: Removed duplicated region for block: B:285:0x0418  */
                /* JADX WARN: Removed duplicated region for block: B:289:0x041e  */
                /* JADX WARN: Removed duplicated region for block: B:291:0x042b  */
                /* JADX WARN: Removed duplicated region for block: B:301:0x045d  */
                /* JADX WARN: Removed duplicated region for block: B:305:0x046d  */
                /* JADX WARN: Removed duplicated region for block: B:314:0x0497  */
                /* JADX WARN: Removed duplicated region for block: B:318:0x049e  */
                /* JADX WARN: Removed duplicated region for block: B:321:0x04a3  */
                /* JADX WARN: Removed duplicated region for block: B:336:0x04cb  */
                /* JADX WARN: Removed duplicated region for block: B:374:0x01a9 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:59:0x0140  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x014b  */
                /* JADX WARN: Removed duplicated region for block: B:63:0x014d  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x0151  */
                /* JADX WARN: Removed duplicated region for block: B:77:0x0173  */
                /* JADX WARN: Removed duplicated region for block: B:92:0x01ce  */
                /* JADX WARN: Type inference failed for: r10v34 */
                /* JADX WARN: Type inference failed for: r10v35, types: [Ii1Ool1] */
                /* JADX WARN: Type inference failed for: r10v44 */
                /* JADX WARN: Type inference failed for: r10v45, types: [Ii1Ool1] */
                /* JADX WARN: Type inference failed for: r10v49 */
                /* JADX WARN: Type inference failed for: r10v50, types: [OI0io10lI] */
                /* JADX WARN: Type inference failed for: r10v52, types: [OI000ilOol] */
                /* JADX WARN: Type inference failed for: r10v54, types: [OI0io10lI] */
                /* JADX WARN: Type inference failed for: r10v55, types: [OI0io10lI] */
                /* JADX WARN: Type inference failed for: r10v57, types: [OI000ilOol] */
                /* JADX WARN: Type inference failed for: r15v15, types: [OIOOOO] */
                /* JADX WARN: Type inference failed for: r6v24 */
                /* JADX WARN: Type inference failed for: r6v6, types: [OI0io10lI] */
                /* JADX WARN: Type inference failed for: r6v9 */
                /* JADX WARN: Type inference failed for: r7v5 */
                /* JADX WARN: Type inference failed for: r7v6, types: [OIOOOO] */
                /* JADX WARN: Type inference failed for: r7v7, types: [OIOOOO] */
                /* JADX WARN: Type inference failed for: r9v22 */
                /* JADX WARN: Type inference failed for: r9v23, types: [OIOOOO] */
                /* JADX WARN: Type inference failed for: r9v27 */
                /* JADX WARN: Type inference failed for: r9v28, types: [OIOOOO] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public O0iIl1 I000OOo1O(Ol0IO1iloi ol0IO1iloi, O0iIl1 o0iIl1, List list, OoOIo1ioI0 ooOIo1ioI0, boolean z) {
                    O0iIl1 o0iIl12;
                    boolean z2;
                    boolean z3;
                    boolean z4;
                    ArrayList arrayList;
                    OoOOlO11iOi ooOOlO11iOi;
                    OoOOlO11iOi ooOOlO11iOiI0010I0i;
                    boolean z5;
                    Iterator it;
                    Object obj;
                    ArrayList arrayList2;
                    ?? r6;
                    o01l1ioOo0 o01l1iooo0;
                    Iterator it2;
                    int i;
                    OIOOOO0 oioooo0;
                    OIOOOO0 oioooo02;
                    OIOOOO0 oioooo0I00000oOI;
                    O00olOO0 o00olOO0;
                    I11II1o i11II1o;
                    OIOOOO0 oioooo03;
                    OIOOOO0 oioooo0I00000oIO;
                    OIOOOO0 oioooo04;
                    boolean z6;
                    OIOOOO0 oioooo05;
                    Iterator it3;
                    Object obj2;
                    Iterable annotations;
                    IlOIOIi00io ilOIOIi00ioI0001Ioi1lo;
                    Object obj3;
                    Iterator it4;
                    Iterator it5;
                    OIOOOO oioooo;
                    OIOOOO oioooo2;
                    OIOOOO oioooo3;
                    Iterator it6;
                    I1110ii00 i1110ii00;
                    boolean z7;
                    Object o00olOO02;
                    O0iIo0i1 o0iIo0i1;
                    ?? I0000Il00O;
                    Ol0O0iI0l0O ol0O0iI0l0OI000II;
                    Ol0O0iI0l0O ol0O0iI0l0OI000II2;
                    ?? r10;
                    OoOioOO1 ooOioOO1I00000oIO;
/* 3 */             I1110ii00 i1110ii002 = ol0IO1iloi.I00000oIO;
/* 5 */             o01l1ioOo0 o01l1iooo02 = ol0IO1iloi.I0000Il00O;
/* 11 */            lo1iloiI1 lo1iloii1 = (lo1iloiI1) this.I00iiI;
/* 15 */            List list2 = list;
/* 17 */            boolean z8 = ol0IO1iloi.I00000oOI;
/* 19 */            ArrayList arrayListI0000O = ol0IO1iloi.I0000O(o0iIl1);
/* 31 */            ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(list2, 10));
/* 34 */            Iterator it7 = list2.iterator();
/* 42 */            while (it7.hasNext()) {
/* 54 */                arrayList3.add(ol0IO1iloi.I0000O((O0iIo0i1) it7.next()));
                    }
/* 58 */            if (!z8 || ((list2 instanceof Collection) && list2.isEmpty())) {
/* 112 */               o0iIl12 = o0iIl1;
/* 114 */               z2 = false;
                    } else {
/* 74 */                Iterator it8 = list2.iterator();
/* 82 */                while (it8.hasNext()) {
/* 102 */                   o0iIl12 = o0iIl1;
/* 108 */                   if (!((OIIil1l0IioO) ((OIIiioOilI) ((I0l1OOl1l10) o01l1iooo02.I00iOIl).I000l1)).I00000oIO(o0iIl12, (O0iIl1) ((O0iIo0i1) it8.next()))) {
/* 110 */                       z2 = true;
                                break;
                            }
                        }
/* 112 */               o0iIl12 = o0iIl1;
/* 114 */               z2 = false;
                    }
/* 115 */           int size = arrayListI0000O.size();
/* 119 */           O00olOO0[] o00olOO0Arr = new O00olOO0[size];
/* 121 */           int i2 = 0;
/* 122 */           while (i2 < size) {
/* 124 */               O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iiI;
/* 129 */               O1ii1lo o1ii1lo = new O1ii1lo(2);
/* 132 */               o1ii1lo.I00iiI = ol0IO1iloi;
/* 134 */               o1ii1lo.I00iiO = arrayListI0000O;
/* 136 */               o1ii1lo.I00iio = i2;
/* 138 */               VarHandle.storeStoreFence();
/* 141 */               O0ioIllo0i1 o0ioIllo0i1I00000oIO = l0oi0lOi11i.I00000oIO(o0oI01I0oo, o1ii1lo);
/* 145 */               O00olOO0 o00olOO03 = O00olOO0.I0000oI00;
/* 147 */               if (i2 <= 0 || !z2) {
/* 173 */                   I01i1I i01i1I = (I01i1I) arrayListI0000O.get(i2);
/* 179 */                   O00li0ll o00li0ll = (O00li0ll) o0ioIllo0i1I00000oIO.getValue();
/* 181 */                   O0iIo0i1 o0iIo0i12 = i01i1I.I00000oIO;
/* 183 */                   z3 = z2;
/* 185 */                   OoOOlO11iOi ooOOlO11iOi2 = i01i1I.I0000Il00O;
/* 187 */                   z4 = z8;
/* 189 */                   if (o0iIo0i12 == null) {
/* 191 */                       ooOOlO11iOi = null;
/* 193 */                       if (ooOOlO11iOi2 == null) {
/* 242 */                           ooOioOO1I00000oIO = null;
                                } else {
/* 197 */                           if (!(ooOOlO11iOi2 instanceof OoOOiO)) {
/* 217 */                               StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
/* 220 */                               sb.append(ooOOlO11iOi2);
/* 225 */                               sb.append(", ");
/* 238 */                               I000II.I0010I0i(Oi010OO0.I00100o1O0lo(OOoOl0i.I00000oIO, ooOOlO11iOi2.getClass(), sb));
/* 191 */                               return null;
                                    }
/* 206 */                           ooOioOO1I00000oIO = lOol1oi11I.I00000oIO(((OoOOiO) ooOOlO11iOi2).I000l1());
                                }
/* 210 */                       arrayList = arrayListI0000O;
/* 247 */                       if (ooOioOO1I00000oIO == OoOioOO1.I00iiI) {
/* 249 */                           o01l1iooo0 = o01l1iooo02;
/* 251 */                           arrayList2 = arrayList3;
/* 253 */                           i = size;
/* 255 */                           o00olOO0 = o00olOO03;
/* 256 */                           obj3 = null;
                                }
/* 763 */                       boolean z9 = o00olOO0.I0000O;
/* 767 */                       ArrayList arrayList4 = new ArrayList();
/* 770 */                       it4 = arrayList2.iterator();
/* 778 */                       while (it4.hasNext()) {
/* 790 */                           I01i1I i01i1I2 = (I01i1I) IOOi0Ool1i.I00II0oii1o(i2, (List) it4.next());
/* 792 */                           if (i01i1I2 == null || (o0iIo0i1 = i01i1I2.I00000oIO) == null) {
/* 972 */                               o00olOO02 = obj3;
                                    } else {
/* 798 */                               OIOOOO oiooooI0000Il00O = Ol0IO1iloi.I0000Il00O(o0iIo0i1);
/* 802 */                               if (oiooooI0000Il00O == null) {
/* 807 */                                   O0iIl1 o0iIl1I00000oIO = lOoll01ll0I.I00000oIO((O0iIl1) o0iIo0i1);
/* 818 */                                   I0000Il00O = o0iIl1I00000oIO != null ? Ol0IO1iloi.I0000Il00O(o0iIl1I00000oIO) : obj3;
                                        } else {
/* 820 */                                   I0000Il00O = oiooooI0000Il00O;
                                        }
/* 821 */                               String str = O00oO0liO11.I00000oIO;
/* 823 */                               IlOIOIi00io ilOIOIi00ioI0001Ioi1lo2 = ii00il1.I0001Ioi1lo(o0iIo0i1);
/* 827 */                               if (ilOIOIi00ioI0001Ioi1lo2 == null || (ol0O0iI0l0OI000II = ii00il1.I00IoIO0lI(ilOIOIi00ioI0001Ioi1lo2)) == null) {
/* 835 */                                   ol0O0iI0l0OI000II = ii00il1.I000II(o0iIo0i1);
                                        }
/* 839 */                               Il0oo01OllO0 il0oo01OllO0 = OoOilo0Oliii.I00000oIO;
/* 845 */                               IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = ol0O0iI0l0OI000II.I00iOIl().I00100o1O0lo();
/* 856 */                               ?? r102 = iOIiO1lIl0lI00100o1O0lo instanceof OI000ilOol ? (OI000ilOol) iOIiO1lIl0lI00100o1O0lo : obj3;
/* 871 */                               if (O00oO0liO11.I000iOII.containsKey(r102 != null ? IiOiIO0i1Oil.I0001Ioi1lo(r102) : obj3)) {
/* 873 */                                   r10 = OI0io10lI.I00iOIl;
                                        } else {
/* 876 */                                   IlOIOIi00io ilOIOIi00ioI0001Ioi1lo3 = ii00il1.I0001Ioi1lo(o0iIo0i1);
/* 880 */                                   if (ilOIOIi00ioI0001Ioi1lo3 == null || (ol0O0iI0l0OI000II2 = ii00il1.I00OOll1(ilOIOIi00ioI0001Ioi1lo3)) == null) {
/* 888 */                                       ol0O0iI0l0OI000II2 = ii00il1.I000II(o0iIo0i1);
                                            }
/* 896 */                                   IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo2 = ol0O0iI0l0OI000II2.I00iOIl().I00100o1O0lo();
/* 907 */                                   ?? r103 = iOIiO1lIl0lI00100o1O0lo2 instanceof OI000ilOol ? (OI000ilOol) iOIiO1lIl0lI00100o1O0lo2 : obj3;
/* 927 */                                   r10 = O00oO0liO11.I000OiO.containsKey(r103 != null ? IiOiIO0i1Oil.I0001Ioi1lo(r103) : obj3) ? OI0io10lI.I00iiI : obj3;
                                        }
/* 928 */                               Ol0O0iI0l0O ol0O0iI0l0OI000II3 = ii00il1.I000II(o0iIo0i1);
/* 968 */                               o00olOO02 = new O00olOO0(I0000Il00O, r10, ((ol0O0iI0l0OI000II3 != null ? ii00il1.I0000oI00(ol0O0iI0l0OI000II3) : obj3) != null) || (((O0iIl1) o0iIo0i1).I00l0OO0IO() instanceof OIO0IOO), I0000Il00O != oiooooI0000Il00O);
                                    }
/* 973 */                           if (o00olOO02 != null) {
/* 975 */                               arrayList4.add(o00olOO02);
                                    }
                                }
/* 986 */                       boolean z10 = i2 == 0 && z4;
/* 1002 */                      boolean z11 = (i2 == 0 || !(i1110ii002 instanceof Ooo00oi0O) || ((Ooo00oi0O) i1110ii002).I00l0OO0IO == null) ? false : true;
/* 1003 */                      OIOOOO oioooo4 = o00olOO0.I00000oIO;
/* 1007 */                      ArrayList arrayList5 = new ArrayList();
/* 1010 */                      it5 = arrayList4.iterator();
/* 1018 */                      while (it5.hasNext()) {
/* 1024 */                          O00olOO0 o00olOO04 = (O00olOO0) it5.next();
/* 1032 */                          OIOOOO oioooo5 = o00olOO04.I0000O ? null : o00olOO04.I00000oIO;
/* 1034 */                          if (oioooo5 != null) {
/* 1036 */                              arrayList5.add(oioooo5);
                                    }
                                }
/* 1041 */                      Set setI00iio = IOOi0Ool1i.I00iio(arrayList5);
/* 1049 */                      oioooo = !z9 ? null : oioooo4;
/* 1050 */                      oioooo2 = OIOOOO.I00iOIl;
/* 1052 */                      if (oioooo != oioooo2) {
/* 1064 */                          oioooo2 = (OIOOOO) lOoiIoI.I00000oIO(setI00iio, OIOOOO.I00iiO, OIOOOO.I00iiI, oioooo, z10);
                                }
/* 1066 */                      if (oioooo2 != null) {
/* 1070 */                          ArrayList arrayList6 = new ArrayList();
/* 1073 */                          Iterator it9 = arrayList4.iterator();
/* 1081 */                          while (it9.hasNext()) {
/* 1089 */                              OIOOOO oioooo6 = ((O00olOO0) it9.next()).I00000oIO;
/* 1091 */                              if (oioooo6 != null) {
/* 1093 */                                  arrayList6.add(oioooo6);
                                        }
                                    }
/* 1097 */                          Set setI00iio2 = IOOi0Ool1i.I00iio(arrayList6);
/* 1101 */                          oioooo3 = OIOOOO.I00iOIl;
/* 1103 */                          if (oioooo4 != oioooo3) {
/* 1115 */                              oioooo3 = (OIOOOO) lOoiIoI.I00000oIO(setI00iio2, OIOOOO.I00iiO, OIOOOO.I00iiI, oioooo4, z10);
                                    }
                                } else {
/* 1118 */                          oioooo3 = oioooo2;
                                }
/* 1121 */                      ArrayList arrayList7 = new ArrayList();
/* 1124 */                      it6 = arrayList4.iterator();
/* 1132 */                      while (it6.hasNext()) {
/* 1140 */                          OI0io10lI oI0io10lI = ((O00olOO0) it6.next()).I00000oOI;
/* 1142 */                          if (oI0io10lI != null) {
/* 1144 */                              arrayList7.add(oI0io10lI);
                                    }
                                }
/* 1156 */                      i1110ii00 = i1110ii002;
/* 1164 */                      OI0io10lI oI0io10lI2 = (OI0io10lI) lOoiIoI.I00000oIO(IOOi0Ool1i.I00iio(arrayList7), OI0io10lI.I00iiI, OI0io10lI.I00iOIl, o00olOO0.I00000oOI, z10);
/* 1166 */                      if (oioooo3 != null || z || (z11 && oioooo3 == OIOOOO.I00iiI)) {
/* 1176 */                          oioooo3 = null;
                                }
/* 1183 */                      boolean z12 = oioooo3 == null && oioooo2 == null;
/* 1186 */                      if (oioooo3 != OIOOOO.I00iiO) {
/* 1228 */                          z7 = false;
/* 1231 */                          o00olOO03 = new O00olOO0(oioooo3, oI0io10lI2, z7, z12);
                                } else {
/* 1188 */                          if (z9 != z12 || !o00olOO0.I0000Il00O) {
/* 1199 */                              if (!arrayList4.isEmpty()) {
/* 1202 */                                  Iterator it10 = arrayList4.iterator();
/* 1210 */                                  while (it10.hasNext()) {
/* 1216 */                                      O00olOO0 o00olOO05 = (O00olOO0) it10.next();
/* 1220 */                                      if (o00olOO05.I0000O != z12 || !o00olOO05.I0000Il00O) {
                                                }
                                            }
                                        }
/* 1228 */                              z7 = false;
/* 1231 */                              o00olOO03 = new O00olOO0(oioooo3, oI0io10lI2, z7, z12);
                                    }
/* 1226 */                          z7 = true;
/* 1231 */                          o00olOO03 = new O00olOO0(oioooo3, oI0io10lI2, z7, z12);
                                }
                            } else {
/* 260 */                       arrayList = arrayListI0000O;
/* 262 */                       ooOOlO11iOi = null;
                            }
/* 268 */                   boolean z13 = ooOOlO11iOi2 == null;
/* 269 */                   Iterable iterable = Il01100l.I00iOIl;
/* 281 */                   Iterable annotations2 = o0iIo0i12 != null ? ((O0iIl1) o0iIo0i12).getAnnotations() : iterable;
/* 282 */                   if (o0iIo0i12 == null) {
/* 321 */                       ooOOlO11iOiI0010I0i = ooOOlO11iOi;
/* 318 */                       z5 = z13;
/* 334 */                       boolean z14 = ol0IO1iloi.I0000O != I11I1111oi0.I00ilO0;
/* 335 */                       if (z5) {
/* 338 */                           if (!z14) {
/* 340 */                               Object obj4 = o01l1iooo02.I00iOIl;
                                    }
/* 354 */                           annotations2 = IOOi0Ool1i.I00O0i0ii((i1110ii002 == null || (annotations = i1110ii002.getAnnotations()) == null) ? iterable : annotations, annotations2);
                                }
/* 358 */                       Object obj5 = o01l1iooo02.I00iOIl;
/* 360 */                       it = annotations2.iterator();
/* 364 */                       obj = ooOOlO11iOi;
                                while (true) {
/* 370 */                           if (!it.hasNext()) {
/* 378 */                               it3 = it;
/* 380 */                               Ill0IO ill0IOI0010o = ((I111oOiIiO0) it.next()).I0010o();
/* 386 */                               arrayList2 = arrayList3;
/* 396 */                               if (IOOi0Ool1i.I001i1O0Ol(O0I01i1Io.I000o00OoI0I, ill0IOI0010o)) {
/* 398 */                                   obj2 = OI0io10lI.I00iOIl;
                                        } else if (IOOi0Ool1i.I001i1O0Ol(O0I01i1Io.I000oI1ioi, ill0IOI0010o)) {
/* 411 */                                   obj2 = OI0io10lI.I00iiI;
                                        } else {
                                            continue;
/* 421 */                                   it = it3;
/* 423 */                                   arrayList3 = arrayList2;
                                            obj = obj;
                                        }
/* 413 */                               if (obj != null && obj != obj2) {
/* 417 */                                   r6 = ooOOlO11iOi;
                                            break;
                                        }
/* 420 */                               obj = obj2;
/* 421 */                               it = it3;
/* 423 */                               arrayList3 = arrayList2;
                                        obj = obj;
                                    } else {
/* 426 */                               arrayList2 = arrayList3;
                                        r6 = obj;
                                        break;
                                    }
                                }
/* 434 */                       I11II1o i11II1o2 = (I11II1o) ((I0l1OOl1l10) o01l1iooo02.I00iOIl).I000OiO;
/* 438 */                       o01l1iooo0 = o01l1iooo02;
/* 441 */                       I01i01OoI i01i01OoI = new I01i01OoI(0);
/* 444 */                       i01i01OoI.I00iiI = ol0IO1iloi;
/* 446 */                       i01i01OoI.I00iiO = i01i1I;
/* 448 */                       VarHandle.storeStoreFence();
/* 451 */                       it2 = annotations2.iterator();
/* 455 */                       OIOOOO0 oioooo06 = ooOOlO11iOi;
/* 461 */                       while (it2.hasNext()) {
/* 463 */                           Object next = it2.next();
/* 473 */                           Iterator it11 = it2;
/* 479 */                           OIOOOO0 oioooo0I0001Ioi1lo = i11II1o2.I0001Ioi1lo(next, ((Boolean) i01i01OoI.invoke(next)).booleanValue());
/* 483 */                           if (oioooo0I0001Ioi1lo != null) {
/* 485 */                               i = size;
/* 487 */                               oioooo03 = ooOOlO11iOi;
                                        oioooo05 = oioooo0I0001Ioi1lo;
                                    } else {
/* 492 */                               Object objI000O01llI0 = i11II1o2.I000O01llI0(next);
/* 496 */                               if (objI000O01llI0 == null) {
/* 498 */                                   i = size;
                                        } else {
/* 505 */                                   Oi01Iillli oi01IillliI000II = i11II1o2.I000II(next);
/* 509 */                                   if (oi01IillliI000II == null) {
/* 520 */                                       oi01IillliI000II = ((O0I00OIIo) i11II1o2.I00000oIO.I00iiO).I00000oIO;
                                            }
/* 511 */                                   i = size;
/* 525 */                                   if (oi01IillliI000II == Oi01Iillli.I00iOIl) {
/* 527 */                                       OIOOOO0 oioooo07 = ooOOlO11iOi;
/* 529 */                                       oioooo03 = oioooo07;
                                                oioooo05 = oioooo07;
                                            } else {
/* 541 */                                       OIOOOO0 oioooo0I0001Ioi1lo2 = i11II1o2.I0001Ioi1lo(objI000O01llI0, ((Boolean) i01i01OoI.invoke(objI000O01llI0)).booleanValue());
/* 545 */                                       if (oioooo0I0001Ioi1lo2 != null) {
/* 558 */                                           boolean z15 = oi01IillliI000II == Oi01Iillli.I00iiI;
/* 552 */                                           ?? r15 = ooOOlO11iOi;
/* 554 */                                           i11II1o = i11II1o2;
/* 560 */                                           oioooo0I00000oIO = OIOOOO0.I00000oIO(oioooo0I0001Ioi1lo2, r15, z15, 1);
                                                    oioooo04 = r15;
                                                }
/* 566 */                                       if (oioooo06 == null) {
/* 591 */                                           oioooo06 = oioooo0I00000oIO;
                                                } else {
/* 569 */                                           boolean z16 = oioooo06.I00000oOI;
/* 571 */                                           if (oioooo0I00000oIO != null && !oioooo0I00000oIO.equals(oioooo06) && (!(z6 = oioooo0I00000oIO.I00000oOI) || z16)) {
/* 587 */                                               if (z6 || !z16) {
/* 593 */                                                   oioooo02 = oioooo04;
                                                            oioooo0 = oioooo04;
                                                            break;
                                                        }
/* 591 */                                               oioooo06 = oioooo0I00000oIO;
                                                    }
                                                }
/* 595 */                                       i11II1o2 = i11II1o;
/* 597 */                                       size = i;
/* 599 */                                       it2 = it11;
/* 601 */                                       ooOOlO11iOi = oioooo04;
                                                oioooo06 = oioooo06;
                                            }
                                        }
/* 500 */                               OIOOOO0 oioooo08 = ooOOlO11iOi;
/* 502 */                               i11II1o = i11II1o2;
/* 565 */                               oioooo0I00000oIO = oioooo08;
                                        oioooo04 = oioooo08;
/* 566 */                               if (oioooo06 == null) {
                                        }
/* 595 */                               i11II1o2 = i11II1o;
/* 597 */                               size = i;
/* 599 */                               it2 = it11;
/* 601 */                               ooOOlO11iOi = oioooo04;
                                        oioooo06 = oioooo06;
                                    }
/* 489 */                           i11II1o = i11II1o2;
                                    oioooo0I00000oIO = oioooo05;
                                    oioooo04 = oioooo03;
/* 566 */                           if (oioooo06 == null) {
                                    }
/* 595 */                           i11II1o2 = i11II1o;
/* 597 */                           size = i;
/* 599 */                           it2 = it11;
/* 601 */                           ooOOlO11iOi = oioooo04;
                                    oioooo06 = oioooo06;
                                }
/* 605 */                       i = size;
/* 607 */                       oioooo0 = ooOOlO11iOi;
                                oioooo02 = oioooo06;
/* 609 */                       if (oioooo02 == null) {
/* 613 */                           OIOOOO oioooo7 = oioooo02.I00000oIO;
/* 626 */                           o00olOO0 = new O00olOO0(oioooo7, r6, oioooo7 == OIOOOO.I00iiO && ooOOlO11iOiI0010I0i != null, oioooo02.I00000oOI);
                                    obj3 = oioooo0;
                                } else {
/* 638 */                           OIOOOO0 oioooo0I00000oOI2 = ooOOlO11iOiI0010I0i != null ? ol0IO1iloi.I00000oOI(ooOOlO11iOiI0010I0i) : oioooo0;
/* 655 */                           OIOOOO0 oioooo0I00000oIO2 = oioooo0I00000oOI2 != null ? OIOOOO0.I00000oIO(oioooo0I00000oOI2, OIOOOO.I00iiO, false, 2) : o00li0ll != null ? o00li0ll.I00000oIO : oioooo0;
/* 678 */                           boolean z17 = (oioooo0I00000oOI2 != null ? oioooo0I00000oOI2.I00000oIO : oioooo0) == OIOOOO.I00iiO || !(ooOOlO11iOiI0010I0i == null || o00li0ll == null || !o00li0ll.I0000Il00O);
/* 679 */                           if (ooOOlO11iOi2 == null || (oioooo0I00000oOI = ol0IO1iloi.I00000oOI(ooOOlO11iOi2)) == null) {
/* 702 */                               oioooo0I00000oOI = oioooo0;
                                    } else if (oioooo0I00000oOI.I00000oIO == OIOOOO.I00iiI) {
/* 697 */                               oioooo0I00000oOI = OIOOOO0.I00000oIO(oioooo0I00000oOI, OIOOOO.I00iOIl, false, 2);
                                    }
/* 703 */                           if (oioooo0I00000oOI != null) {
/* 706 */                               OIOOOO oioooo8 = oioooo0I00000oOI.I00000oIO;
/* 708 */                               if (oioooo0I00000oIO2 == null) {
/* 740 */                                   oioooo0I00000oIO2 = oioooo0I00000oOI;
                                        } else {
/* 711 */                                   OIOOOO oioooo9 = oioooo0I00000oIO2.I00000oIO;
/* 713 */                                   boolean z18 = oioooo0I00000oIO2.I00000oOI;
/* 715 */                                   boolean z19 = oioooo0I00000oOI.I00000oOI;
/* 717 */                                   if ((!z19 || z18) && ((!z19 && z18) || (oioooo8.compareTo(oioooo9) >= 0 && oioooo8.compareTo(oioooo9) > 0))) {
                                            }
                                        }
                                    }
/* 759 */                           o00olOO0 = new O00olOO0(oioooo0I00000oIO2 != null ? oioooo0I00000oIO2.I00000oIO : oioooo0, r6, z17, oioooo0I00000oIO2 != null && oioooo0I00000oIO2.I00000oOI);
                                    obj3 = oioooo0;
                                }
/* 763 */                       boolean z92 = o00olOO0.I0000O;
/* 767 */                       ArrayList arrayList42 = new ArrayList();
/* 770 */                       it4 = arrayList2.iterator();
/* 778 */                       while (it4.hasNext()) {
                                }
/* 986 */                       if (i2 == 0) {
/* 1002 */                          if (i2 == 0) {
/* 1003 */                              OIOOOO oioooo42 = o00olOO0.I00000oIO;
/* 1007 */                              ArrayList arrayList52 = new ArrayList();
/* 1010 */                              it5 = arrayList42.iterator();
/* 1018 */                              while (it5.hasNext()) {
                                        }
/* 1041 */                              Set setI00iio3 = IOOi0Ool1i.I00iio(arrayList52);
/* 1049 */                              if (!z92) {
                                        }
/* 1050 */                              oioooo2 = OIOOOO.I00iOIl;
/* 1052 */                              if (oioooo != oioooo2) {
                                        }
/* 1066 */                              if (oioooo2 != null) {
                                        }
/* 1121 */                              ArrayList arrayList72 = new ArrayList();
/* 1124 */                              it6 = arrayList42.iterator();
/* 1132 */                              while (it6.hasNext()) {
                                        }
/* 1156 */                              i1110ii00 = i1110ii002;
/* 1164 */                              OI0io10lI oI0io10lI22 = (OI0io10lI) lOoiIoI.I00000oIO(IOOi0Ool1i.I00iio(arrayList72), OI0io10lI.I00iiI, OI0io10lI.I00iOIl, o00olOO0.I00000oOI, z10);
/* 1166 */                              if (oioooo3 != null) {
/* 1176 */                                  oioooo3 = null;
/* 1183 */                                  if (oioooo3 == null) {
/* 1186 */                                      if (oioooo3 != OIOOOO.I00iiO) {
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
/* 284 */                       Ol0O0iI0l0O ol0O0iI0l0OI000II4 = ii00il1.I000II(o0iIo0i12);
/* 288 */                       if (ol0O0iI0l0OI000II4 == null && ((ilOIOIi00ioI0001Ioi1lo = ii00il1.I0001Ioi1lo(o0iIo0i12)) == null || (ol0O0iI0l0OI000II4 = ii00il1.I00IoIO0lI(ilOIOIi00ioI0001Ioi1lo)) == null)) {
/* 302 */                           ol0O0iI0l0OI000II4 = ii00il1.I000II(o0iIo0i12);
                                }
/* 308 */                       OoOIOoO1I ooOIOoO1II00OIo = ii00il1.I00OIo(ol0O0iI0l0OI000II4);
/* 312 */                       if (ooOIOoO1II00OIo != null) {
/* 314 */                           ooOOlO11iOiI0010I0i = ii00il1.I0010I0i(ooOIOoO1II00OIo);
                                }
/* 318 */                       z5 = z13;
/* 334 */                       if (ol0IO1iloi.I0000O != I11I1111oi0.I00ilO0) {
                                }
/* 335 */                       if (z5) {
                                }
/* 358 */                       Object obj52 = o01l1iooo02.I00iOIl;
/* 360 */                       it = annotations2.iterator();
/* 364 */                       obj = ooOOlO11iOi;
                                while (true) {
/* 370 */                           if (!it.hasNext()) {
                                    }
/* 421 */                           it = it3;
/* 423 */                           arrayList3 = arrayList2;
                                    obj = obj;
                                }
/* 434 */                       I11II1o i11II1o22 = (I11II1o) ((I0l1OOl1l10) o01l1iooo02.I00iOIl).I000OiO;
/* 438 */                       o01l1iooo0 = o01l1iooo02;
/* 441 */                       I01i01OoI i01i01OoI2 = new I01i01OoI(0);
/* 444 */                       i01i01OoI2.I00iiI = ol0IO1iloi;
/* 446 */                       i01i01OoI2.I00iiO = i01i1I;
/* 448 */                       VarHandle.storeStoreFence();
/* 451 */                       it2 = annotations2.iterator();
/* 455 */                       OIOOOO0 oioooo062 = ooOOlO11iOi;
/* 461 */                       while (it2.hasNext()) {
                                }
/* 605 */                       i = size;
/* 607 */                       oioooo0 = ooOOlO11iOi;
                                oioooo02 = oioooo062;
/* 609 */                       if (oioooo02 == null) {
                                }
/* 763 */                       boolean z922 = o00olOO0.I0000O;
/* 767 */                       ArrayList arrayList422 = new ArrayList();
/* 770 */                       it4 = arrayList2.iterator();
/* 778 */                       while (it4.hasNext()) {
                                }
/* 986 */                       if (i2 == 0) {
                                }
                            }
                        } else {
/* 151 */                   i1110ii00 = i1110ii002;
/* 153 */                   o01l1iooo0 = o01l1iooo02;
/* 155 */                   z3 = z2;
/* 157 */                   z4 = z8;
/* 159 */                   arrayList = arrayListI0000O;
/* 161 */                   arrayList2 = arrayList3;
/* 163 */                   i = size;
                        }
/* 1234 */              o00olOO0Arr[i2] = o00olOO03;
/* 1236 */              i2++;
/* 1238 */              z2 = z3;
/* 1240 */              z8 = z4;
/* 1242 */              arrayListI0000O = arrayList;
/* 1244 */              o01l1iooo02 = o01l1iooo0;
/* 1246 */              size = i;
/* 1248 */              arrayList3 = arrayList2;
/* 1250 */              i1110ii002 = i1110ii00;
                    }
/* 1257 */          I01i01OoI i01i01OoI3 = new I01i01OoI(1);
/* 1262 */          i01i01OoI3.I00iiI = ooOIo1ioI0;
/* 1264 */          i01i01OoI3.I00iiO = o00olOO0Arr;
/* 1266 */          VarHandle.storeStoreFence();
/* 1282 */          return (O0iIl1) lo1iloii1.I0000Il00O(o0iIl12.I00l0OO0IO(), i01i01OoI3, 0, ol0IO1iloi.I0000oI00).I00iiO;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:143:0x02c8 A[EDGE_INSN: B:143:0x02c8->B:144:0x02d4 BREAK  A[LOOP:5: B:137:0x02ae->B:197:?]] */
                /* JADX WARN: Removed duplicated region for block: B:149:0x02df  */
                /* JADX WARN: Removed duplicated region for block: B:155:0x02f2  */
                /* JADX WARN: Removed duplicated region for block: B:157:0x02f5  */
                /* JADX WARN: Removed duplicated region for block: B:159:0x02fa  */
                /* JADX WARN: Removed duplicated region for block: B:166:0x031b  */
                /* JADX WARN: Removed duplicated region for block: B:175:0x0342  */
                /* JADX WARN: Removed duplicated region for block: B:82:0x016e  */
                /* JADX WARN: Type inference failed for: r24v0, types: [Oi1ol0llI] */
                /* JADX WARN: Type inference failed for: r5v3, types: [IIiIoIl11IO, IIiO00o1o, Ii1Ool1] */
                /* JADX WARN: Type inference failed for: r5v4, types: [O00l1iI0ol] */
                /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public ArrayList I000OiO(o01l1ioOo0 o01l1iooo0, Collection collection) {
                    I11IlOOO annotations;
                    O0iIl1 type;
                    OIoi0IIoi oIoi0IIoi;
                    int i;
                    Iterator it;
                    List list;
                    OOOOI1ioIo oOOOI1ioIo;
/* 3 */             OOo1l011 oOo1l011 = OOo1l011.I00ol1;
/* 7 */             Collection<??> collection2 = collection;
/* 11 */            int i2 = 10;
/* 17 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(collection2, 10));
/* 28 */            for (?? I00ilO02 : collection2) {
/* 38 */                if (I00ilO02 instanceof O00l1iI0ol) {
/* 47 */                    int i3 = 2;
/* 49 */                    if (I00ilO02.I000oI1ioi() != 2 || I00ilO02.I010i10l().I000o00OoI0I().size() != 1) {
/* 67 */                        IOIiO1lIl0l iOIiO1lIl0lI00000oIO = il110i0l.I00000oIO(I00ilO02);
/* 72 */                        if (iOIiO1lIl0lI00000oIO == null) {
/* 77 */                            annotations = ((I01O1lIi) I00ilO02).getAnnotations();
                                } else {
/* 90 */                            O0l1i0l o0l1i0l = iOIiO1lIl0lI00000oIO instanceof O0l1i0l ? (O0l1i0l) iOIiO1lIl0lI00000oIO : null;
/* 102 */                           List list2 = o0l1i0l != null ? (List) o0l1i0l.I00li1OI.getValue() : null;
/* 104 */                           List list3 = list2;
/* 106 */                           if (list3 == null || list3.isEmpty()) {
/* 186 */                               annotations = ((I01O1lIi) I00ilO02).getAnnotations();
                                    } else {
/* 115 */                               List list4 = list2;
/* 123 */                               ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(list4, i2));
/* 126 */                               Iterator it2 = list4.iterator();
/* 134 */                               while (it2.hasNext()) {
/* 147 */                                   arrayList2.add(new O0l1OOlI0OiO((OOo1O1i) it2.next(), o01l1iooo0, true));
                                        }
/* 158 */                               ArrayList arrayListI00O0i0ii = IOOi0Ool1i.I00O0i0ii(((I01O1lIi) I00ilO02).getAnnotations(), arrayList2);
/* 166 */                               if (arrayListI00O0i0ii.isEmpty()) {
/* 168 */                                   annotations = i1i0olI.I00iiO;
                                        } else {
/* 173 */                                   I11Io0oil0i0 i11Io0oil0i0 = new I11Io0oil0i0();
/* 176 */                                   i11Io0oil0i0.I00iiI = arrayListI00O0i0ii;
/* 178 */                                   VarHandle.storeStoreFence();
/* 181 */                                   annotations = i11Io0oil0i0;
                                        }
                                    }
                                }
/* 190 */                       o01l1ioOo0 o01l1iooo0I0000Il00O = iioIlooliI.I0000Il00O(o01l1iooo0, annotations);
/* 211 */                       OOOOI1ioIo oOOOI1ioIo2 = (!(I00ilO02 instanceof O00o11il) || (oOOOI1ioIo = ((OOOO1o) I00ilO02).I00ol1) == null || oOOOI1ioIo.I00ilI0I1) ? I00ilO02 : oOOOI1ioIo;
/* 216 */                       if (I00ilO02.I00OOll1() != null) {
/* 226 */                           OOOOI1ioIo oOOOI1ioIo3 = oOOOI1ioIo2 instanceof Illlil ? oOOOI1ioIo2 : null;
/* 240 */                           Ooo00oi0O ooo00oi0O = oOOOI1ioIo3 != null ? (Ooo00oi0O) oOOOI1ioIo3.I00111O(O00loo1i111O.I0100o111I) : null;
/* 272 */                           type = I000O01llI0((O00l1iI0ol) I00ilO02, ooo00oi0O, false, ooo00oi0O != null ? iioIlooliI.I0000Il00O(o01l1iooo0I0000Il00O, ooo00oi0O.getAnnotations()) : o01l1iooo0I0000Il00O, I11I1111oi0.I00iiO, null, false, OOo1l011.I00oO101o);
                                } else {
/* 277 */                           type = null;
                                }
/* 286 */                       O00loo1i111O o00loo1i111O = I00ilO02 instanceof O00loo1i111O ? (O00loo1i111O) I00ilO02 : null;
/* 288 */                       if (o00loo1i111O != null) {
/* 294 */                           OI000ilOol oI000ilOol = (OI000ilOol) o00loo1i111O.I000lI();
/* 297 */                           String strI00000oIO = l1OOo1o1l.I00000oIO(o00loo1i111O, 3);
/* 301 */                           String str = O00oO0liO11.I00000oIO;
/* 309 */                           IOIOill iOIOillI000O01llI0 = O00oO0liO11.I000O01llI0(IiOiOOIo.I000II(oI000ilOol).I00000oIO);
/* 338 */                           OOI000iI1 oOI000iI1 = (OOI000iI1) OO1oolioio.I0000O.get(IIlIOloOOO.I000oI1ioi('.', iOIOillI000O01llI0 != null ? O0I0oiO1I.I0000oI00(iOIOillI000O01llI0) : il0oill0io.I00000oIO(oI000ilOol, lOOlOoll.I00ioIO), strI00000oIO));
/* 340 */                           if (oOI000iI1 != null) {
/* 342 */                               String str2 = oOI000iI1.I0000Il00O;
/* 344 */                               if (str2 != null && !OlOolloIIOl0.I000l1(str2, "2.", false)) {
/* 357 */                                   I000II.I001IO000("Check failed.");
/* 71 */                                    return null;
                                        }
/* 361 */                               if (str2 != null) {
/* 364 */                                   oOI000iI1 = oOI000iI1.I0000O;
                                        }
                                    } else {
/* 367 */                               oOI000iI1 = null;
                                    }
/* 368 */                           if (oOI000iI1 != null) {
/* 372 */                               oOI000iI1.I00000oOI.size();
/* 382 */                               ((O00loo1i111O) I00ilO02).I00Iooi00oi().size();
                                    }
/* 428 */                           boolean z = ((I00iiI) ((I0oO0iO1l0lo) ((I0l1OOl1l10) o01l1iooo0.I00iOIl).I000lI).I00iio).invoke(O00o0lOioI.I00000oIO) == Oi01Iillli.I00iiO && (I00ilO02 instanceof Illlil) && O0000Ioio00.I0000O(I00ilO02.I00111O(O00loo1i111O.I010101Oo1lO), Boolean.TRUE);
/* 430 */                           List<Ooo00oi0O> listI00Iooi00oi = oOOOI1ioIo2.I00Iooi00oi();
/* 442 */                           ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(listI00Iooi00oi, i2));
/* 453 */                           for (Ooo00oi0O ooo00oi0O2 : listI00Iooi00oi) {
/* 478 */                               OoOIo1ioI0 ooOIo1ioI0 = (oOI000iI1 == null || (list = oOI000iI1.I00000oOI) == null) ? null : (OoOIo1ioI0) IOOi0Ool1i.I00II0oii1o(ooo00oi0O2.I00ilO0, list);
/* 482 */                               OiI0lII1i oiI0lII1i = new OiI0lII1i(i3);
/* 485 */                               oiI0lII1i.I00iiI = ooo00oi0O2;
/* 487 */                               VarHandle.storeStoreFence();
/* 490 */                               ArrayList arrayList4 = arrayList3;
/* 523 */                               arrayList4.add(I000O01llI0((O00l1iI0ol) I00ilO02, ooo00oi0O2, false, ooo00oi0O2 != null ? iioIlooliI.I0000Il00O(o01l1iooo0I0000Il00O, ooo00oi0O2.getAnnotations()) : o01l1iooo0I0000Il00O, I11I1111oi0.I00iiO, ooOIo1ioI0, z, oiI0lII1i));
/* 526 */                               arrayList3 = arrayList4;
/* 529 */                               i3 = 2;
                                    }
/* 532 */                           ArrayList arrayList5 = arrayList3;
/* 541 */                           OOOO01l oOOO01l = I00ilO02 instanceof OOOO01l ? (OOOO01l) I00ilO02 : null;
/* 554 */                           I11I1111oi0 i11I1111oi0 = (oOOO01l == null || !l011Ol0O.I00000oIO(oOOO01l)) ? I11I1111oi0.I00iiI : I11I1111oi0.I00iio;
/* 564 */                           OoOIo1ioI0 ooOIo1ioI02 = oOI000iI1 != null ? oOI000iI1.I00000oIO : null;
/* 567 */                           O00l1iI0ol o00l1iI0ol = (O00l1iI0ol) I00ilO02;
/* 574 */                           int i4 = 0;
/* 575 */                           Ol0IO1iloi ol0IO1iloi = new Ol0IO1iloi(oOOOI1ioIo2, true, o01l1iooo0I0000Il00O, i11I1111oi0, false);
/* 578 */                           O0iIl1 o0iIl1I0001Ioi1lo = o00l1iI0ol.I0001Ioi1lo();
/* 582 */                           Collection collectionI000o00OoI0I = o00l1iI0ol.I000o00OoI0I();
/* 596 */                           ArrayList arrayList6 = new ArrayList(IOOi1I.I0000O(collectionI000o00OoI0I, 10));
/* 599 */                           Iterator it3 = collectionI000o00OoI0I.iterator();
/* 607 */                           while (it3.hasNext()) {
/* 619 */                               arrayList6.add(((IIiO00o1o) it3.next()).I0001Ioi1lo());
                                    }
/* 630 */                           O0iIl1 o0iIl1I000OOo1O = I000OOo1O(ol0IO1iloi, o0iIl1I0001Ioi1lo, arrayList6, ooOIo1ioI02, false);
/* 643 */                           if (OoOilo0Oliii.I0000Il00O(I00ilO02.I0001Ioi1lo(), oOo1l011, null)) {
/* 722 */                               oIoi0IIoi = new OIoi0IIoi(iIIlllIIO.I00000oIO, new IiO0Ioi1lO1O());
/* 725 */                               if (type == null && o0iIl1I000OOo1O == null) {
/* 733 */                                   if (arrayList5.isEmpty()) {
/* 736 */                                       Iterator it4 = arrayList5.iterator();
/* 744 */                                       while (it4.hasNext()) {
/* 752 */                                           if (((O0iIl1) it4.next()) != null) {
                                                        break;
                                                    }
                                                }
/* 755 */                                       if (oIoi0IIoi != null) {
                                                }
                                            } else if (oIoi0IIoi != null) {
/* 758 */                                       i = 10;
                                            }
                                        }
/* 761 */                               if (type == null) {
/* 763 */                                   O0ioOi0Oo1ii o0ioOi0Oo1iiI00OOll1 = I00ilO02.I00OOll1();
/* 774 */                                   type = o0ioOi0Oo1iiI00OOll1 != null ? o0ioOi0Oo1iiI00OOll1.getType() : null;
                                        }
/* 777 */                               i = 10;
/* 783 */                               ArrayList arrayList7 = new ArrayList(IOOi1I.I0000O(arrayList5, 10));
/* 786 */                               it = arrayList5.iterator();
/* 794 */                               while (it.hasNext()) {
/* 796 */                                   Object next = it.next();
/* 800 */                                   int i5 = i4 + 1;
/* 802 */                                   if (i4 < 0) {
/* 827 */                                       IOOi1I.I000lI();
/* 832 */                                       throw null;
                                            }
/* 804 */                                   O0iIl1 type2 = (O0iIl1) next;
/* 806 */                                   if (type2 == null) {
/* 818 */                                       type2 = ((Ooo00oi0O) I00ilO02.I00Iooi00oi().get(i4)).getType();
                                            }
/* 822 */                                   arrayList7.add(type2);
/* 825 */                                   i4 = i5;
                                        }
/* 833 */                               if (o0iIl1I000OOo1O == null) {
/* 835 */                                   o0iIl1I000OOo1O = I00ilO02.I0001Ioi1lo();
                                        }
/* 839 */                               I00ilO02 = o00l1iI0ol.I00ilO0(type, arrayList7, o0iIl1I000OOo1O, oIoi0IIoi);
                                    } else {
/* 645 */                               O0ioOi0Oo1ii o0ioOi0Oo1iiI00OOll12 = I00ilO02.I00OOll1();
/* 661 */                               if (!(o0ioOi0Oo1iiI00OOll12 != null ? OoOilo0Oliii.I0000Il00O(o0ioOi0Oo1iiI00OOll12.getType(), oOo1l011, null) : false)) {
/* 663 */                                   List listI00Iooi00oi2 = I00ilO02.I00Iooi00oi();
/* 671 */                                   if (!(listI00Iooi00oi2 instanceof Collection) || !listI00Iooi00oi2.isEmpty()) {
/* 683 */                                       Iterator it5 = listI00Iooi00oi2.iterator();
/* 691 */                                       while (it5.hasNext()) {
/* 708 */                                           if (OoOilo0Oliii.I0000Il00O(((Ooo00oi0O) it5.next()).getType(), oOo1l011, null)) {
/* 722 */                                               oIoi0IIoi = new OIoi0IIoi(iIIlllIIO.I00000oIO, new IiO0Ioi1lO1O());
                                                        break;
                                                    }
                                                }
                                            }
/* 711 */                                   oIoi0IIoi = null;
/* 725 */                                   if (type == null) {
/* 733 */                                       if (arrayList5.isEmpty()) {
                                                }
                                            }
/* 761 */                                   if (type == null) {
                                            }
/* 777 */                                   i = 10;
/* 783 */                                   ArrayList arrayList72 = new ArrayList(IOOi1I.I0000O(arrayList5, 10));
/* 786 */                                   it = arrayList5.iterator();
/* 794 */                                   while (it.hasNext()) {
                                            }
/* 833 */                                   if (o0iIl1I000OOo1O == null) {
                                            }
/* 839 */                                   I00ilO02 = o00l1iI0ol.I00ilO0(type, arrayList72, o0iIl1I000OOo1O, oIoi0IIoi);
                                        }
                                    }
                                }
                            }
                        } else {
/* 40 */                    i = i2;
                        }
/* 843 */               arrayList.add(I00ilO02);
/* 846 */               i2 = i;
                    }
/* 900 */           return arrayList;
                }

                public ArrayList I000iOII() {
/* 3 */             IliO010iiOOI looil0o1io1 = (IliO010iiOOI) this.I00iiI;
/* 5 */             if (looil0o1io1 == null) {
/* 19 */                if (System.getProperty("java.vendor").equals("The Android Project")) {
/* 24 */                    looil0o1io1 = new I0oII1i00(0);
                        } else {
/* 30 */                    String property = System.getProperty("os.name");
/* 83 */                    looil0o1io1 = property.startsWith("Windows") ? new looil0O1Io1(16) : property.startsWith("Mac") ? new I0oII1i00(1) : property.startsWith("OS/400") ? new I0oII1i00(2) : new I0oII1i00(3);
                        }
/* 86 */                this.I00iiI = looil0o1io1;
                    }
/* 88 */            ArrayList arrayListI00000oOI = looil0o1io1.I00000oOI();
/* 94 */            ArrayList arrayList = new ArrayList();
/* 97 */            Iterator it = arrayListI00000oOI.iterator();
/* 105 */           while (it.hasNext()) {
/* 113 */               I000o00OoI0I((File) it.next(), arrayList);
                    }
/* 245 */           return arrayList;
                }

                public boolean I000lI(O0iiOioolIi o0iiOioolIi) {
/* 5 */             if (!o0iiOioolIi.I00Io1lO()) {
/* 9 */                 IolioOO1.I0000Il00O("DepthSortedSet.remove called on an unattached node");
                    }
/* 16 */            return ((OlI00Io1) this.I00iiI).remove(o0iiOioolIi);
                }

                public void I000oI1ioi(int i, Object obj, OiOIl0 oiOIl0) {
/* 1 */             I01IlIoOI i01IlIoOI = (I01IlIoOI) obj;
/* 5 */             IOOOiI0 iOOOiI0 = (IOOOiI0) this.I00iiI;
/* 8 */             iOOOiI0.I001l0I00(i, 2);
/* 15 */            iOOOiI0.I001lllioOl(i01IlIoOI.I00000oIO(oiOIl0));
/* 18 */            oiOIl0.I0001Ioi1lo(i01IlIoOI, this);
                }

                public void I00100l0(loI1oilO loi1oilo, lOl1ol1OOO lol1ol1ooo, lOl1IOlo lol1iolo) {
/* 9 */             lOI101 loi101 = loi1oilo.I00iiO == 2 ? lOI101.ALL_CLASSIFICATIONS : lOI101.NO_CLASSIFICATIONS;
/* 18 */            lOIOi10O loioi10o = loi1oilo.I00iiI == 2 ? lOIOi10O.ALL_LANDMARKS : lOIOi10O.NO_LANDMARKS;
/* 27 */            lOII1OO loii1oo = loi1oilo.I00iio == 2 ? lOII1OO.ALL_CONTOURS : lOII1OO.NO_CONTOURS;
/* 36 */            lOIi1l loii1l = loi1oilo.I00iOIl == 2 ? lOIi1l.ACCURATE : lOIi1l.FAST;
/* 40 */            Float fValueOf = Float.valueOf(loi1oilo.I00ilO0);
/* 46 */            Boolean boolValueOf = Boolean.valueOf(loi1oilo.I00ilI0I1);
/* 52 */            lOIloi0Ol loiloi0ol = new lOIloi0Ol();
/* 55 */            loiloi0ol.I00000oIO = loioi10o;
/* 57 */            loiloi0ol.I00000oOI = loi101;
/* 59 */            loiloi0ol.I0000Il00O = loii1l;
/* 61 */            loiloi0ol.I0000O = loii1oo;
/* 63 */            loiloi0ol.I0000oI00 = boolValueOf;
/* 65 */            loiloi0ol.I0001Ioi1lo = fValueOf;
/* 67 */            VarHandle.storeStoreFence();
/* 72 */            short s = 0;
/* 78 */            int i = lol1ol1ooo == lOl1ol1OOO.OPTIONAL_MODULE_FACE_DETECTION_CREATE ? 1 : 0;
/* 81 */            lo0iO1OO lo0io1oo = (lo0iO1OO) this.I00iiI;
/* 83 */            o0IiOl o0iiol = lo0io1oo.I0000oI00;
/* 85 */            HashMap map = lo0io1oo.I000OOo1O;
/* 87 */            long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 95 */            if (map.get(lol1ol1ooo) != null && jElapsedRealtime - ((Long) map.get(lol1ol1ooo)).longValue() <= 30000) {
/* 116 */               return;
                    }
/* 121 */           map.put(lol1ol1ooo, Long.valueOf(jElapsedRealtime));
/* 127 */           l1IllOOOo1 l1illoooo1 = new l1IllOOOo1(4);
/* 132 */           lO1o1OIl lo1o1oil = new lO1o1OIl();
/* 135 */           lo1o1oil.I00000oIO = loiloi0ol;
/* 137 */           lo1o1oil.I00000oOI = lol1iolo;
/* 139 */           VarHandle.storeStoreFence();
/* 142 */           l1illoooo1.I00iio = lo1o1oil;
/* 148 */           I00Ol00 i00Ol00 = new I00Ol00(24, s);
/* 157 */           i00Ol00.I0000O = new IIlOoolol0ll(7);
/* 159 */           i00Ol00.I0000Il00O = l1illoooo1;
/* 161 */           lo1iloiI1.I000II();
/* 164 */           i00Ol00.I00000oOI = i;
/* 166 */           VarHandle.storeStoreFence();
/* 186 */           String strI00000oIO = o0iiol.I000OOo1O() ? (String) o0iiol.I000II() : O0oO1lOOo1.I0000Il00O.I00000oIO(lo0io1oo.I000II);
/* 194 */           IO0iIlI1li iO0iIlI1li = new IO0iIlI1li(19);
/* 197 */           iO0iIlI1li.I00iiI = lo0io1oo;
/* 199 */           iO0iIlI1li.I00iiO = i00Ol00;
/* 201 */           iO0iIlI1li.I00iio = lol1ol1ooo;
/* 203 */           iO0iIlI1li.I00ilI0I1 = strI00000oIO;
/* 205 */           VarHandle.storeStoreFence();
/* 208 */           io1OllI.I00000oIO(1, iO0iIlI1li);
                }

                public boolean I00100o1O0lo() {
/* 5 */             l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) this.I00iiI).I00ilO0;
/* 7 */             l0olllO1i.I000II(l01o0io1ooo0);
/* 15 */            return Log.isLoggable(l01o0io1ooo0.I010l1O(), 3);
                }

                public void I0010o(int i, Object obj, iI110OIoiOl ii110oioiol) {
/* 3 */             i1lllO0 i1lllo0 = (i1lllO0) this.I00iiI;
/* 5 */             i1ilO0II i1ilo0ii = (i1ilO0II) obj;
/* 8 */             i1lllo0.I0000O(i, 2);
/* 15 */            i1lllo0.I0010I0i(i1ilo0ii.I0000Il00O(ii110oioiol));
/* 18 */            ii110oioiol.I000OOo1O(i1ilo0ii, this);
                }

                @Override
                public void accept(Object obj, Object obj2) {
/* 1 */             OloIlI0ll oloIlI0ll = (OloIlI0ll) obj2;
/* 9 */             i0i00i01I i0i00i01i = (i0i00i01I) ((i0i01O0O11O) obj).I000l1();
/* 13 */            OloOI1o oloOI1o = (OloOI1o) this.I00iiI;
/* 15 */            Parcel parcelI0000oI00 = i0i00i01i.I0000oI00();
/* 19 */            i0OlOO.I00000oOI(parcelI0000oI00, oloOI1o);
                    try {
/* 26 */                i0i00i01i.I000O01llI0.transact(1, parcelI0000oI00, null, 1);
/* 29 */                parcelI0000oI00.recycle();
/* 32 */                oloIlI0ll.I00000oOI(null);
                    } catch (Throwable th) {
/* 37 */                parcelI0000oI00.recycle();
/* 106 */               throw th;
                    }
                }

                @Override
                public IlOO1o00IOi get(int i) {
/* 3 */             return (IlOOoI0ooOO) this.I00iiI;
                }

                @Override
                public void onCancel() {
/* 5 */             ((OlIIlIO1O) this.I00iiI).I00000oIO();
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 8:
/* 15 */                    return ((OlI00Io1) this.I00iiI).toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }

                @Override
                public Object zza() {
                    switch (this.I00iOIl) {
                        case PoseLandmark.RIGHT_THUMB:
/* 65 */                    return ((OoIOil1iIO) this.I00iiI).I00000oIO("FIREBASE_ML_SDK", Il0IIil.I00000oIO("proto"), new o0llIi(17));
                        default:
/* 8 */                     Class cls = (Class) this.I00iiI;
                            try {
/* 12 */                        return loIi0I1Ilo.I00000oIO.I00000oIO(cls);
                            } catch (Exception e) {
/* 18 */                        String strValueOf = String.valueOf(cls);
/* 41 */                        OIiilo1Ool0o.I000iOII(IIlIOloOOO.I0010I0i(new StringBuilder(strValueOf.length() + 147), "Unable to create instance of ", strValueOf, ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem."), e);
/* 44 */                        return null;
                            }
                    }
                }

                @Override
                public void zzb(Object obj) {
                }

/* 46 */        public Oi1ol0llI(Object obj, int i) {
/* 47 */            this.I00iOIl = i;
                    this.I00iiI = obj;
                }

/* 47 */        public Oi1ol0llI(int i, boolean z) {
/* 48 */            this.I00iOIl = i;
                }

                @Override
/* 70 */        public void zza(Throwable th) {
/* 71 */            ilOI1I0lloOl iloi1i0llool = (ilOI1I0lloOl) this.I00iiI;
                    synchronized (iloi1i0llool.I0001Ioi1lo) {
/* 74 */                iloi1i0llool.I000O01llI0 = null;
                    }
                }
            }
