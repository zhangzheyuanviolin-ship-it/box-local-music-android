            package p000;

            import android.content.Context;
            import android.content.IntentFilter;
            import android.os.Handler;
            import android.os.Looper;
            import android.util.Log;
            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.net.URL;
            import java.nio.charset.Charset;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.concurrent.atomic.AtomicBoolean;
            
/* 316 */   public final class IiOili0lOO1 implements i0Ii0I1ll {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;
                public Object I00io1l;
                public Object I00ioIO;
                public Object I00l0I0l0lO1;
                public Object I00l0OO0IO;

                public IiOili0lOO1(Ii10lIo0l1 ii10lIo0l1, OI1IlOlol oI1IlOlol, Ii1Ool1 ii1Ool1, Oi0Oooi oi0Oooi, OooO111lO1OI oooO111lO1OI, II0O0I00oOi iI0O0I00oOi, IiOlIoIo iiOlIoIo, IOiOol0 iOiOol0, List list) {
                    Map linkedHashMap;
                    int i;
                    Ooo0Ioii0o0 ooo0Ioii0o0;
/* 7 */             int i2 = 0;
/* 8 */             this.I00iOIl = 0;
/* 12 */            O1I0OloI o1I0OloI = (O1I0OloI) ii10lIo0l1.I00000oIO;
/* 17 */            this.I00iiI = ii10lIo0l1;
/* 21 */            this.I00iiO = oI1IlOlol;
/* 25 */            this.I00iio = ii1Ool1;
/* 29 */            this.I00ilI0I1 = oi0Oooi;
/* 33 */            this.I00ilO0 = oooO111lO1OI;
/* 37 */            this.I00io1l = iI0O0I00oOi;
/* 39 */            this.I00ioIO = iiOlIoIo;
/* 62 */            String str = "Deserializer for \"" + ii1Ool1.getName() + '\"';
/* 73 */            String strI000O01llI0 = iiOlIoIo != null ? iiOlIoIo.I000O01llI0() : "[container not found]";
/* 77 */            IOiOol0 iOiOol02 = new IOiOol0(9);
/* 80 */            iOiOol02.I00iiI = this;
/* 84 */            iOiOol02.I00iiO = iOiOol0;
/* 86 */            iOiOol02.I00iio = str;
/* 88 */            iOiOol02.I00ilI0I1 = strI000O01llI0;
/* 92 */            OoOIlli ooOIlli = new OoOIlli(i2);
/* 95 */            ooOIlli.I00iiI = iOiOol02;
/* 97 */            VarHandle.storeStoreFence();
/* 104 */           iOiOol02.I00ilO0 = o1I0OloI.I0000Il00O(ooOIlli);
/* 108 */           int i3 = 1;
/* 109 */           OoOIlli ooOIlli2 = new OoOIlli(i3);
/* 112 */           ooOIlli2.I00iiI = iOiOol02;
/* 114 */           VarHandle.storeStoreFence();
/* 121 */           iOiOol02.I00io1l = o1I0OloI.I0000Il00O(ooOIlli2);
/* 127 */           if (list.isEmpty()) {
/* 129 */               linkedHashMap = Il011I1OiO0I.I00iOIl;
                    } else {
/* 135 */               linkedHashMap = new LinkedHashMap();
/* 142 */               Iterator it = list.iterator();
/* 146 */               int i4 = 0;
/* 151 */               while (it.hasNext()) {
/* 153 */                   int i5 = i4 + 1;
/* 159 */                   OOi0O1i1lOi oOi0O1i1lOi = (OOi0O1i1lOi) it.next();
/* 163 */                   Integer numValueOf = Integer.valueOf(oOi0O1i1lOi.I00iio);
/* 171 */                   IiOili0lOO1 iiOili0lOO1 = (IiOili0lOO1) iOiOol02.I00iiI;
/* 179 */                   O1I0OloI o1I0OloI2 = (O1I0OloI) ((Ii10lIo0l1) iiOili0lOO1.I00iiI).I00000oIO;
/* 183 */                   Ii1Ool1 ii1Ool12 = (Ii1Ool1) iiOili0lOO1.I00iio;
/* 185 */                   I11IiIloOo i11IiIloOo = i1i0olI.I00iiO;
/* 191 */                   int i6 = i2;
/* 195 */                   OI1Iio0ii1 oI1Iio0ii1I00000oOI = l1iI1lOO.I00000oOI((OI1IlOlol) iiOili0lOO1.I00iiO, oOi0O1i1lOi.I00ilI0I1);
/* 201 */                   int iOrdinal = oOi0O1i1lOi.I00io1l.ordinal();
/* 207 */                   if (iOrdinal == 0) {
/* 228 */                       i = i3;
/* 230 */                       ooo0Ioii0o0 = Ooo0Ioii0o0.I00iio;
                            } else if (iOrdinal != i3) {
/* 211 */                       i = i3;
/* 214 */                       if (iOrdinal != 2) {
/* 219 */                           I000II.I00000oIO();
/* 222 */                           throw null;
                                }
/* 216 */                       ooo0Ioii0o0 = Ooo0Ioii0o0.I00iiO;
                            } else {
/* 223 */                       i = i3;
/* 225 */                       ooo0Ioii0o0 = Ooo0Ioii0o0.I00ilI0I1;
                            }
/* 232 */                   boolean z = oOi0O1i1lOi.I00ilO0;
/* 234 */                   if (o1I0OloI2 == null) {
/* 299 */                       I01I01Oolii.I00l0I0l0lO1(i6);
/* 302 */                       throw null;
                            }
/* 236 */                   if (ii1Ool12 == null) {
/* 295 */                       I01I01Oolii.I00l0I0l0lO1(i);
/* 298 */                       throw null;
                            }
/* 254 */                   IiOoIII iiOoIII = new IiOoIII(i4, i11IiIloOo, ii1Ool12, o1I0OloI2, oI1Iio0ii1I00000oOI, ooo0Ioii0o0, z);
/* 259 */                   iiOoIII.I00li1OI = iiOili0lOO1;
/* 261 */                   iiOoIII.I00ll1 = oOi0O1i1lOi;
/* 269 */                   I01iiIii10O i01iiIii10O = new I01iiIii10O(19);
/* 272 */                   i01iiIii10O.I00iiI = iiOoIII;
/* 274 */                   VarHandle.storeStoreFence();
/* 280 */                   iiOoIII.I00lli11 = new IiOillIi(o1I0OloI2, i01iiIii10O);
/* 282 */                   VarHandle.storeStoreFence();
/* 285 */                   linkedHashMap.put(numValueOf, iiOoIII);
/* 288 */                   i4 = i5;
/* 289 */                   i2 = i6;
/* 291 */                   i3 = i;
                        }
                    }
/* 303 */           iOiOol02.I00ioIO = linkedHashMap;
/* 305 */           VarHandle.storeStoreFence();
/* 308 */           this.I00l0I0l0lO1 = iOiOol02;
/* 315 */           this.I00l0OO0IO = new O1iiIOlO(this);
                }

                public IiOili0lOO1 I00000oIO(Ii1Ool1 ii1Ool1, List list, OI1IlOlol oI1IlOlol, Oi0Oooi oi0Oooi, OooO111lO1OI oooO111lO1OI, II0O0I00oOi iI0O0I00oOi) {
/* 7 */             Ii10lIo0l1 ii10lIo0l1 = (Ii10lIo0l1) this.I00iiI;
/* 9 */             int i = iI0O0I00oOi.I00000oOI;
/* 12 */            if ((i != 1 || iI0O0I00oOi.I0000Il00O < 4) && i <= 1) {
/* 25 */                oooO111lO1OI = (OooO111lO1OI) this.I00ilO0;
                    }
/* 42 */            return new IiOili0lOO1(ii10lIo0l1, oI1IlOlol, ii1Ool1, oi0Oooi, oooO111lO1OI, iI0O0I00oOi, (IiOlIoIo) this.I00ioIO, (IOiOol0) this.I00l0I0l0lO1, list);
                }

                @Override
                public Object I0000Il00O() {
                    switch (this.I00iOIl) {
                        case 2:
/* 138 */                   Context contextI00000oOI = ((i0O00lI) this.I00iiI).I00000oOI();
/* 146 */                   Object objI0000Il00O = ((i0IOo0i0) this.I00iiO).I0000Il00O();
/* 154 */                   Object objI0000Il00O2 = ((i0IOo0i0) this.I00iio).I0000Il00O();
/* 168 */                   i0IOo0i0 i0ioo0i0 = new i0IOo0i0(liIllOil01.I00000oIO((Oi00IilOloo0) this.I00ilI0I1));
/* 175 */                   Object objI0000Il00O3 = ((i0IOo0i0) this.I00ilO0).I0000Il00O();
/* 183 */                   Object objI0000Il00O4 = ((i0IOo0i0) this.I00io1l).I0000Il00O();
/* 197 */                   i0IOo0i0 i0ioo0i02 = new i0IOo0i0(liIllOil01.I00000oIO((i0IOo0i0) this.I00ioIO));
/* 210 */                   i0IOo0i0 i0ioo0i03 = new i0IOo0i0(liIllOil01.I00000oIO((i0IOo0i0) this.I00l0I0l0lO1));
/* 223 */                   i0O1I1o i0o1i1o = (i0O1I1o) objI0000Il00O;
/* 225 */                   i0O0oI10I i0o0oi10i = (i0O0oI10I) objI0000Il00O2;
/* 227 */                   i0O0oOiO11 i0o0ooio11 = (i0O0oOiO11) objI0000Il00O3;
/* 229 */                   i0Iooi1oi i0iooi1oi = (i0Iooi1oi) objI0000Il00O4;
/* 231 */                   i0OI1IOoili1 i0oi1iooili1 = (i0OI1IOoili1) ((i0IOo0i0) this.I00l0OO0IO).I0000Il00O();
/* 237 */                   OlOilIlol1 olOilIlol1 = new OlOilIlol1("AssetPackServiceListenerRegistry");
/* 244 */                   IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE");
/* 247 */                   i0Iii1o10 i0iii1o10 = new i0Iii1o10();
/* 255 */                   i0iii1o10.I0000O = new HashSet();
/* 258 */                   i0iii1o10.I0000oI00 = null;
/* 260 */                   i0iii1o10.I0001Ioi1lo = false;
/* 262 */                   i0iii1o10.I00000oIO = olOilIlol1;
/* 264 */                   i0iii1o10.I00000oOI = intentFilter;
/* 266 */                   Context applicationContext = contextI00000oOI.getApplicationContext();
/* 270 */                   if (applicationContext != null) {
/* 272 */                       contextI00000oOI = applicationContext;
                            }
/* 273 */                   i0iii1o10.I0000Il00O = contextI00000oOI;
/* 284 */                   i0iii1o10.I000l1 = new Handler(Looper.getMainLooper());
/* 286 */                   i0iii1o10.I000II = i0o1i1o;
/* 288 */                   i0iii1o10.I000O01llI0 = i0o0oi10i;
/* 290 */                   i0iii1o10.I000lI = i0ioo0i0;
/* 292 */                   i0iii1o10.I000OiO = i0o0ooio11;
/* 294 */                   i0iii1o10.I000OOo1O = i0iooi1oi;
/* 296 */                   i0iii1o10.I000o00OoI0I = i0ioo0i02;
/* 298 */                   i0iii1o10.I000oI1ioi = i0ioo0i03;
/* 300 */                   i0iii1o10.I000iOII = i0oi1iooili1;
/* 302 */                   VarHandle.storeStoreFence();
/* 305 */                   return i0iii1o10;
                        default:
/* 11 */                    Object objI0000Il00O5 = ((i0IOo0i0) this.I00iiI).I0000Il00O();
/* 25 */                    i0IOo0i0 i0ioo0i04 = new i0IOo0i0(liIllOil01.I00000oIO((Oi00IilOloo0) this.I00iiO));
/* 32 */                    Object objI0000Il00O6 = ((i0IOo0i0) this.I00iio).I0000Il00O();
/* 40 */                    Object objI0000Il00O7 = ((i0IOo0i0) this.I00ilI0I1).I0000Il00O();
/* 48 */                    Object objI0000Il00O8 = ((i0IOo0i0) this.I00ilO0).I0000Il00O();
/* 56 */                    Object objI0000Il00O9 = ((i0IOo0i0) this.I00io1l).I0000Il00O();
/* 64 */                    Object objI0000Il00O10 = ((i0IOo0i0) this.I00ioIO).I0000Il00O();
/* 72 */                    Object objI0000Il00O11 = ((i0IOo0i0) this.I00l0I0l0lO1).I0000Il00O();
/* 100 */                   i0O1O1I i0o1o1i = (i0O1O1I) ((i0IOo0i0) this.I00l0OO0IO).I0000Il00O();
/* 102 */                   i0O0oI10I i0o0oi10i2 = new i0O0oI10I();
/* 105 */                   i0o0oi10i2.I00000oIO = (i0O1I1o) objI0000Il00O5;
/* 107 */                   i0o0oi10i2.I000OiO = i0ioo0i04;
/* 109 */                   i0o0oi10i2.I00000oOI = (i0O0I111OoII) objI0000Il00O6;
/* 111 */                   i0o0oi10i2.I0000Il00O = (i0OIlO) objI0000Il00O7;
/* 113 */                   i0o0oi10i2.I0000O = (i0O1l1o1O) objI0000Il00O8;
/* 115 */                   i0o0oi10i2.I0000oI00 = (i0O1oI1l0l) objI0000Il00O9;
/* 117 */                   i0o0oi10i2.I0001Ioi1lo = (i0OIIIll) objI0000Il00O10;
/* 119 */                   i0o0oi10i2.I000II = (i0OIOOi00) objI0000Il00O11;
/* 121 */                   i0o0oi10i2.I000O01llI0 = i0o1o1i;
/* 128 */                   i0o0oi10i2.I000OOo1O = new AtomicBoolean(false);
/* 130 */                   VarHandle.storeStoreFence();
/* 133 */                   return i0o0oi10i2;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:115:0x049e  */
                /* JADX WARN: Removed duplicated region for block: B:148:0x0476 A[SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void I0000O(I1lO11 i1lO11, int i) {
                    byte[] bArr;
                    OiIIilol0iO oiIIilol0iO;
                    OoIOiIl10ioo ooIOiIl10ioo;
                    long j;
                    Iterable iterable;
                    I1ill0OOl0 i1ill0OOl0;
                    String str;
                    int i2;
                    IIo0IiiO iIo0IiiOI0000oI00;
                    String str2;
                    Integer numValueOf;
                    I1ioi0IooiO0 i1ioi0IooiO0;
                    String str3;
                    Iterator it;
                    Integer num;
                    IOiOol0 iOiOol0;
                    int i3;
/* 1 */             IiOili0lOO1 iiOili0lOO1 = this;
/* 3 */             I1lO11 i1lO112 = i1lO11;
/* 5 */             byte[] bArr2 = i1lO112.I00000oOI;
/* 10 */            OiIIilol0iO oiIIilol0iO2 = (OiIIilol0iO) iiOili0lOO1.I00io1l;
/* 18 */            OoIOiIl10ioo ooIOiIl10iooI00000oIO = ((O1lOoiIIliiI) iiOili0lOO1.I00iiO).I00000oIO(i1lO112.I00000oIO);
/* 22 */            long jMax = 0;
                    while (true) {
/* 27 */                Ool0Ii1iloO ool0Ii1iloO = new Ool0Ii1iloO(0);
/* 30 */                ool0Ii1iloO.I00iiI = iiOili0lOO1;
/* 32 */                ool0Ii1iloO.I00iiO = i1lO112;
/* 34 */                VarHandle.storeStoreFence();
/* 47 */                if (!((Boolean) oiIIilol0iO2.I00100l0(ool0Ii1iloO)).booleanValue()) {
/* 1335 */                  OiIIIol oiIIIol = new OiIIIol();
/* 1338 */                  oiIIIol.I00iiI = iiOili0lOO1;
/* 1340 */                  oiIIIol.I00iiO = i1lO112;
/* 1342 */                  oiIIIol.I00iOIl = jMax;
/* 1344 */                  VarHandle.storeStoreFence();
/* 1347 */                  oiIIilol0iO2.I00100l0(oiIIIol);
/* 2988 */                  return;
                        }
/* 51 */                int i4 = 1;
/* 52 */                Ool0Ii1iloO ool0Ii1iloO2 = new Ool0Ii1iloO(i4);
/* 55 */                ool0Ii1iloO2.I00iiI = iiOili0lOO1;
/* 57 */                ool0Ii1iloO2.I00iiO = i1lO112;
/* 59 */                VarHandle.storeStoreFence();
/* 67 */                Iterable iterable2 = (Iterable) oiIIilol0iO2.I00100l0(ool0Ii1iloO2);
/* 77 */                if (!iterable2.iterator().hasNext()) {
/* 79 */                    return;
                        }
/* 80 */                int i5 = 2;
/* 84 */                if (ooIOiIl10iooI00000oIO == null) {
/* 90 */                    l11I1i.I00000oIO("Uploader", "Unknown backend for %s, deleting event batch for it...", i1lO112);
/* 95 */                    i1ill0OOl0 = new I1ill0OOl0(3, -1L);
/* 98 */                    bArr = bArr2;
/* 100 */                   oiIIilol0iO = oiIIilol0iO2;
/* 102 */                   ooIOiIl10ioo = ooIOiIl10iooI00000oIO;
/* 104 */                   j = jMax;
/* 106 */                   iterable = iterable2;
/* 108 */                   i2 = 2;
                        } else {
/* 113 */                   ArrayList arrayList = new ArrayList();
/* 116 */                   Iterator it2 = iterable2.iterator();
/* 124 */                   while (it2.hasNext()) {
/* 136 */                       arrayList.add(((I1lI0I0i1) it2.next()).I0000Il00O);
                            }
/* 140 */                   String str4 = "proto";
/* 142 */                   if (bArr2 != null) {
/* 146 */                       OiIIilol0iO oiIIilol0iO3 = (OiIIilol0iO) iiOili0lOO1.I00l0OO0IO;
/* 148 */                       Objects.requireNonNull(oiIIilol0iO3);
/* 153 */                       OiIIOl oiIIOl = new OiIIOl(i4);
/* 156 */                       oiIIOl.I00iiI = oiIIilol0iO3;
/* 158 */                       VarHandle.storeStoreFence();
/* 165 */                       IOIololliO iOIololliO = (IOIololliO) oiIIilol0iO2.I00100l0(oiIIOl);
/* 169 */                       I0Oi111ii i0Oi111ii = new I0Oi111ii(i5);
/* 177 */                       i0Oi111ii.I00io1l = new HashMap();
/* 191 */                       i0Oi111ii.I00ilI0I1 = Long.valueOf(((IOO0l0i0Oo) iiOili0lOO1.I00ioIO).I0001Ioi1lo());
/* 205 */                       i0Oi111ii.I00ilO0 = Long.valueOf(((IOO0l0i0Oo) iiOili0lOO1.I00l0I0l0lO1).I0001Ioi1lo());
/* 209 */                       i0Oi111ii.I00iiI = "GDT_CLIENT_METRICS";
/* 213 */                       Il0IIil il0IIilI00000oIO = Il0IIil.I00000oIO("proto");
/* 217 */                       iOIololliO.getClass();
/* 220 */                       OOiI0liIo1ii oOiI0liIo1ii = OOi1IIii1.I00000oIO;
/* 222 */                       oOiI0liIo1ii.getClass();
/* 227 */                       ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
/* 230 */                           oOiI0liIo1ii.I00000oIO(iOIololliO, byteArrayOutputStream);
                                } catch (IOException unused) {
                                }
/* 240 */                       i0Oi111ii.I00iio = new Il01oOi(il0IIilI00000oIO, byteArrayOutputStream.toByteArray());
/* 253 */                       arrayList.add(((IO0ll11OOI) ooIOiIl10iooI00000oIO).I00000oIO(i0Oi111ii.I000lI()));
                            }
/* 257 */                   IO0ll11OOI iO0ll11OOI = (IO0ll11OOI) ooIOiIl10iooI00000oIO;
/* 261 */                   HashMap map = new HashMap();
/* 264 */                   Iterator it3 = arrayList.iterator();
/* 272 */                   while (it3.hasNext()) {
/* 278 */                       I1l0Ioi01 i1l0Ioi01 = (I1l0Ioi01) it3.next();
/* 280 */                       String str5 = i1l0Ioi01.I00000oIO;
/* 286 */                       if (map.containsKey(str5)) {
/* 306 */                           ((List) map.get(str5)).add(i1l0Ioi01);
                                } else {
/* 290 */                           ArrayList arrayList2 = new ArrayList();
/* 293 */                           arrayList2.add(i1l0Ioi01);
/* 296 */                           map.put(str5, arrayList2);
                                }
                            }
/* 312 */                   ArrayList arrayList3 = new ArrayList();
/* 319 */                   Iterator it4 = map.entrySet().iterator();
/* 329 */                   while (it4.hasNext()) {
/* 335 */                       Map.Entry entry = (Map.Entry) it4.next();
/* 350 */                       I1l0Ioi01 i1l0Ioi012 = (I1l0Ioi01) ((List) entry.getValue()).get(0);
/* 352 */                       OOiiiloIIil0 oOiiiloIIil0 = OOiiiloIIil0.I00iOIl;
/* 358 */                       long jI0001Ioi1lo = iO0ll11OOI.I0001Ioi1lo.I0001Ioi1lo();
/* 362 */                       byte[] bArr3 = bArr2;
/* 366 */                       OiIIilol0iO oiIIilol0iO4 = oiIIilol0iO2;
/* 368 */                       long jI0001Ioi1lo2 = iO0ll11OOI.I0000oI00.I0001Ioi1lo();
/* 372 */                       OoIOiIl10ioo ooIOiIl10ioo2 = ooIOiIl10iooI00000oIO;
/* 380 */                       Integer numValueOf2 = Integer.valueOf(i1l0Ioi012.I00000oOI("sdk-version"));
/* 384 */                       Iterator it5 = it4;
/* 388 */                       String strI00000oIO = i1l0Ioi012.I00000oIO("model");
/* 392 */                       String str6 = str4;
/* 396 */                       String strI00000oIO2 = i1l0Ioi012.I00000oIO("hardware");
/* 400 */                       long j2 = jMax;
/* 404 */                       String strI00000oIO3 = i1l0Ioi012.I00000oIO("device");
/* 410 */                       String strI00000oIO4 = i1l0Ioi012.I00000oIO("product");
/* 416 */                       String strI00000oIO5 = i1l0Ioi012.I00000oIO("os-uild");
/* 420 */                       Iterable iterable3 = iterable2;
/* 424 */                       String strI00000oIO6 = i1l0Ioi012.I00000oIO("manufacturer");
/* 430 */                       String strI00000oIO7 = i1l0Ioi012.I00000oIO("fingerprint");
/* 434 */                       IO0ll11OOI iO0ll11OOI2 = iO0ll11OOI;
/* 438 */                       String strI00000oIO8 = i1l0Ioi012.I00000oIO("country");
/* 442 */                       ArrayList arrayList4 = arrayList3;
/* 446 */                       String strI00000oIO9 = i1l0Ioi012.I00000oIO("locale");
/* 454 */                       String strI00000oIO10 = i1l0Ioi012.I00000oIO("mcc_mnc");
/* 460 */                       String strI00000oIO11 = i1l0Ioi012.I00000oIO("application_build");
/* 466 */                       I1ilii0 i1ilii0 = new I1ilii0();
/* 469 */                       i1ilii0.I00000oIO = numValueOf2;
/* 471 */                       i1ilii0.I00000oOI = strI00000oIO;
/* 473 */                       i1ilii0.I0000Il00O = strI00000oIO2;
/* 475 */                       i1ilii0.I0000O = strI00000oIO3;
/* 477 */                       i1ilii0.I0000oI00 = strI00000oIO4;
/* 479 */                       i1ilii0.I0001Ioi1lo = strI00000oIO5;
/* 481 */                       i1ilii0.I000II = strI00000oIO6;
/* 483 */                       i1ilii0.I000O01llI0 = strI00000oIO7;
/* 485 */                       i1ilii0.I000OOo1O = strI00000oIO9;
/* 487 */                       i1ilii0.I000OiO = strI00000oIO8;
/* 489 */                       i1ilii0.I000iOII = strI00000oIO10;
/* 491 */                       i1ilii0.I000l1 = strI00000oIO11;
/* 493 */                       VarHandle.storeStoreFence();
/* 498 */                       I1ioi0IooiO0 i1ioi0IooiO02 = new I1ioi0IooiO0();
/* 501 */                       i1ioi0IooiO02.I00000oIO = i1ilii0;
/* 503 */                       VarHandle.storeStoreFence();
                                try {
/* 516 */                           numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
/* 521 */                           str2 = null;
                                } catch (NumberFormatException unused2) {
/* 527 */                           str2 = (String) entry.getKey();
/* 529 */                           numValueOf = null;
                                }
/* 532 */                       ArrayList arrayList5 = new ArrayList();
/* 541 */                       Iterator it6 = ((List) entry.getValue()).iterator();
/* 549 */                       while (it6.hasNext()) {
/* 555 */                           I1l0Ioi01 i1l0Ioi013 = (I1l0Ioi01) it6.next();
/* 557 */                           Il01oOi il01oOi = i1l0Ioi013.I0000Il00O;
/* 559 */                           Il0IIil il0IIil = il01oOi.I00000oIO;
/* 561 */                           byte[] bArr4 = il01oOi.I00000oOI;
/* 571 */                           if (il0IIil.equals(Il0IIil.I00000oIO(str6))) {
/* 576 */                               iOiOol0 = new IOiOol0(2);
/* 579 */                               iOiOol0.I00ilI0I1 = bArr4;
                                    } else if (il0IIil.equals(Il0IIil.I00000oIO("json"))) {
/* 602 */                               String str7 = new String(bArr4, Charset.forName("UTF-8"));
/* 608 */                               IOiOol0 iOiOol02 = new IOiOol0(2);
/* 611 */                               iOiOol02.I00ilO0 = str7;
/* 613 */                               iOiOol0 = iOiOol02;
                                    } else {
/* 842 */                               i1ioi0IooiO0 = i1ioi0IooiO02;
/* 844 */                               str3 = str2;
/* 846 */                               it = it6;
/* 848 */                               num = numValueOf;
/* 852 */                               String strConcat = "TRuntime.".concat("CctTransportBackend");
/* 861 */                               if (Log.isLoggable(strConcat, 5)) {
/* 882 */                                   Log.w(strConcat, "Received event of unsupported encoding " + il0IIil + ". Skipping...");
                                        }
/* 822 */                               it6 = it;
/* 824 */                               numValueOf = num;
/* 826 */                               i1ioi0IooiO02 = i1ioi0IooiO0;
/* 828 */                               str2 = str3;
                                    }
/* 620 */                           iOiOol0.I00iiI = Long.valueOf(i1l0Ioi013.I0000O);
/* 628 */                           iOiOol0.I00iio = Long.valueOf(i1l0Ioi013.I0000oI00);
/* 638 */                           String str8 = (String) i1l0Ioi013.I0001Ioi1lo.get("tz-offset");
/* 657 */                           iOiOol0.I00io1l = Long.valueOf(str8 == null ? 0L : Long.valueOf(str8).longValue());
/* 671 */                           OIIO0Iilo1O0 oIIO0Iilo1O0 = (OIIO0Iilo1O0) OIIO0Iilo1O0.I00iOIl.get(i1l0Ioi013.I00000oOI("net-type"));
/* 685 */                           OIIO00i1 oIIO00i1 = (OIIO00i1) OIIO00i1.I00iOIl.get(i1l0Ioi013.I00000oOI("mobile-subtype"));
/* 689 */                           I1l1l10IOiI i1l1l10IOiI = new I1l1l10IOiI();
/* 692 */                           i1l1l10IOiI.I00000oIO = oIIO0Iilo1O0;
/* 694 */                           i1l1l10IOiI.I00000oOI = oIIO00i1;
/* 696 */                           VarHandle.storeStoreFence();
/* 699 */                           iOiOol0.I00ioIO = i1l1l10IOiI;
/* 701 */                           Integer num2 = i1l0Ioi013.I00000oOI;
/* 703 */                           if (num2 != null) {
/* 705 */                               iOiOol0.I00iiO = num2;
                                    }
/* 716 */                           String strConcat2 = ((Long) iOiOol0.I00iiI) == null ? " eventTimeMs" : "";
/* 722 */                           if (((Long) iOiOol0.I00iio) == null) {
/* 726 */                               strConcat2 = strConcat2.concat(" eventUptimeMs");
                                    }
/* 734 */                           if (((Long) iOiOol0.I00io1l) == null) {
/* 738 */                               strConcat2 = strConcat2.concat(" timezoneOffsetSeconds");
                                    }
/* 746 */                           if (!strConcat2.isEmpty()) {
/* 838 */                               I000II.I001IO000("Missing required properties:".concat(strConcat2));
/* 841 */                               return;
                                    }
/* 754 */                           long jLongValue = ((Long) iOiOol0.I00iiI).longValue();
/* 760 */                           Integer num3 = (Integer) iOiOol0.I00iiO;
/* 766 */                           Integer num4 = numValueOf;
/* 767 */                           long jLongValue2 = ((Long) iOiOol0.I00iio).longValue();
/* 773 */                           byte[] bArr5 = (byte[]) iOiOol0.I00ilI0I1;
/* 775 */                           it = it6;
/* 779 */                           String str9 = (String) iOiOol0.I00ilO0;
/* 781 */                           num = num4;
/* 787 */                           i1ioi0IooiO0 = i1ioi0IooiO02;
/* 789 */                           str3 = str2;
/* 791 */                           long jLongValue3 = ((Long) iOiOol0.I00io1l).longValue();
/* 797 */                           I1l1l10IOiI i1l1l10IOiI2 = (I1l1l10IOiI) iOiOol0.I00ioIO;
/* 799 */                           I1l10O i1l10O = new I1l10O();
/* 802 */                           i1l10O.I00000oIO = jLongValue;
/* 804 */                           i1l10O.I00000oOI = num3;
/* 806 */                           i1l10O.I0000Il00O = jLongValue2;
/* 808 */                           i1l10O.I0000O = bArr5;
/* 810 */                           i1l10O.I0000oI00 = str9;
/* 812 */                           i1l10O.I0001Ioi1lo = jLongValue3;
/* 814 */                           i1l10O.I000II = i1l1l10IOiI2;
/* 816 */                           VarHandle.storeStoreFence();
/* 819 */                           arrayList5.add(i1l10O);
/* 822 */                           it6 = it;
/* 824 */                           numValueOf = num;
/* 826 */                           i1ioi0IooiO02 = i1ioi0IooiO0;
/* 828 */                           str2 = str3;
                                }
/* 886 */                       I1ioi0IooiO0 i1ioi0IooiO03 = i1ioi0IooiO02;
/* 894 */                       I1l11OoIO i1l11OoIO = new I1l11OoIO();
/* 897 */                       i1l11OoIO.I00000oIO = jI0001Ioi1lo;
/* 901 */                       i1l11OoIO.I00000oOI = jI0001Ioi1lo2;
/* 905 */                       i1l11OoIO.I0000Il00O = i1ioi0IooiO03;
/* 909 */                       i1l11OoIO.I0000O = numValueOf;
/* 913 */                       i1l11OoIO.I0000oI00 = str2;
/* 915 */                       i1l11OoIO.I0001Ioi1lo = arrayList5;
/* 917 */                       VarHandle.storeStoreFence();
/* 922 */                       arrayList4.add(i1l11OoIO);
/* 927 */                       arrayList3 = arrayList4;
/* 928 */                       bArr2 = bArr3;
/* 930 */                       oiIIilol0iO2 = oiIIilol0iO4;
/* 932 */                       ooIOiIl10iooI00000oIO = ooIOiIl10ioo2;
/* 934 */                       it4 = it5;
/* 936 */                       str4 = str6;
/* 938 */                       jMax = j2;
/* 940 */                       iterable2 = iterable3;
/* 942 */                       iO0ll11OOI = iO0ll11OOI2;
                            }
/* 948 */                   ArrayList arrayList6 = arrayList3;
/* 949 */                   bArr = bArr2;
/* 951 */                   oiIIilol0iO = oiIIilol0iO2;
/* 953 */                   ooIOiIl10ioo = ooIOiIl10iooI00000oIO;
/* 955 */                   IO0ll11OOI iO0ll11OOI3 = iO0ll11OOI;
/* 957 */                   j = jMax;
/* 959 */                   iterable = iterable2;
/* 964 */                   I1illOi0o i1illOi0o = new I1illOi0o();
/* 967 */                   i1illOi0o.I00000oIO = arrayList6;
/* 969 */                   VarHandle.storeStoreFence();
/* 974 */                   URL urlI00000oOI = iO0ll11OOI3.I0000O;
/* 976 */                   if (bArr != null) {
                                try {
/* 978 */                           IIOO01 iioo01I00000oIO = IIOO01.I00000oIO(bArr);
/* 982 */                           str = iioo01I00000oIO.I00000oOI;
/* 984 */                           if (str == null) {
/* 987 */                               str = null;
                                    }
/* 990 */                           urlI00000oOI = IO0ll11OOI.I00000oOI(iioo01I00000oIO.I00000oIO);
                                } catch (IllegalArgumentException unused3) {
/* 1000 */                          i1ill0OOl0 = new I1ill0OOl0(3, -1L);
                                }
                            } else {
/* 1006 */                      str = null;
                            }
                            try {
/* 1009 */                      int i6 = 8;
/* 1011 */                      IoIlOo1o0IIl ioIlOo1o0IIl = new IoIlOo1o0IIl(urlI00000oOI, i1illOi0o, str, i6);
/* 1017 */                      I0IOIlIOIII i0IOIlIOIII = new I0IOIlIOIII(4);
/* 1020 */                      i0IOIlIOIII.I00iiI = iO0ll11OOI3;
/* 1022 */                      VarHandle.storeStoreFence();
/* 1025 */                      int i7 = 5;
/* 1062 */                      do {
/* 1026 */                          iIo0IiiOI0000oI00 = i0IOIlIOIII.I0000oI00(ioIlOo1o0IIl);
/* 1032 */                          URL url = (URL) iIo0IiiOI0000oI00.I0000Il00O;
/* 1034 */                          if (url != null) {
/* 1038 */                              l11I1i.I00000oIO("CctTransportBackend", "Following redirect to: %s", url);
/* 1051 */                              ioIlOo1o0IIl = new IoIlOo1o0IIl(url, (I1illOi0o) ioIlOo1o0IIl.I00iiO, (String) ioIlOo1o0IIl.I00iio, i6);
                                    } else {
/* 1056 */                              ioIlOo1o0IIl = null;
                                    }
/* 1057 */                          if (ioIlOo1o0IIl == null) {
                                        break;
                                    } else {
                                        i7--;
                                    }
/* 1062 */                      } while (i7 >= 1);
/* 1064 */                      int i8 = iIo0IiiOI0000oI00.I00000oIO;
/* 1068 */                      if (i8 == 200) {
/* 1075 */                          i1ill0OOl0 = new I1ill0OOl0(1, iIo0IiiOI0000oI00.I00000oOI);
                                } else if (i8 >= 500 || i8 == 404) {
/* 1122 */                          i1ill0OOl0 = new I1ill0OOl0(2, -1L);
                                } else if (i8 == 400) {
                                    try {
/* 1102 */                              i1ill0OOl0 = new I1ill0OOl0(4, -1L);
                                    } catch (IOException e) {
/* 1106 */                              e = e;
/* 1128 */                              l11I1i.I00000oOI("CctTransportBackend", "Could not make request to the backend", e);
/* 1135 */                              i2 = 2;
/* 1136 */                              i1ill0OOl0 = new I1ill0OOl0(2, -1L);
/* 1139 */                              i3 = i1ill0OOl0.I00000oIO;
/* 1141 */                              if (i3 != i2) {
                                        }
                                    }
                                } else {
/* 1115 */                          i1ill0OOl0 = new I1ill0OOl0(3, -1L);
                                }
/* 1003 */                      i2 = 2;
                            } catch (IOException e2) {
/* 1080 */                      e = e2;
                            }
                        }
/* 1139 */              i3 = i1ill0OOl0.I00000oIO;
/* 1141 */              if (i3 != i2) {
/* 1145 */                  IiIl0OOl1O iiIl0OOl1O = new IiIl0OOl1O(i2);
/* 1150 */                  iiIl0OOl1O.I00iiI = this;
/* 1154 */                  iiIl0OOl1O.I00ilI0I1 = iterable;
/* 1158 */                  iiIl0OOl1O.I00iio = i1lO11;
/* 1162 */                  iiIl0OOl1O.I00iiO = j;
/* 1164 */                  VarHandle.storeStoreFence();
/* 1169 */                  oiIIilol0iO.I00100l0(iiIl0OOl1O);
/* 1179 */                  ((IOO000ilo) this.I00ilI0I1).I00II0Ol1O0l(i1lO11, i + 1, true);
/* 1182 */                  return;
                        }
/* 1187 */              OiIIilol0iO oiIIilol0iO5 = oiIIilol0iO;
/* 1189 */              long j3 = j;
/* 1191 */              Iterable iterable4 = iterable;
/* 1198 */              IIoIil iIoIil = new IIoIil(21);
/* 1201 */              iIoIil.I00iiI = this;
/* 1203 */              iIoIil.I00iiO = iterable4;
/* 1205 */              VarHandle.storeStoreFence();
/* 1208 */              oiIIilol0iO5.I00100l0(iIoIil);
/* 1211 */              if (i3 == 1) {
/* 1215 */                  jMax = Math.max(j3, i1ill0OOl0.I00000oOI);
/* 1219 */                  if (bArr != null) {
/* 1224 */                      Olio1i0OI00i olio1i0OI00i = new Olio1i0OI00i(3);
/* 1227 */                      olio1i0OI00i.I00iiI = this;
/* 1229 */                      VarHandle.storeStoreFence();
/* 1232 */                      oiIIilol0iO5.I00100l0(olio1i0OI00i);
                            }
                        } else {
/* 1237 */                  if (i3 == 4) {
/* 1241 */                      HashMap map2 = new HashMap();
/* 1244 */                      Iterator it7 = iterable4.iterator();
/* 1252 */                      while (it7.hasNext()) {
/* 1262 */                          String str10 = ((I1lI0I0i1) it7.next()).I0000Il00O.I00000oIO;
/* 1268 */                          if (map2.containsKey(str10)) {
/* 1298 */                              map2.put(str10, Integer.valueOf(((Integer) map2.get(str10)).intValue() + 1));
                                    } else {
/* 1276 */                              map2.put(str10, 1);
                                    }
                                }
/* 1306 */                      IIoIil iIoIil2 = new IIoIil(22);
/* 1309 */                      iIoIil2.I00iiI = this;
/* 1311 */                      iIoIil2.I00iiO = map2;
/* 1313 */                      VarHandle.storeStoreFence();
/* 1316 */                      oiIIilol0iO5.I00100l0(iIoIil2);
                            }
/* 1319 */                  jMax = j3;
                        }
/* 1320 */              iiOili0lOO1 = this;
/* 1321 */              i1lO112 = i1lO11;
/* 1322 */              oiIIilol0iO2 = oiIIilol0iO5;
/* 1323 */              bArr2 = bArr;
/* 1325 */              ooIOiIl10iooI00000oIO = ooIOiIl10ioo;
                    }
                }

/* 317 */       public IiOili0lOO1(int i) {
/* 318 */           this.I00iOIl = i;
                }
            }
