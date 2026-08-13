            package p000;

            import android.content.Context;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.security.Provider;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Map;
            import javax.crypto.Cipher;
            
/* 35 */    public final class i1O10l1io1iO implements OloOIoiI1, Oi1l0o, ii0lO1Iiio, OoI0o0oiol0l, IOoOOI1ii, Il0OlI, OOIoilO1I10I, OiOiIl1, i0Ii0I1ll, iiIi1oo0Io, IOiOiIIiii1, IioIOllO1, lo11I0lO {
                public static i1O10l1io1iO I00iiI;
                public static final i1O10l1io1iO I00iiO = new i1O10l1io1iO(1);
                public static final i1O10l1io1iO I00iio = new i1O10l1io1iO(2);
                public static final i1O10l1io1iO I00ilI0I1 = new i1O10l1io1iO(4);
                public static final i1O10l1io1iO I00ilO0 = new i1O10l1io1iO(5);
                public static final i1O10l1io1iO I00io1l = new i1O10l1io1iO(6);
                public static final i1O10l1io1iO I00ioIO = new i1O10l1io1iO(7);
                public static final i1O10l1io1iO I00l0I0l0lO1 = new i1O10l1io1iO(8);
                public static final i1O10l1io1iO I00l0OO0IO = new i1O10l1io1iO(20);
                public static final i1O10l1io1iO I00li1OI = new i1O10l1io1iO(21);
                public static final i1O10l1io1iO I00ll1 = new i1O10l1io1iO(23);
                public static final i1O10l1io1iO I00lli11 = new i1O10l1io1iO(24);
                public static final i1O10l1io1iO I00lll10 = new i1O10l1io1iO(25);
                public static final i1O10l1io1iO I00o0iI0io1 = new i1O10l1io1iO(27);
                public final int I00iOIl;

                public i1O10l1io1iO(int i) {
/* 1 */             this.I00iOIl = i;
                }

                public static O0IOO1lIiOl I000O01llI0(String str) {
                    O0I1lo0l o0I1lo0l;
/* 2 */             char cCharAt = str.charAt(0);
/* 6 */             O0I1lo0l[] o0I1lo0lArrValues = O0I1lo0l.values();
/* 10 */            int length = o0I1lo0lArrValues.length;
/* 11 */            int i = 0;
                    while (true) {
/* 13 */                if (i >= length) {
/* 29 */                    o0I1lo0l = null;
                            break;
                        }
/* 15 */                o0I1lo0l = o0I1lo0lArrValues[i];
/* 23 */                if (o0I1lo0l.I00iiO.charAt(0) == cCharAt) {
                            break;
                        }
/* 26 */                i++;
                    }
/* 30 */            if (o0I1lo0l != null) {
/* 34 */                return new O0IO10lo0oi(o0I1lo0l);
                    }
/* 40 */            if (cCharAt == 'V') {
/* 93 */                return new O0IO10lo0oi(null);
                    }
/* 45 */            if (cCharAt != '[') {
/* 49 */                if (cCharAt == 'L') {
/* 53 */                    OlOoOIi0o.I0010I0i(str, ';');
                        }
/* 68 */                return new O0IO0lIIoio(str.substring(1, str.length() - 1));
                    }
/* 78 */            O0IOO1lIiOl o0IOO1lIiOlI000O01llI0 = I000O01llI0(str.substring(1));
/* 82 */            O0IO0Oi o0IO0Oi = new O0IO0Oi();
/* 85 */            o0IO0Oi.I000OOo1O = o0IOO1lIiOlI000O01llI0;
/* 87 */            VarHandle.storeStoreFence();
/* 90 */            return o0IO0Oi;
                }

                public static O0oo1oi0oil I000OiO(OIoi0IIoi[] oIoi0IIoiArr, long j, long j2, int i) {
/* 3 */             if ((i & 2) != 0) {
/* 5 */                 j = 0;
                    }
/* 7 */             long j3 = j;
/* 10 */            if ((i & 4) != 0) {
/* 12 */                j2 = 9187343241974906880L;
                    }
/* 17 */            long j4 = j2;
/* 21 */            ArrayList arrayList = new ArrayList(oIoi0IIoiArr.length);
/* 26 */            for (OIoi0IIoi oIoi0IIoi : oIoi0IIoiArr) {
/* 40 */                arrayList.add(IOOiio0i.I00000oIO(((IOOiio0i) oIoi0IIoi.I00iiI).I00000oIO));
                    }
/* 49 */            ArrayList arrayList2 = new ArrayList(oIoi0IIoiArr.length);
/* 52 */            for (OIoi0IIoi oIoi0IIoi2 : oIoi0IIoiArr) {
/* 68 */                arrayList2.add(Float.valueOf(((Number) oIoi0IIoi2.I00iOIl).floatValue()));
                    }
/* 76 */            return new O0oo1oi0oil(arrayList, arrayList2, j3, j4);
                }

                public static OOilloIIO0 I000iOII(List list) {
/* 12 */            return new OOilloIIO0(list, null, 9205357640488583168L, 2000.0f);
                }

                public static String I000l1(O0IOO1lIiOl o0IOO1lIiOl) {
/* 3 */             if (o0IOO1lIiOl instanceof O0IO0Oi) {
/* 15 */                return "[".concat(I000l1(((O0IO0Oi) o0IOO1lIiOl).I000OOo1O));
                    }
/* 22 */            if (o0IOO1lIiOl instanceof O0IO10lo0oi) {
/* 26 */                O0I1lo0l o0I1lo0l = ((O0IO10lo0oi) o0IOO1lIiOl).I000OOo1O;
                        return o0I1lo0l != null ? o0I1lo0l.I00iiO : "V";
                    }
/* 38 */            if (o0IOO1lIiOl instanceof O0IO0lIIoio) {
/* 53 */                return IlIi0I0.I000oI1ioi(new StringBuilder(OlIo0Ooi1loI.I001IIilI0O), ((O0IO0lIIoio) o0IOO1lIiOl).I000OOo1O, ';');
                    }
/* 58 */            I000II.I00000oIO();
/* 61 */            return null;
                }

                public static O0oo1oi0oil I000lI(List list) {
/* 43 */            return new O0oo1oi0oil(list, null, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & 4294967295L));
                }

                public static synchronized void I000o00OoI0I() {
/* 6 */             if (I00iiI == null) {
/* 14 */                I00iiI = new i1O10l1io1iO(0);
                    }
                }

                @Override
                public Map I00000oIO(Oi0OO1IIl1 oi0OO1IIl1) {
/* 1 */             return Il011I1OiO0I.I00iOIl;
                }

                @Override
                public long I00000oOI(long j, long j2) {
/* 18 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
/* 35 */            long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L);
/* 36 */            int i = OiO101lO.I00000oIO;
/* 106 */           return jFloatToRawIntBits;
                }

                @Override
                public Object I0000Il00O() {
/* 3 */             return new i0Iooi1oi();
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
                /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void I0000O(O1ooiI111i o1ooiI111i, float f, float f2, long j, OioOIi1o0I oioOIi1o0I, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    long jI0000oI00;
                    int i3;
                    int i4;
                    float f3;
                    OioOIi1o0I oioOIi1o0I2;
                    OOloioIl oOloioIlI001IO000;
/* 12 */            iloI0lOlll1.I00i0O(-1895596205);
/* 25 */            int i5 = (iloI0lOlll1.I000II(o1ooiI111i) ? 4 : 2) | i | 384;
/* 29 */            if ((i2 & 8) == 0) {
/* 31 */                jI0000oI00 = j;
/* 37 */                if (iloI0lOlll1.I0001Ioi1lo(jI0000oI00)) {
/* 39 */                    i3 = Barcode.FORMAT_PDF417;
                        }
/* 47 */                i4 = i5 | i3 | 24576;
/* 64 */                if (iloI0lOlll1.I00OIl(i4 & 1, (i4 & 9363) == 9362)) {
/* 135 */                   iloI0lOlll1.I00OilO00Il();
/* 138 */                   f3 = f2;
/* 140 */                   oioOIi1o0I2 = oioOIi1o0I;
                        } else {
/* 66 */                    iloI0lOlll1.I00Ol00();
/* 71 */                    if ((i & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 88 */                        f3 = OOIOOl1oOOO.I00000oOI;
/* 92 */                        if ((i2 & 8) != 0) {
/* 96 */                            jI0000oI00 = IOOl0iiliOl.I0000oI00(OOIOOl1oOOO.I00000oIO, iloI0lOlll1);
                                }
/* 100 */                       oioOIi1o0I2 = OOIOOl1oOOO.I0000Il00O;
                            } else {
/* 80 */                        iloI0lOlll1.I00OilO00Il();
/* 83 */                        f3 = f2;
/* 85 */                        oioOIi1o0I2 = oioOIi1o0I;
                            }
/* 102 */                   iloI0lOlll1.I0010o();
/* 131 */                   lOO1OIO00.I00000oIO(iloI0lOlll1, i0I1I0.I00000oOI(Ol0iOOO0.I000OiO(o1ooiI111i, f3).I0000O(new Ol0iIolO0ii1(f, 0.0f, f, 0.0f, false, 10)), jI0000oI00, oioOIi1o0I2));
                        }
/* 142 */               oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 146 */               if (oOloioIlI001IO000 == null) {
/* 150 */                   Olll1OiOI1 olll1OiOI1 = new Olll1OiOI1();
/* 155 */                   olll1OiOI1.I00iOIl = this;
/* 157 */                   olll1OiOI1.I00iiI = o1ooiI111i;
/* 161 */                   olll1OiOI1.I00iiO = f;
/* 163 */                   olll1OiOI1.I00iio = f3;
/* 165 */                   olll1OiOI1.I00ilI0I1 = jI0000oI00;
/* 167 */                   olll1OiOI1.I00ilO0 = oioOIi1o0I2;
/* 169 */                   olll1OiOI1.I00io1l = i;
/* 171 */                   olll1OiOI1.I00ioIO = i2;
/* 173 */                   VarHandle.storeStoreFence();
/* 176 */                   oOloioIlI001IO000.I0000O = olll1OiOI1;
/* 1750 */                  return;
                        }
/* 1750 */              return;
                    }
/* 42 */            jI0000oI00 = j;
/* 44 */            i3 = Barcode.FORMAT_UPC_E;
/* 47 */            i4 = i5 | i3 | 24576;
/* 64 */            if (iloI0lOlll1.I00OIl(i4 & 1, (i4 & 9363) == 9362)) {
                    }
/* 142 */           oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 146 */           if (oOloioIlI001IO000 == null) {
                    }
                }

                @Override
                public Object I0000oI00(String str, Provider provider) {
                    return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
                }

                public void I000II(O1ooiI111i o1ooiI111i, float f, long j, IloI0lOlll1 iloI0lOlll1, int i) {
/* 4 */             iloI0lOlll1.I00i0O(-1498258020);
/* 17 */            int i2 = (iloI0lOlll1.I000II(o1ooiI111i) ? 4 : 2) | i | 176;
/* 24 */            int i3 = 1;
/* 35 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 147) != 146)) {
/* 37 */                iloI0lOlll1.I00Ol00();
/* 41 */                if ((i & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 54 */                    f = OOIOOl1oOOO.I00000oOI;
/* 58 */                    j = IOOl0iiliOl.I0000oI00(OOIOOl1oOOO.I00000oIO, iloI0lOlll1);
                        } else {
/* 50 */                    iloI0lOlll1.I00OilO00Il();
                        }
/* 62 */                iloI0lOlll1.I0010o();
/* 81 */                II1oOI10.I00000oIO(i0I1I0.I00000oOI(Ol0iOOO0.I000II(Ol0iOOO0.I0000oI00(o1ooiI111i, 1.0f), f), j, iO0ioilo.I00000oIO), iloI0lOlll1, 0);
                    } else {
/* 85 */                iloI0lOlll1.I00OilO00Il();
                    }
/* 88 */            OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 92 */            if (oOloioIlI001IO000 != null) {
/* 96 */                IlOiOi100 ilOiOi100 = new IlOiOi100(i3);
/* 99 */                ilOiOi100.I00iio = this;
/* 101 */               ilOiOi100.I00ilI0I1 = o1ooiI111i;
/* 103 */               ilOiOi100.I00iiI = f;
/* 105 */               ilOiOi100.I00iiO = j;
/* 107 */               VarHandle.storeStoreFence();
/* 110 */               oOloioIlI001IO000.I0000O = ilOiOi100;
                    }
                }

                @Override
                public IioIO1i I000OOo1O(Context context, String str, IioI1o1 iioI1o1) {
/* 3 */             IioIO1i iioIO1i = new IioIO1i();
/* 6 */             int iI0000O = iioI1o1.I0000O(context, str);
/* 10 */            iioIO1i.I00000oOI = iI0000O;
/* 12 */            if (iI0000O != 0) {
/* 15 */                iioIO1i.I0000O = -1;
/* 17 */                return iioIO1i;
                    }
/* 19 */            int iI0000Il00O = iioI1o1.I0000Il00O(context, str, true);
/* 23 */            iioIO1i.I0000Il00O = iI0000Il00O;
/* 25 */            if (iI0000Il00O != 0) {
/* 27 */                iioIO1i.I0000O = 1;
                    }
/* 98 */            return iioIO1i;
                }

                @Override
                public Object apply(Object obj) {
                    switch (this.I00iOIl) {
                        case 8:
                            break;
                        case PoseLandmark.LEFT_INDEX:
                            break;
                    }
/* 6 */             return (byte[]) obj;
                }

                @Override
                public Object create(IOiOIoiiO0i iOiOIoiiO0i) {
/* 7 */             OOiO0Il oOiO0IlI0001Ioi1lo = ((I1ii1o0) iOiOIoiiO0i).I0001Ioi1lo(O1o01ii1o.class);
/* 11 */            Il1I0i il1I0i = new Il1I0i();
/* 14 */            il1I0i.I00000oIO = oOiO0IlI0001Ioi1lo;
/* 16 */            VarHandle.storeStoreFence();
/* 29 */            return il1I0i;
                }

                @Override
                public Object zza() {
                    switch (this.I00iOIl) {
                        case PoseLandmark.RIGHT_INDEX:
/* 117 */                   List list = iol1II1ii1i.I00000oIO;
/* 121 */                   iI1lO0li.I00iiI.get();
/* 140 */                   return (String) iI1liIi1li.I00000oIO.I001IO000("measurement.edpb.events_cached_in_no_data_mode", 14, "_f,_v,_cmp").get();
                        case PoseLandmark.LEFT_THUMB:
/* 90 */                    List list2 = iol1II1ii1i.I00000oIO;
/* 94 */                    iI1lO0li.I00iiI.get();
/* 114 */                   return (Long) iI1liIi1li.I00000oIO.I00111O(41, 1800000L, "measurement.sgtm.batch.retry_interval").get();
                        case PoseLandmark.RIGHT_THUMB:
                        default:
/* 9 */                     return new lo0olliO11(true);
                        case PoseLandmark.LEFT_HIP:
/* 55 */                    List list3 = iol1II1ii1i.I00000oIO;
/* 59 */                    iI1lO0li.I00iiI.get();
/* 85 */                    return Integer.valueOf((int) ((Long) iI1liIi1li.I00000oIO.I00111O(19, 500L, "measurement.upload.max_event_parameter_value_length").get()).longValue());
                        case PoseLandmark.RIGHT_HIP:
/* 32 */                    List list4 = iol1II1ii1i.I00000oIO;
/* 36 */                    iI1lO0li.I00iiI.get();
/* 52 */                    return (Boolean) iI1liIi1li.I00000oIO.I0010o(true, "measurement.config.bundle_for_all_apps_on_backgrounded", 2).get();
                        case PoseLandmark.LEFT_KNEE:
/* 13 */                    List list5 = iol1II1ii1i.I00000oIO;
/* 29 */                    return (Boolean) iIOliiO.I00000oIO.get();
                    }
                }

                @Override
                public ii0oOi0 mo21zzb(Class cls) {
/* 8 */             if (!ii0OoOo10.class.isAssignableFrom(cls)) {
/* 51 */                I000II.I000iOII("Unsupported message type: ".concat(cls.getName()));
/* 7 */                 return null;
                    }
                    try {
/* 23 */                return (ii0oOi0) ii0OoOo10.I0001Ioi1lo(cls.asSubclass(ii0OoOo10.class)).I0010I0i(3, null);
                    } catch (Exception e) {
/* 37 */                OIiilo1Ool0o.I000iOII("Unable to get message info for ".concat(cls.getName()), e);
/* 7 */                 return null;
                    }
                }

                @Override
                public boolean zzc(Class cls) {
/* 3 */             return ii0OoOo10.class.isAssignableFrom(cls);
                }

                @Override
/* 36 */        public void I0001Ioi1lo(int i, Object obj) {
                }

                @Override
/* 203 */       public void onScrollLimit(int i, int i2, int i3, boolean z) {
                }

                @Override
/* 203 */       public void onScrollProgress(int i, int i2, int i3, int i4) {
                }
            }
