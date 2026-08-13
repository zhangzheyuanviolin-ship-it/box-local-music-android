            package p000;

            import android.content.ContentValues;
            import android.content.Context;
            import android.content.res.Resources;
            import android.database.SQLException;
            import android.database.sqlite.SQLiteException;
            import android.os.Bundle;
            import android.os.RemoteException;
            import android.os.SystemClock;
            import android.util.Log;
            import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicReference;
            import java.util.logging.Level;
            
            public final class IO0iIlI1li implements Runnable {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;

                public IO0iIlI1li(int i) {
/* 1 */             this.I00iOIl = i;
                }

                private final void I00000oIO() {
                    try {
                        try {
/* 11 */                    O10oI0l1 o10oI0l1 = (O10oI0l1) ((Oll0oO) this.I00iiI).I00iiI.get();
/* 15 */                    OIoo1iiOO1II oIoo1iiOO1II = new OIoo1iiOO1II();
/* 18 */                    oIoo1iiOO1II.I00iOIl = o10oI0l1;
/* 20 */                    VarHandle.storeStoreFence();
/* 31 */                    O10lo0O.I00000oOI((IoOlo1llOO) this.I00iiO, l1oOOloO0.I00000oIO(oIoo1iiOO1II));
                            synchronized (O10oOIoI0.I00100l0) {
/* 47 */                        ((O10oOIoI0) this.I00ilI0I1).I000lI.remove((String) this.I00iio);
/* 60 */                        ((O10oOIoI0) this.I00ilI0I1).I000o00OoI0I.remove((String) this.I00iio);
                            }
                        } catch (InterruptedException | ExecutionException e) {
/* 128 */                   O10lo0O.I00000oIO((IoOlo1llOO) this.I00iiO, e);
                            synchronized (O10oOIoI0.I00100l0) {
/* 144 */                       ((O10oOIoI0) this.I00ilI0I1).I000lI.remove((String) this.I00iio);
/* 157 */                       ((O10oOIoI0) this.I00ilI0I1).I000o00OoI0I.remove((String) this.I00iio);
                            }
                        } catch (CancellationException e2) {
/* 74 */                    IIi0oIl iIi0oIlI000II = IIi0oIl.I000II();
/* 78 */                    byte[] bArr = O10oOIoI0.I000oI1ioi;
/* 80 */                    iIi0oIlI000II.getClass();
/* 87 */                    O10lo0O.I00000oIO((IoOlo1llOO) this.I00iiO, e2);
                            synchronized (O10oOIoI0.I00100l0) {
/* 103 */                       ((O10oOIoI0) this.I00ilI0I1).I000lI.remove((String) this.I00iio);
/* 116 */                       ((O10oOIoI0) this.I00ilI0I1).I000o00OoI0I.remove((String) this.I00iio);
                            }
                        }
                    } catch (Throwable th) {
                        synchronized (O10oOIoI0.I00100l0) {
/* 178 */                   ((O10oOIoI0) this.I00ilI0I1).I000lI.remove((String) this.I00iio);
/* 191 */                   ((O10oOIoI0) this.I00ilI0I1).I000o00OoI0I.remove((String) this.I00iio);
/* 195 */                   throw th;
                        }
                    }
                }

                private final void I00000oOI() {
                    lIil0l010OO liil0l010ooI001iOo1i0O;
/* 3 */             iOllO10O iollo10o = (iOllO10O) this.I00iiI;
/* 7 */             iOllI01II iolli01ii = (iOllI01II) this.I00iiO;
/* 11 */            iOIo11i ioio11i = (iOIo11i) this.I00iio;
/* 15 */            String str = (String) this.I00ilI0I1;
/* 17 */            iolli01ii.I00000oOI(ioio11i);
/* 20 */            String strZzc = iolli01ii.zzc();
/* 26 */            OOoo1il oOoo1il = new OOoo1il();
/* 31 */            oOoo1il.I00000oIO = iollo10o.I00000oIO;
/* 35 */            oOoo1il.I00000oOI = iollo10o.I00000oOI;
                    synchronized (iOllO10O.class) {
                        try {
/* 40 */                    liil0l010ooI001iOo1i0O = iOllO10O.I000OOo1O;
/* 42 */                    if (liil0l010ooI001iOo1i0O == null) {
/* 54 */                        O11oilI o11oilII00000oIO = iio00I0oi.I00000oIO(Resources.getSystem().getConfiguration());
/* 59 */                        Object[] objArrCopyOf = new Object[4];
/* 61 */                        int i = 0;
/* 62 */                        int i2 = 0;
/* 67 */                        while (i < o11oilII00000oIO.I00000oOI()) {
/* 69 */                            Locale localeI00000oIO = o11oilII00000oIO.I00000oIO(i);
/* 73 */                            Io0Ool io0Ool = IOi0li0I0.I00000oIO;
/* 75 */                            String languageTag = localeI00000oIO.toLanguageTag();
/* 79 */                            languageTag.getClass();
/* 82 */                            int i3 = i2 + 1;
/* 84 */                            int length = objArrCopyOf.length;
/* 85 */                            if (length < i3) {
/* 90 */                                int i4 = length + (length >> 1) + 1;
/* 92 */                                if (i4 < i3) {
/* 94 */                                    int iHighestOneBit = Integer.highestOneBit(i2);
/* 98 */                                    i4 = iHighestOneBit + iHighestOneBit;
                                        }
/* 99 */                                if (i4 < 0) {
/* 101 */                                   i4 = Integer.MAX_VALUE;
                                        }
/* 104 */                               objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                                    }
/* 108 */                           objArrCopyOf[i2] = languageTag;
/* 110 */                           i++;
/* 112 */                           i2 = i3;
                                }
/* 116 */                       liil0l010ooI001iOo1i0O = lIOiOOl.I001iOo1i0O(i2, objArrCopyOf);
/* 120 */                       iOllO10O.I000OOo1O = liil0l010ooI001iOo1i0O;
                            }
                        } catch (Throwable th) {
/* 245 */                   throw th;
                        }
                    }
/* 123 */           oOoo1il.I0000oI00 = liil0l010ooI001iOo1i0O;
/* 127 */           oOoo1il.I000O01llI0 = Boolean.TRUE;
/* 129 */           oOoo1il.I0000O = strZzc;
/* 131 */           oOoo1il.I0000Il00O = str;
/* 156 */           oOoo1il.I0001Ioi1lo = iollo10o.I0001Ioi1lo.I000OOo1O() ? (String) iollo10o.I0001Ioi1lo.I000II() : iollo10o.I0000O.getMlSdkInstanceId();
/* 164 */           oOoo1il.I000OiO = 10;
/* 172 */           oOoo1il.I000iOII = Integer.valueOf(iollo10o.I000O01llI0);
/* 174 */           iolli01ii.I00000oIO(oOoo1il);
/* 179 */           iollo10o.I0000Il00O.I00000oIO(iolli01ii);
                }

                /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private final void I0000Il00O() {
                    String str;
                    loll11I loll11i;
/* 3 */             lOI00Ii101I0 loi00ii101i0 = (lOI00Ii101I0) this.I00iiI;
/* 7 */             OoIOol ooIOol = (OoIOol) this.I00iiO;
/* 11 */            l1Iii1 l1iii1 = (l1Iii1) this.I00iio;
/* 15 */            String str2 = (String) this.I00ilI0I1;
/* 19 */            l1Il1IliOI1l l1il1ilioi1l = (l1Il1IliOI1l) ooIOol.I00iiI;
/* 21 */            l1il1ilioi1l.I00iiI = l1iii1;
/* 27 */            lIi00i lii00i = l1il1ilioi1l.I000II().I00000oIO;
/* 29 */            if (lii00i != null) {
/* 31 */                str = lii00i.I0000O;
/* 33 */                int i = iliOIlIO1iOl.I00000oIO;
/* 35 */                if (str == null || str.isEmpty()) {
/* 43 */                    str = "NA";
                        }
                    }
/* 48 */            IIlOoolol0ll iIlOoolol0ll = new IIlOoolol0ll(5);
/* 53 */            iIlOoolol0ll.I00iiI = loi00ii101i0.I00000oIO;
/* 57 */            iIlOoolol0ll.I00iiO = loi00ii101i0.I00000oOI;
                    synchronized (lOI00Ii101I0.class) {
                        try {
/* 62 */                    loll11i = lOI00Ii101I0.I000OiO;
/* 64 */                    if (loll11i == null) {
/* 76 */                        O11oilI o11oilII00000oIO = iio00I0oi.I00000oIO(Resources.getSystem().getConfiguration());
/* 81 */                        Object[] objArrCopyOf = new Object[4];
/* 83 */                        int i2 = 0;
/* 84 */                        int i3 = 0;
/* 89 */                        while (i2 < o11oilII00000oIO.I00000oOI()) {
/* 91 */                            Locale localeI00000oIO = o11oilII00000oIO.I00000oIO(i2);
/* 95 */                            Io0Ool io0Ool = IOi0li0I0.I00000oIO;
/* 97 */                            String languageTag = localeI00000oIO.toLanguageTag();
/* 101 */                           languageTag.getClass();
/* 104 */                           int i4 = i3 + 1;
/* 106 */                           int length = objArrCopyOf.length;
/* 107 */                           if (length < i4) {
/* 112 */                               int i5 = length + (length >> 1) + 1;
/* 114 */                               if (i5 < i4) {
/* 116 */                                   int iHighestOneBit = Integer.highestOneBit(i3);
/* 120 */                                   i5 = iHighestOneBit + iHighestOneBit;
                                        }
/* 121 */                               if (i5 < 0) {
/* 123 */                                   i5 = Integer.MAX_VALUE;
                                        }
/* 126 */                               objArrCopyOf = Arrays.copyOf(objArrCopyOf, i5);
                                    }
/* 130 */                           objArrCopyOf[i3] = languageTag;
/* 132 */                           i2++;
/* 134 */                           i3 = i4;
                                }
/* 138 */                       lOi1lolo loi1lolo = liiOlOO01i.I00ilI0I1;
/* 147 */                       loll11i = i3 == 0 ? loll11I.I00ioIO : new loll11I(objArrCopyOf, i3);
/* 150 */                       lOI00Ii101I0.I000OiO = loll11i;
                            }
                        } catch (Throwable th) {
/* 245 */                   throw th;
                        }
                    }
/* 153 */           iIlOoolol0ll.I00ilO0 = loll11i;
/* 157 */           iIlOoolol0ll.I00ioIO = Boolean.TRUE;
/* 159 */           iIlOoolol0ll.I00ilI0I1 = str;
/* 161 */           iIlOoolol0ll.I00iio = str2;
/* 186 */           iIlOoolol0ll.I00io1l = loi00ii101i0.I0001Ioi1lo.I000OOo1O() ? (String) loi00ii101i0.I0001Ioi1lo.I000II() : loi00ii101i0.I0000O.getMlSdkInstanceId();
/* 194 */           iIlOoolol0ll.I00l0OO0IO = 10;
/* 202 */           iIlOoolol0ll.I00li1OI = Integer.valueOf(loi00ii101i0.I000O01llI0);
/* 204 */           ooIOol.I00iiO = iIlOoolol0ll;
/* 208 */           loi00ii101i0.I0000Il00O.I00000oIO(ooIOol);
                }

                private final void I0000O() {
                    iolll0ill1i iolll0ill1iVar;
/* 3 */             lOliOlO1Io loliolo1io = (lOliOlO1Io) this.I00iiI;
/* 7 */             AtomicReference atomicReference = (AtomicReference) this.I00iiO;
/* 11 */            lli10iI lli10ii = (lli10iI) this.I00iio;
/* 15 */            Bundle bundle = (Bundle) this.I00ilI0I1;
                    synchronized (atomicReference) {
                        try {
/* 18 */                    iolll0ill1iVar = loliolo1io.I00iio;
                        } catch (RemoteException e) {
/* 60 */                    l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) loliolo1io.I00iOIl).I00ilO0;
/* 62 */                    l0olllO1i.I000II(l01o0io1ooo0);
/* 69 */                    l01o0io1ooo0.I00ilO0.I0000Il00O("Failed to request trigger URIs; remote exception", e);
/* 72 */                    atomicReference.notifyAll();
                        }
/* 20 */                if (iolll0ill1iVar != null) {
/* 49 */                    iolll0ill1iVar.I0000Il00O(lli10ii, bundle, new lO1I01lIoo0(loliolo1io, atomicReference));
/* 52 */                    loliolo1io.I0110OiO();
                        } else {
/* 26 */                    l01O0IO1ooO0 l01o0io1ooo02 = ((l0olllO1i) loliolo1io.I00iOIl).I00ilO0;
/* 28 */                    l0olllO1i.I000II(l01o0io1ooo02);
/* 35 */                    l01o0io1ooo02.I00ilO0.I00000oOI("Failed to request trigger URIs; not connected to service");
                        }
                    }
                }

                private final void I0000oI00() {
                    iolll0ill1i iolll0ill1iVar;
/* 3 */             lOliOlO1Io loliolo1io = (lOliOlO1Io) this.I00iiI;
/* 7 */             AtomicReference atomicReference = (AtomicReference) this.I00iiO;
/* 11 */            lli10iI lli10ii = (lli10iI) this.I00iio;
/* 15 */            liIlli liilli = (liIlli) this.I00ilI0I1;
                    synchronized (atomicReference) {
                        try {
/* 18 */                    iolll0ill1iVar = loliolo1io.I00iio;
                        } catch (RemoteException e) {
/* 60 */                    l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) loliolo1io.I00iOIl).I00ilO0;
/* 62 */                    l0olllO1i.I000II(l01o0io1ooo0);
/* 69 */                    l01o0io1ooo0.I00ilO0.I0000Il00O("[sgtm] Failed to get upload batches; remote exception", e);
/* 72 */                    atomicReference.notifyAll();
                        }
/* 20 */                if (iolll0ill1iVar != null) {
/* 49 */                    iolll0ill1iVar.I00111O(lli10ii, liilli, new lO1O0iOOl(loliolo1io, atomicReference));
/* 52 */                    loliolo1io.I0110OiO();
                        } else {
/* 26 */                    l01O0IO1ooO0 l01o0io1ooo02 = ((l0olllO1i) loliolo1io.I00iOIl).I00ilO0;
/* 28 */                    l0olllO1i.I000II(l01o0io1ooo02);
/* 35 */                    l01o0io1ooo02.I00ilO0.I00000oOI("[sgtm] Failed to get upload batches; not connected to service");
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private final void I0001Ioi1lo() {
                    String str;
                    iilO0li iilo0li;
/* 3 */             li10lI1 li10li1 = (li10lI1) this.I00iiI;
/* 7 */             lOoIoI1Ioii looioi1ioii = (lOoIoI1Ioii) this.I00iiO;
/* 11 */            lIIl0IOioI liil0ioioi = (lIIl0IOioI) this.I00iio;
/* 15 */            String str2 = (String) this.I00ilI0I1;
/* 24 */            ((I0Oi111ii) ((I00Ol00) looioi1ioii).I0000Il00O).I00iiO = liil0ioioi;
/* 27 */            I00Ol00 i00Ol00 = (I00Ol00) looioi1ioii;
/* 37 */            lOOiIOiIilOo looiioiiiloo = ((I0Oi111ii) i00Ol00.I0000Il00O).I00OIo().I00000oIO;
/* 39 */            if (looiioiiiloo != null) {
/* 41 */                str = looiioiiiloo.I0000O;
/* 43 */                int i = i1IOIllO.I00000oIO;
/* 45 */                if (str == null || str.isEmpty()) {
/* 53 */                    str = "NA";
                        }
                    }
/* 58 */            IIlOoolol0ll iIlOoolol0ll = new IIlOoolol0ll(6);
/* 63 */            iIlOoolol0ll.I00iiI = li10li1.I00000oIO;
/* 67 */            iIlOoolol0ll.I00iiO = li10li1.I00000oOI;
                    synchronized (li10lI1.class) {
                        try {
/* 72 */                    iilo0li = li10lI1.I000iOII;
/* 74 */                    if (iilo0li == null) {
/* 86 */                        O11oilI o11oilII00000oIO = iio00I0oi.I00000oIO(Resources.getSystem().getConfiguration());
/* 91 */                        Object[] objArrCopyOf = new Object[4];
/* 93 */                        int i2 = 0;
/* 94 */                        int i3 = 0;
/* 99 */                        while (i2 < o11oilII00000oIO.I00000oOI()) {
/* 101 */                           Locale localeI00000oIO = o11oilII00000oIO.I00000oIO(i2);
/* 105 */                           Io0Ool io0Ool = IOi0li0I0.I00000oIO;
/* 107 */                           String languageTag = localeI00000oIO.toLanguageTag();
/* 111 */                           languageTag.getClass();
/* 114 */                           int i4 = i3 + 1;
/* 116 */                           int length = objArrCopyOf.length;
/* 117 */                           if (length < i4) {
/* 122 */                               int i5 = length + (length >> 1) + 1;
/* 124 */                               if (i5 < i4) {
/* 126 */                                   int iHighestOneBit = Integer.highestOneBit(i3);
/* 130 */                                   i5 = iHighestOneBit + iHighestOneBit;
                                        }
/* 131 */                               if (i5 < 0) {
/* 133 */                                   i5 = Integer.MAX_VALUE;
                                        }
/* 136 */                               objArrCopyOf = Arrays.copyOf(objArrCopyOf, i5);
                                    }
/* 140 */                           objArrCopyOf[i3] = languageTag;
/* 142 */                           i2++;
/* 144 */                           i3 = i4;
                                }
/* 148 */                       ii1liil10ll ii1liil10llVar = iiIIoOI.I00ilI0I1;
/* 157 */                       iilo0li = i3 == 0 ? iilO0li.I00ioIO : new iilO0li(objArrCopyOf, i3);
/* 160 */                       li10lI1.I000iOII = iilo0li;
                            }
                        } catch (Throwable th) {
/* 245 */                   throw th;
                        }
                    }
/* 163 */           iIlOoolol0ll.I00ilO0 = iilo0li;
/* 167 */           iIlOoolol0ll.I00ioIO = Boolean.TRUE;
/* 169 */           iIlOoolol0ll.I00ilI0I1 = str;
/* 171 */           iIlOoolol0ll.I00iio = str2;
/* 196 */           iIlOoolol0ll.I00io1l = li10li1.I0001Ioi1lo.I000OOo1O() ? (String) li10li1.I0001Ioi1lo.I000II() : li10li1.I0000O.getMlSdkInstanceId();
/* 204 */           iIlOoolol0ll.I00l0OO0IO = 10;
/* 212 */           iIlOoolol0ll.I00li1OI = Integer.valueOf(li10li1.I000O01llI0);
/* 214 */           i00Ol00.I0000O = iIlOoolol0ll;
/* 218 */           li10li1.I0000Il00O.I00000oIO(looioi1ioii);
                }

                private final void I000II() {
                    String str;
                    iOloIilioi ioloiilioi;
/* 3 */             lo0iO1OO lo0io1oo = (lo0iO1OO) this.I00iiI;
/* 7 */             I00Ol00 i00Ol00 = (I00Ol00) this.I00iiO;
/* 11 */            lOl1ol1OOO lol1ol1ooo = (lOl1ol1OOO) this.I00iio;
/* 15 */            String str2 = (String) this.I00ilI0I1;
/* 19 */            l1IllOOOo1 l1illoooo1 = (l1IllOOOo1) i00Ol00.I0000Il00O;
/* 21 */            l1illoooo1.I00iiO = lol1ol1ooo;
/* 27 */            llOo1oi1 lloo1oi1 = l1illoooo1.I000II().I00000oIO;
/* 29 */            if (lloo1oi1 == null || (str = lloo1oi1.I0000O) == null || str.isEmpty()) {
/* 41 */                str = "NA";
                    }
/* 46 */            IIlOoolol0ll iIlOoolol0ll = new IIlOoolol0ll(7);
/* 51 */            iIlOoolol0ll.I00iiI = lo0io1oo.I00000oIO;
/* 55 */            iIlOoolol0ll.I00iiO = lo0io1oo.I00000oOI;
                    synchronized (lo0iO1OO.class) {
                        try {
/* 60 */                    ioloiilioi = lo0iO1OO.I000OiO;
/* 62 */                    if (ioloiilioi == null) {
/* 74 */                        O11oilI o11oilII00000oIO = iio00I0oi.I00000oIO(Resources.getSystem().getConfiguration());
/* 79 */                        Object[] objArrCopyOf = new Object[4];
/* 81 */                        int i = 0;
/* 82 */                        int i2 = 0;
/* 87 */                        while (i < o11oilII00000oIO.I00000oOI()) {
/* 89 */                            Locale localeI00000oIO = o11oilII00000oIO.I00000oIO(i);
/* 93 */                            Io0Ool io0Ool = IOi0li0I0.I00000oIO;
/* 95 */                            String languageTag = localeI00000oIO.toLanguageTag();
/* 99 */                            languageTag.getClass();
/* 102 */                           int i3 = i2 + 1;
/* 104 */                           int length = objArrCopyOf.length;
/* 105 */                           if (length < i3) {
/* 110 */                               int i4 = length + (length >> 1) + 1;
/* 112 */                               if (i4 < i3) {
/* 114 */                                   int iHighestOneBit = Integer.highestOneBit(i2);
/* 118 */                                   i4 = iHighestOneBit + iHighestOneBit;
                                        }
/* 119 */                               if (i4 < 0) {
/* 121 */                                   i4 = Integer.MAX_VALUE;
                                        }
/* 124 */                               objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                                    }
/* 128 */                           objArrCopyOf[i2] = languageTag;
/* 130 */                           i++;
/* 132 */                           i2 = i3;
                                }
/* 136 */                       iOIooO0I ioiooo0i = iOiIi01lo000.I00lll10;
/* 145 */                       ioloiilioi = i2 == 0 ? iOloIilioi.I00o101lO : new iOloIilioi(objArrCopyOf, i2);
/* 148 */                       lo0iO1OO.I000OiO = ioloiilioi;
                            }
                        } catch (Throwable th) {
/* 245 */                   throw th;
                        }
                    }
/* 151 */           iIlOoolol0ll.I00ilO0 = ioloiilioi;
/* 155 */           iIlOoolol0ll.I00ioIO = Boolean.TRUE;
/* 157 */           iIlOoolol0ll.I00ilI0I1 = str;
/* 159 */           iIlOoolol0ll.I00iio = str2;
/* 184 */           iIlOoolol0ll.I00io1l = lo0io1oo.I0001Ioi1lo.I000OOo1O() ? (String) lo0io1oo.I0001Ioi1lo.I000II() : lo0io1oo.I0000O.getMlSdkInstanceId();
/* 192 */           iIlOoolol0ll.I00l0OO0IO = 10;
/* 200 */           iIlOoolol0ll.I00li1OI = Integer.valueOf(lo0io1oo.I000O01llI0);
/* 202 */           i00Ol00.I0000O = iIlOoolol0ll;
/* 206 */           lo0io1oo.I0000Il00O.I00000oIO(i00Ol00);
                }

                private final void I000O01llI0() {
                    String str;
                    ii0iO1l ii0io1lI001iOo1i0O;
/* 3 */             loOiOoIi looiooii = (loOiOoIi) this.I00iiI;
/* 7 */             loII0oIOI1i1 loii0oioi1i1 = (loII0oIOI1i1) this.I00iiO;
/* 11 */            lOoo11 looo11 = (lOoo11) this.I00iio;
/* 15 */            String str2 = (String) this.I00ilI0I1;
/* 24 */            ((I0Oi111ii) ((I00Ol00) loii0oioi1i1).I0000Il00O).I00iiO = looo11;
/* 27 */            I00Ol00 i00Ol00 = (I00Ol00) loii0oioi1i1;
/* 37 */            lloiOoi0i1ol lloiooi0i1ol = ((I0Oi111ii) i00Ol00.I0000Il00O).I00OOll1().I00000oIO;
/* 39 */            if (lloiooi0i1ol == null || (str = lloiooi0i1ol.I0000O) == null || str.isEmpty()) {
/* 51 */                str = "NA";
                    }
/* 57 */            IIlOoolol0ll iIlOoolol0ll = new IIlOoolol0ll(8);
/* 62 */            iIlOoolol0ll.I00iiI = looiooii.I00000oIO;
/* 66 */            iIlOoolol0ll.I00iiO = looiooii.I00000oOI;
                    synchronized (loOiOoIi.class) {
                        try {
/* 71 */                    ii0io1lI001iOo1i0O = loOiOoIi.I000iOII;
/* 73 */                    if (ii0io1lI001iOo1i0O == null) {
/* 85 */                        O11oilI o11oilII00000oIO = iio00I0oi.I00000oIO(Resources.getSystem().getConfiguration());
/* 90 */                        Object[] objArrCopyOf = new Object[4];
/* 92 */                        int i = 0;
/* 93 */                        int i2 = 0;
/* 98 */                        while (i < o11oilII00000oIO.I00000oOI()) {
/* 100 */                           Locale localeI00000oIO = o11oilII00000oIO.I00000oIO(i);
/* 104 */                           Io0Ool io0Ool = IOi0li0I0.I00000oIO;
/* 106 */                           String languageTag = localeI00000oIO.toLanguageTag();
/* 110 */                           languageTag.getClass();
/* 113 */                           int i3 = i2 + 1;
/* 115 */                           int length = objArrCopyOf.length;
/* 116 */                           if (length < i3) {
/* 121 */                               int i4 = length + (length >> 1) + 1;
/* 123 */                               if (i4 < i3) {
/* 125 */                                   int iHighestOneBit = Integer.highestOneBit(i2);
/* 129 */                                   i4 = iHighestOneBit + iHighestOneBit;
                                        }
/* 130 */                               if (i4 < 0) {
/* 132 */                                   i4 = Integer.MAX_VALUE;
                                        }
/* 135 */                               objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                                    }
/* 139 */                           objArrCopyOf[i2] = languageTag;
/* 141 */                           i++;
/* 143 */                           i2 = i3;
                                }
/* 147 */                       ii0io1lI001iOo1i0O = iO10llOoIiI0.I001iOo1i0O(i2, objArrCopyOf);
/* 151 */                       loOiOoIi.I000iOII = ii0io1lI001iOo1i0O;
                            }
                        } catch (Throwable th) {
/* 245 */                   throw th;
                        }
                    }
/* 154 */           iIlOoolol0ll.I00ilO0 = ii0io1lI001iOo1i0O;
/* 158 */           iIlOoolol0ll.I00ioIO = Boolean.TRUE;
/* 160 */           iIlOoolol0ll.I00ilI0I1 = str;
/* 162 */           iIlOoolol0ll.I00iio = str2;
/* 187 */           iIlOoolol0ll.I00io1l = looiooii.I0001Ioi1lo.I000OOo1O() ? (String) looiooii.I0001Ioi1lo.I000II() : looiooii.I0000O.getMlSdkInstanceId();
/* 195 */           iIlOoolol0ll.I00l0OO0IO = 10;
/* 203 */           iIlOoolol0ll.I00li1OI = Integer.valueOf(looiooii.I000O01llI0);
/* 205 */           i00Ol00.I0000O = iIlOoolol0ll;
/* 209 */           looiooii.I0000Il00O.I00000oIO(loii0oioi1i1);
                }

                /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private final void I000OOo1O() {
                    String str;
                    ii1loIOIll0 ii1loioill0I000OiO;
/* 3 */             loi1ool loi1oolVar = (loi1ool) this.I00iiI;
/* 7 */             loO1lOoI0oOi loo1looi0ooi = (loO1lOoI0oOi) this.I00iiO;
/* 11 */            li0lloo li0llooVar = (li0lloo) this.I00iio;
/* 15 */            String str2 = (String) this.I00ilI0I1;
/* 24 */            ((IOiOol0) ((I00Ol00) loo1looi0ooi).I0000Il00O).I00iiO = li0llooVar;
/* 27 */            I00Ol00 i00Ol00 = (I00Ol00) loo1looi0ooi;
/* 37 */            lo0II0OI lo0ii0oi = ((IOiOol0) i00Ol00.I0000Il00O).I00O0o1oo().I00000oIO;
/* 39 */            if (lo0ii0oi != null) {
/* 41 */                str = lo0ii0oi.I0000O;
/* 43 */                int i = l0IIiOO.I00000oIO;
/* 45 */                if (str == null || str.isEmpty()) {
/* 53 */                    str = "NA";
                        }
                    }
/* 59 */            IIlOoolol0ll iIlOoolol0ll = new IIlOoolol0ll(9);
/* 64 */            iIlOoolol0ll.I00iiI = loi1oolVar.I00000oIO;
/* 68 */            iIlOoolol0ll.I00iiO = loi1oolVar.I00000oOI;
                    synchronized (loi1ool.class) {
                        try {
/* 73 */                    ii1loioill0I000OiO = loi1ool.I000iOII;
/* 75 */                    if (ii1loioill0I000OiO == null) {
/* 87 */                        O11oilI o11oilII00000oIO = iio00I0oi.I00000oIO(Resources.getSystem().getConfiguration());
/* 92 */                        Object[] objArrCopyOf = new Object[4];
/* 94 */                        int i2 = 0;
/* 95 */                        int i3 = 0;
/* 100 */                       while (i2 < o11oilII00000oIO.I00000oOI()) {
/* 102 */                           Locale localeI00000oIO = o11oilII00000oIO.I00000oIO(i2);
/* 106 */                           Io0Ool io0Ool = IOi0li0I0.I00000oIO;
/* 108 */                           String languageTag = localeI00000oIO.toLanguageTag();
/* 112 */                           languageTag.getClass();
/* 115 */                           int i4 = i3 + 1;
/* 117 */                           int length = objArrCopyOf.length;
/* 118 */                           if (length < i4) {
/* 123 */                               int i5 = length + (length >> 1) + 1;
/* 125 */                               if (i5 < i4) {
/* 127 */                                   int iHighestOneBit = Integer.highestOneBit(i3);
/* 131 */                                   i5 = iHighestOneBit + iHighestOneBit;
                                        }
/* 132 */                               if (i5 < 0) {
/* 134 */                                   i5 = Integer.MAX_VALUE;
                                        }
/* 137 */                               objArrCopyOf = Arrays.copyOf(objArrCopyOf, i5);
                                    }
/* 141 */                           objArrCopyOf[i3] = languageTag;
/* 143 */                           i2++;
/* 145 */                           i3 = i4;
                                }
/* 149 */                       ii1loioill0I000OiO = iOiloii0i1io.I000OiO(i3, objArrCopyOf);
/* 153 */                       loi1ool.I000iOII = ii1loioill0I000OiO;
                            }
                        } catch (Throwable th) {
/* 245 */                   throw th;
                        }
                    }
/* 156 */           iIlOoolol0ll.I00ilO0 = ii1loioill0I000OiO;
/* 160 */           iIlOoolol0ll.I00ioIO = Boolean.TRUE;
/* 162 */           iIlOoolol0ll.I00ilI0I1 = str;
/* 164 */           iIlOoolol0ll.I00iio = str2;
/* 189 */           iIlOoolol0ll.I00io1l = loi1oolVar.I0001Ioi1lo.I000OOo1O() ? (String) loi1oolVar.I0001Ioi1lo.I000II() : loi1oolVar.I0000O.getMlSdkInstanceId();
/* 197 */           iIlOoolol0ll.I00l0OO0IO = 10;
/* 205 */           iIlOoolol0ll.I00li1OI = Integer.valueOf(loi1oolVar.I000O01llI0);
/* 207 */           i00Ol00.I0000O = iIlOoolol0ll;
/* 211 */           loi1oolVar.I0000Il00O.I00000oIO(loo1looi0ooi);
                }

                private final void I000OiO() {
                    String str;
                    iiI10IO0io0I iii10io0io0iI001iOo1i0O;
/* 3 */             loiI0oIOO loii0oioo = (loiI0oIOO) this.I00iiI;
/* 7 */             loOIiioiOool looiiioioool = (loOIiioiOool) this.I00iiO;
/* 11 */            li10OOoO0loI li10oooo0loi = (li10OOoO0loI) this.I00iio;
/* 15 */            String str2 = (String) this.I00ilI0I1;
/* 24 */            ((IOiOol0) ((I00Ol00) looiiioioool).I0000Il00O).I00iiO = li10oooo0loi;
/* 27 */            I00Ol00 i00Ol00 = (I00Ol00) looiiioioool;
/* 37 */            lo0II1 lo0ii1 = ((IOiOol0) i00Ol00.I0000Il00O).I00O10llo().I00000oIO;
/* 39 */            if (lo0ii1 == null || (str = lo0ii1.I0000O) == null || str.isEmpty()) {
/* 51 */                str = "NA";
                    }
/* 57 */            IIlOoolol0ll iIlOoolol0ll = new IIlOoolol0ll(10);
/* 62 */            iIlOoolol0ll.I00iiI = loii0oioo.I00000oIO;
/* 66 */            iIlOoolol0ll.I00iiO = loii0oioo.I00000oOI;
                    synchronized (loiI0oIOO.class) {
                        try {
/* 71 */                    iii10io0io0iI001iOo1i0O = loiI0oIOO.I000iOII;
/* 73 */                    if (iii10io0io0iI001iOo1i0O == null) {
/* 85 */                        O11oilI o11oilII00000oIO = iio00I0oi.I00000oIO(Resources.getSystem().getConfiguration());
/* 90 */                        Object[] objArrCopyOf = new Object[4];
/* 92 */                        int i = 0;
/* 93 */                        int i2 = 0;
/* 98 */                        while (i < o11oilII00000oIO.I00000oOI()) {
/* 100 */                           Locale localeI00000oIO = o11oilII00000oIO.I00000oIO(i);
/* 104 */                           Io0Ool io0Ool = IOi0li0I0.I00000oIO;
/* 106 */                           String languageTag = localeI00000oIO.toLanguageTag();
/* 110 */                           languageTag.getClass();
/* 113 */                           int i3 = i2 + 1;
/* 115 */                           int length = objArrCopyOf.length;
/* 116 */                           if (length < i3) {
/* 122 */                               objArrCopyOf = Arrays.copyOf(objArrCopyOf, liill1Iil1.I00000oIO(length, i3));
                                    }
/* 126 */                           objArrCopyOf[i2] = languageTag;
/* 128 */                           i++;
/* 130 */                           i2 = i3;
                                }
/* 134 */                       iii10io0io0iI001iOo1i0O = iOio11oiIi0I.I001iOo1i0O(i2, objArrCopyOf);
/* 138 */                       loiI0oIOO.I000iOII = iii10io0io0iI001iOo1i0O;
                            }
                        } catch (Throwable th) {
/* 245 */                   throw th;
                        }
                    }
/* 141 */           iIlOoolol0ll.I00ilO0 = iii10io0io0iI001iOo1i0O;
/* 145 */           iIlOoolol0ll.I00ioIO = Boolean.TRUE;
/* 147 */           iIlOoolol0ll.I00ilI0I1 = str;
/* 149 */           iIlOoolol0ll.I00iio = str2;
/* 174 */           iIlOoolol0ll.I00io1l = loii0oioo.I0001Ioi1lo.I000OOo1O() ? (String) loii0oioo.I0001Ioi1lo.I000II() : loii0oioo.I0000O.getMlSdkInstanceId();
/* 180 */           iIlOoolol0ll.I00l0OO0IO = 10;
/* 188 */           iIlOoolol0ll.I00li1OI = Integer.valueOf(loii0oioo.I000O01llI0);
/* 190 */           i00Ol00.I0000O = iIlOoolol0ll;
/* 194 */           loii0oioo.I0000Il00O.I00000oIO(looiiioioool);
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private final void I000iOII() {
                    String str;
                    iilOoOO00 iiloooo00I001iOo1i0O;
/* 3 */             loloOlli1l0 loloolli1l0 = (loloOlli1l0) this.I00iiI;
/* 7 */             loioOil loiooil = (loioOil) this.I00iiO;
/* 11 */            liOll1O lioll1o = (liOll1O) this.I00iio;
/* 15 */            String str2 = (String) this.I00ilI0I1;
/* 24 */            ((I0Oi111ii) ((I00Ol00) loiooil).I0000Il00O).I00iiO = lioll1o;
/* 27 */            I00Ol00 i00Ol00 = (I00Ol00) loiooil;
/* 37 */            loI1IIi loi1iii = ((I0Oi111ii) i00Ol00.I0000Il00O).I00OilO00Il().I00000oIO;
/* 39 */            if (loi1iii != null) {
/* 41 */                str = loi1iii.I0000O;
/* 47 */                if (ll1iOi.I00000oOI(str)) {
/* 53 */                    str = "NA";
                        } else {
/* 49 */                    lII0I0I000I.I000II(str);
                        }
                    }
/* 59 */            IIlOoolol0ll iIlOoolol0ll = new IIlOoolol0ll(11);
/* 64 */            iIlOoolol0ll.I00iiI = loloolli1l0.I00000oIO;
/* 68 */            iIlOoolol0ll.I00iiO = loloolli1l0.I00000oOI;
                    synchronized (loloOlli1l0.class) {
                        try {
/* 73 */                    iiloooo00I001iOo1i0O = loloOlli1l0.I000iOII;
/* 75 */                    if (iiloooo00I001iOo1i0O == null) {
/* 87 */                        O11oilI o11oilII00000oIO = iio00I0oi.I00000oIO(Resources.getSystem().getConfiguration());
/* 92 */                        Object[] objArrCopyOf = new Object[4];
/* 94 */                        int i = 0;
/* 95 */                        int i2 = 0;
/* 100 */                       while (i < o11oilII00000oIO.I00000oOI()) {
/* 102 */                           Locale localeI00000oIO = o11oilII00000oIO.I00000oIO(i);
/* 106 */                           Io0Ool io0Ool = IOi0li0I0.I00000oIO;
/* 108 */                           String languageTag = localeI00000oIO.toLanguageTag();
/* 112 */                           languageTag.getClass();
/* 115 */                           int i3 = i2 + 1;
/* 117 */                           int length = objArrCopyOf.length;
/* 118 */                           if (length < i3) {
/* 123 */                               int i4 = length + (length >> 1) + 1;
/* 125 */                               if (i4 < i3) {
/* 127 */                                   int iHighestOneBit = Integer.highestOneBit(i2);
/* 131 */                                   i4 = iHighestOneBit + iHighestOneBit;
                                        }
/* 132 */                               if (i4 < 0) {
/* 134 */                                   i4 = Integer.MAX_VALUE;
                                        }
/* 137 */                               objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                                    }
/* 141 */                           objArrCopyOf[i2] = languageTag;
/* 143 */                           i++;
/* 145 */                           i2 = i3;
                                }
/* 149 */                       iiloooo00I001iOo1i0O = ii1i1oI1o1O0.I001iOo1i0O(i2, objArrCopyOf);
/* 153 */                       loloOlli1l0.I000iOII = iiloooo00I001iOo1i0O;
                            }
                        } catch (Throwable th) {
/* 245 */                   throw th;
                        }
                    }
/* 156 */           iIlOoolol0ll.I00ilO0 = iiloooo00I001iOo1i0O;
/* 160 */           iIlOoolol0ll.I00ioIO = Boolean.TRUE;
/* 162 */           iIlOoolol0ll.I00ilI0I1 = str;
/* 164 */           iIlOoolol0ll.I00iio = str2;
/* 189 */           iIlOoolol0ll.I00io1l = loloolli1l0.I0001Ioi1lo.I000OOo1O() ? (String) loloolli1l0.I0001Ioi1lo.I000II() : loloolli1l0.I0000O.getMlSdkInstanceId();
/* 197 */           iIlOoolol0ll.I00l0OO0IO = 10;
/* 205 */           iIlOoolol0ll.I00li1OI = Integer.valueOf(loloolli1l0.I000O01llI0);
/* 207 */           i00Ol00.I0000O = iIlOoolol0ll;
/* 211 */           loloolli1l0.I0000Il00O.I00000oIO(loiooil);
                }

                private final void I000l1() {
                    String str;
                    iiOOi1OolOlO iiooi1oololoI001iOo1i0O;
/* 3 */             o0OIl1o1i0Oi o0oil1o1i0oi = (o0OIl1o1i0Oi) this.I00iiI;
/* 7 */             o0IlO11iI0 o0ilo11ii0 = (o0IlO11iI0) this.I00iiO;
/* 11 */            lioiiIOoil lioiiiooil = (lioiiIOoil) this.I00iio;
/* 15 */            String str2 = (String) this.I00ilI0I1;
/* 24 */            ((IOiOol0) ((o0Oll1li) o0ilo11ii0).I0000Il00O).I00iiO = lioiiiooil;
/* 27 */            o0Oll1li o0oll1li = (o0Oll1li) o0ilo11ii0;
/* 37 */            loioOO0OOiO loiooo0ooio = ((IOiOol0) o0oll1li.I0000Il00O).I00OIO1().I00000oIO;
/* 39 */            if (loiooo0ooio == null || (str = loiooo0ooio.I0000O) == null || str.isEmpty()) {
/* 51 */                str = "NA";
                    }
/* 57 */            IIlOoolol0ll iIlOoolol0ll = new IIlOoolol0ll(12);
/* 62 */            iIlOoolol0ll.I00iiI = o0oil1o1i0oi.I00000oIO;
/* 66 */            iIlOoolol0ll.I00iiO = o0oil1o1i0oi.I00000oOI;
                    synchronized (o0OIl1o1i0Oi.class) {
                        try {
/* 71 */                    iiooi1oololoI001iOo1i0O = o0OIl1o1i0Oi.I000iOII;
/* 73 */                    if (iiooi1oololoI001iOo1i0O == null) {
/* 85 */                        O11oilI o11oilII00000oIO = iio00I0oi.I00000oIO(Resources.getSystem().getConfiguration());
/* 90 */                        Object[] objArrCopyOf = new Object[4];
/* 92 */                        int i = 0;
/* 93 */                        int i2 = 0;
/* 98 */                        while (i < o11oilII00000oIO.I00000oOI()) {
/* 100 */                           Locale localeI00000oIO = o11oilII00000oIO.I00000oIO(i);
/* 104 */                           Io0Ool io0Ool = IOi0li0I0.I00000oIO;
/* 106 */                           String languageTag = localeI00000oIO.toLanguageTag();
/* 110 */                           languageTag.getClass();
/* 113 */                           int i3 = i2 + 1;
/* 115 */                           int length = objArrCopyOf.length;
/* 116 */                           if (length < i3) {
/* 122 */                               objArrCopyOf = Arrays.copyOf(objArrCopyOf, I00IOO.I000iOII(length, i3));
                                    }
/* 126 */                           objArrCopyOf[i2] = languageTag;
/* 128 */                           i++;
/* 130 */                           i2 = i3;
                                }
/* 134 */                       iiooi1oololoI001iOo1i0O = ii01IlIiIo.I001iOo1i0O(i2, objArrCopyOf);
/* 138 */                       o0OIl1o1i0Oi.I000iOII = iiooi1oololoI001iOo1i0O;
                            }
                        } catch (Throwable th) {
/* 245 */                   throw th;
                        }
                    }
/* 141 */           iIlOoolol0ll.I00ilO0 = iiooi1oololoI001iOo1i0O;
/* 145 */           iIlOoolol0ll.I00ioIO = Boolean.TRUE;
/* 147 */           iIlOoolol0ll.I00ilI0I1 = str;
/* 149 */           iIlOoolol0ll.I00iio = str2;
/* 174 */           iIlOoolol0ll.I00io1l = o0oil1o1i0oi.I0001Ioi1lo.I000OOo1O() ? (String) o0oil1o1i0oi.I0001Ioi1lo.I000II() : o0oil1o1i0oi.I0000O.getMlSdkInstanceId();
/* 182 */           iIlOoolol0ll.I00l0OO0IO = 10;
/* 190 */           iIlOoolol0ll.I00li1OI = Integer.valueOf(o0oil1o1i0oi.I000O01llI0);
/* 192 */           o0oll1li.I0000O = iIlOoolol0ll;
/* 196 */           o0oil1o1i0oi.I0000Il00O.I00000oIO(o0ilo11ii0);
                }

                private final void I000lI() {
                    String str;
                    ilIIoll0ll iliioll0llI0000Il00O;
/* 3 */             o0OiOio o0oioio = (o0OiOio) this.I00iiI;
/* 7 */             o0IooioOOIl o0iooioooil = (o0IooioOOIl) this.I00iiO;
/* 11 */            lliOo1oo llioo1oo = (lliOo1oo) this.I00iio;
/* 15 */            String str2 = (String) this.I00ilI0I1;
/* 24 */            ((IOiOol0) ((o0Oll1li) o0iooioooil).I0000Il00O).I00iiO = llioo1oo;
/* 27 */            o0Oll1li o0oll1li = (o0Oll1li) o0iooioooil;
/* 37 */            o00oo00i o00oo00iVar = ((IOiOol0) o0oll1li.I0000Il00O).I00OI1().I00000oIO;
/* 39 */            if (o00oo00iVar == null || (str = o00oo00iVar.I0000O) == null || str.isEmpty()) {
/* 56 */                str = "NA";
                    } else {
/* 52 */                lII0I0I000I.I000II(str);
                    }
/* 62 */            IIlOoolol0ll iIlOoolol0ll = new IIlOoolol0ll(15);
/* 67 */            iIlOoolol0ll.I00iiI = o0oioio.I00000oIO;
/* 71 */            iIlOoolol0ll.I00iiO = o0oioio.I00000oOI;
                    synchronized (o0OiOio.class) {
                        try {
/* 76 */                    iliioll0llI0000Il00O = o0OiOio.I000iOII;
/* 78 */                    if (iliioll0llI0000Il00O == null) {
/* 90 */                        O11oilI o11oilII00000oIO = iio00I0oi.I00000oIO(Resources.getSystem().getConfiguration());
/* 96 */                        iiooi0i00l iiooi0i00lVar = new iiooi0i00l();
/* 104 */                       for (int i = 0; i < o11oilII00000oIO.I00000oOI(); i++) {
/* 106 */                           Locale localeI00000oIO = o11oilII00000oIO.I00000oIO(i);
/* 110 */                           Io0Ool io0Ool = IOi0li0I0.I00000oIO;
/* 116 */                           iiooi0i00lVar.I00000oIO(localeI00000oIO.toLanguageTag());
                                }
/* 124 */                       iliioll0llI0000Il00O = iiooi0i00lVar.I0000Il00O();
/* 128 */                       o0OiOio.I000iOII = iliioll0llI0000Il00O;
                            }
                        } catch (Throwable th) {
/* 245 */                   throw th;
                        }
                    }
/* 131 */           iIlOoolol0ll.I00ilO0 = iliioll0llI0000Il00O;
/* 135 */           iIlOoolol0ll.I00ioIO = Boolean.TRUE;
/* 137 */           iIlOoolol0ll.I00ilI0I1 = str;
/* 139 */           iIlOoolol0ll.I00iio = str2;
/* 164 */           iIlOoolol0ll.I00io1l = o0oioio.I0001Ioi1lo.I000OOo1O() ? (String) o0oioio.I0001Ioi1lo.I000II() : o0oioio.I0000O.getMlSdkInstanceId();
/* 172 */           iIlOoolol0ll.I00l0OO0IO = 10;
/* 180 */           iIlOoolol0ll.I00li1OI = Integer.valueOf(o0oioio.I000O01llI0);
/* 182 */           o0oll1li.I0000O = iIlOoolol0ll;
/* 186 */           o0oioio.I0000Il00O.I00000oIO(o0iooioooil);
                }

                private final void I000o00OoI0I() {
                    String str;
                    io1O1ooo io1o1oooI000lI;
/* 3 */             i1IOoI i1iooi = (i1IOoI) this.I00iiI;
/* 7 */             i000IO i000io = (i000IO) this.I00iiO;
/* 11 */            lolllOIlII lollloilii = (lolllOIlII) this.I00iio;
/* 15 */            String str2 = (String) this.I00ilI0I1;
/* 19 */            I1ii1o0 i1ii1o0 = (I1ii1o0) i000io.I00iiI;
/* 21 */            i1ii1o0.I00iiO = lollloilii;
/* 27 */            o10Oo0i o10oo0i = i1ii1o0.I00O10llo().I00000oIO;
/* 29 */            if (o10oo0i == null || (str = o10oo0i.I0000O) == null || str.isEmpty()) {
/* 46 */                str = "NA";
                    } else {
/* 42 */                lII0I0I000I.I000II(str);
                    }
/* 52 */            IIlOoolol0ll iIlOoolol0ll = new IIlOoolol0ll(16);
/* 57 */            iIlOoolol0ll.I00iiI = i1iooi.I00000oIO;
/* 61 */            iIlOoolol0ll.I00iiO = i1iooi.I00000oOI;
                    synchronized (i1IOoI.class) {
                        try {
/* 66 */                    io1o1oooI000lI = i1IOoI.I000OOo1O;
/* 68 */                    if (io1o1oooI000lI == null) {
/* 80 */                        O11oilI o11oilII00000oIO = iio00I0oi.I00000oIO(Resources.getSystem().getConfiguration());
/* 85 */                        Object[] objArrCopyOf = new Object[4];
/* 87 */                        int i = 0;
/* 88 */                        int i2 = 0;
/* 93 */                        while (i < o11oilII00000oIO.I00000oOI()) {
/* 95 */                            Locale localeI00000oIO = o11oilII00000oIO.I00000oIO(i);
/* 99 */                            Io0Ool io0Ool = IOi0li0I0.I00000oIO;
/* 101 */                           String languageTag = localeI00000oIO.toLanguageTag();
/* 105 */                           languageTag.getClass();
/* 108 */                           int length = objArrCopyOf.length;
/* 109 */                           int i3 = i2 + 1;
/* 111 */                           int iI00000oIO = lioOIliIloli.I00000oIO(length, i3);
/* 115 */                           if (iI00000oIO > length) {
/* 118 */                               objArrCopyOf = Arrays.copyOf(objArrCopyOf, iI00000oIO);
                                    }
/* 122 */                           objArrCopyOf[i2] = languageTag;
/* 124 */                           i++;
/* 126 */                           i2 = i3;
                                }
/* 130 */                       io1o1oooI000lI = io0OIIlOli1.I000lI(i2, objArrCopyOf);
/* 134 */                       i1IOoI.I000OOo1O = io1o1oooI000lI;
                            }
                        } catch (Throwable th) {
/* 245 */                   throw th;
                        }
                    }
/* 137 */           iIlOoolol0ll.I00ilO0 = io1o1oooI000lI;
/* 141 */           iIlOoolol0ll.I00ioIO = Boolean.TRUE;
/* 143 */           iIlOoolol0ll.I00ilI0I1 = str;
/* 145 */           iIlOoolol0ll.I00iio = str2;
/* 147 */           o0IiOl o0iiol = i1iooi.I0001Ioi1lo;
/* 168 */           iIlOoolol0ll.I00io1l = o0iiol.I000OOo1O() ? (String) o0iiol.I000II() : i1iooi.I0000O.getMlSdkInstanceId();
/* 176 */           iIlOoolol0ll.I00l0OO0IO = 10;
/* 184 */           iIlOoolol0ll.I00li1OI = Integer.valueOf(i1iooi.I000O01llI0);
/* 186 */           i000io.I00iiO = iIlOoolol0ll;
/* 190 */           i1iooi.I0000Il00O.I00000oIO(i000io);
                }

                /* JADX WARN: Removed duplicated region for block: B:146:0x04d1  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() throws SQLException {
                    String str;
                    ioI01O0 ioi01o0I000lI;
                    String str2;
                    iooO1OIlo iooo1oiloI001lIiIIo1O;
                    String str3;
                    lOl10OOloi lol10ooloiI000oI1ioi;
                    long j;
                    o0olloo1 o0olloo1Var;
                    iolll0ill1i iolll0ill1iVar;
                    String str4;
                    io1OIiI1olo io1oiii1oloI000lI;
/* 5 */             int i = 2;
/* 6 */             long jElapsedRealtime = 0;
/* 10 */            byte[] bArrI00IO1oi11O = null;
/* 11 */            int i2 = 4;
/* 13 */            int i3 = 0;
                    switch (this.I00iOIl) {
                        case 0:
/* 2109 */                  IO0iOlIO1o iO0iOlIO1o = (IO0iOlIO1o) ((Oi0Oooi) this.I00ilI0I1).I00iiI;
/* 2113 */                  O1ioIIl o1ioIIl = (O1ioIIl) this.I00iiO;
/* 2117 */                  IO0iO0oo1o01 iO0iO0oo1o01 = (IO0iO0oo1o01) this.I00iiI;
/* 2119 */                  if (iO0iO0oo1o01 != null) {
/* 2121 */                      iO0iOlIO1o.I00oliIiO01i = true;
/* 2126 */                      iO0iO0oo1o01.I00000oOI.I0000Il00O(false);
/* 2129 */                      iO0iOlIO1o.I00oliIiO01i = false;
                            }
/* 2135 */                  if (o1ioIIl.isEnabled() && o1ioIIl.hasSubMenu()) {
/* 2147 */                      ((O1illlIiilIl) this.I00iio).I00100o1O0lo(o1ioIIl, null, 4);
/* 2150 */                      return;
                            }
/* 2150 */                  return;
                        case 1:
/* 2099 */                  I00000oIO();
/* 2102 */                  return;
                        case 2:
/* 1909 */                  i1Iio0Ol i1iio0ol = (i1Iio0Ol) this.I00iiI;
/* 1913 */                  OoOlO1O0o ooOlO1O0o = (OoOlO1O0o) this.I00iiO;
/* 1917 */                  lolooOOo11o lolooooo11o = (lolooOOo11o) this.I00iio;
/* 1921 */                  String str5 = (String) this.I00ilI0I1;
/* 1925 */                  I1ii1o0 i1ii1o0 = (I1ii1o0) ooOlO1O0o.I00iiI;
/* 1927 */                  i1ii1o0.I00iiO = lolooooo11o;
/* 1933 */                  o10iloO1l1 o10iloo1l1 = i1ii1o0.I00OIO1().I00000oIO;
/* 1935 */                  if (o10iloo1l1 == null || (str = o10iloo1l1.I0000O) == null || str.isEmpty()) {
/* 1952 */                      str = "NA";
                            } else {
/* 1948 */                      lII0I0I000I.I000II(str);
                            }
/* 1958 */                  IIlOoolol0ll iIlOoolol0ll = new IIlOoolol0ll(18);
/* 1963 */                  iIlOoolol0ll.I00iiI = i1iio0ol.I00000oIO;
/* 1967 */                  iIlOoolol0ll.I00iiO = i1iio0ol.I00000oOI;
                            synchronized (i1Iio0Ol.class) {
                                try {
/* 1972 */                          ioi01o0I000lI = i1Iio0Ol.I000OOo1O;
/* 1974 */                          if (ioi01o0I000lI == null) {
/* 1986 */                              O11oilI o11oilII00000oIO = iio00I0oi.I00000oIO(Resources.getSystem().getConfiguration());
/* 1990 */                              Object[] objArrCopyOf = new Object[4];
/* 1992 */                              int i4 = 0;
/* 1993 */                              int i5 = 0;
/* 1998 */                              while (i4 < o11oilII00000oIO.I00000oOI()) {
/* 2000 */                                  Locale localeI00000oIO = o11oilII00000oIO.I00000oIO(i4);
/* 2004 */                                  Io0Ool io0Ool = IOi0li0I0.I00000oIO;
/* 2006 */                                  String languageTag = localeI00000oIO.toLanguageTag();
/* 2010 */                                  languageTag.getClass();
/* 2013 */                                  int length = objArrCopyOf.length;
/* 2014 */                                  int i6 = i5 + 1;
/* 2016 */                                  int iI00000oIO = lioOolIil.I00000oIO(length, i6);
/* 2020 */                                  if (iI00000oIO > length) {
/* 2023 */                                      objArrCopyOf = Arrays.copyOf(objArrCopyOf, iI00000oIO);
                                            }
/* 2027 */                                  objArrCopyOf[i5] = languageTag;
/* 2029 */                                  i4++;
/* 2031 */                                  i5 = i6;
                                        }
/* 2035 */                              ioi01o0I000lI = io0o00I1ol1o.I000lI(i5, objArrCopyOf);
/* 2039 */                              i1Iio0Ol.I000OOo1O = ioi01o0I000lI;
                                    }
                                } finally {
                                }
                            }
/* 2042 */                  iIlOoolol0ll.I00ilO0 = ioi01o0I000lI;
/* 2046 */                  iIlOoolol0ll.I00ioIO = Boolean.TRUE;
/* 2048 */                  iIlOoolol0ll.I00ilI0I1 = str;
/* 2050 */                  iIlOoolol0ll.I00iio = str5;
/* 2052 */                  o0IiOl o0iiol = i1iio0ol.I0001Ioi1lo;
/* 2073 */                  iIlOoolol0ll.I00io1l = o0iiol.I000OOo1O() ? (String) o0iiol.I000II() : i1iio0ol.I0000O.getMlSdkInstanceId();
/* 2079 */                  iIlOoolol0ll.I00l0OO0IO = 10;
/* 2087 */                  iIlOoolol0ll.I00li1OI = Integer.valueOf(i1iio0ol.I000O01llI0);
/* 2089 */                  ooOlO1O0o.I00iiO = iIlOoolol0ll;
/* 2093 */                  i1iio0ol.I0000Il00O.I00000oIO(ooOlO1O0o);
/* 2096 */                  return;
                        case 3:
/* 1712 */                  i1OlIi1OoI0 i1olii1ooi0 = (i1OlIi1OoI0) this.I00iiI;
/* 1716 */                  OoIol00Ool ooIol00Ool = (OoIol00Ool) this.I00iiO;
/* 1720 */                  o011iIl o011iil = (o011iIl) this.I00iio;
/* 1724 */                  String str6 = (String) this.I00ilI0I1;
/* 1728 */                  I1ii1o0 i1ii1o02 = (I1ii1o0) ooIol00Ool.I00iiI;
/* 1730 */                  i1ii1o02.I00iiO = o011iil;
/* 1736 */                  o1I01i0iOo o1i01i0ioo = i1ii1o02.I00OIl().I00000oIO;
/* 1738 */                  if (o1i01i0ioo == null || (str2 = o1i01i0ioo.I0000O) == null || str2.isEmpty()) {
/* 1755 */                      str2 = "NA";
                            } else {
/* 1751 */                      lII0I0I000I.I000II(str2);
                            }
/* 1761 */                  IIlOoolol0ll iIlOoolol0ll2 = new IIlOoolol0ll(19);
/* 1766 */                  iIlOoolol0ll2.I00iiI = i1olii1ooi0.I00000oIO;
/* 1770 */                  iIlOoolol0ll2.I00iiO = i1olii1ooi0.I00000oOI;
                            synchronized (i1OlIi1OoI0.class) {
                                try {
/* 1775 */                          iooo1oiloI001lIiIIo1O = i1OlIi1OoI0.I000OOo1O;
/* 1777 */                          if (iooo1oiloI001lIiIIo1O == null) {
/* 1789 */                              O11oilI o11oilII00000oIO2 = iio00I0oi.I00000oIO(Resources.getSystem().getConfiguration());
/* 1795 */                              lioIlO.I00000oIO(4, "initialCapacity");
/* 1798 */                              Object[] objArrCopyOf2 = new Object[4];
/* 1800 */                              int i7 = 0;
/* 1801 */                              int i8 = 0;
/* 1806 */                              while (i7 < o11oilII00000oIO2.I00000oOI()) {
/* 1808 */                                  Locale localeI00000oIO2 = o11oilII00000oIO2.I00000oIO(i7);
/* 1812 */                                  Io0Ool io0Ool2 = IOi0li0I0.I00000oIO;
/* 1814 */                                  String languageTag2 = localeI00000oIO2.toLanguageTag();
/* 1818 */                                  languageTag2.getClass();
/* 1821 */                                  int length2 = objArrCopyOf2.length;
/* 1822 */                                  int i9 = i8 + 1;
/* 1824 */                                  int iI000OOo1O = IoilIilo.I000OOo1O(length2, i9);
/* 1828 */                                  if (iI000OOo1O > length2) {
/* 1831 */                                      objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, iI000OOo1O);
                                            }
/* 1835 */                                  objArrCopyOf2[i8] = languageTag2;
/* 1837 */                                  i7++;
/* 1839 */                                  i8 = i9;
                                        }
/* 1843 */                              iooo1oiloI001lIiIIo1O = ioIl00.I001lIiIIo1O(i8, objArrCopyOf2);
/* 1847 */                              i1OlIi1OoI0.I000OOo1O = iooo1oiloI001lIiIIo1O;
                                    }
                                } finally {
                                }
                            }
/* 1850 */                  iIlOoolol0ll2.I00ilO0 = iooo1oiloI001lIiIIo1O;
/* 1854 */                  iIlOoolol0ll2.I00ioIO = Boolean.TRUE;
/* 1856 */                  iIlOoolol0ll2.I00ilI0I1 = str2;
/* 1858 */                  iIlOoolol0ll2.I00iio = str6;
/* 1860 */                  o0IiOl o0iiol2 = i1olii1ooi0.I0001Ioi1lo;
/* 1881 */                  iIlOoolol0ll2.I00io1l = o0iiol2.I000OOo1O() ? (String) o0iiol2.I000II() : i1olii1ooi0.I0000O.getMlSdkInstanceId();
/* 1887 */                  iIlOoolol0ll2.I00l0OO0IO = 10;
/* 1895 */                  iIlOoolol0ll2.I00li1OI = Integer.valueOf(i1olii1ooi0.I000O01llI0);
/* 1897 */                  ooIol00Ool.I00iiO = iIlOoolol0ll2;
/* 1901 */                  i1olii1ooi0.I0000Il00O.I00000oIO(ooIol00Ool);
/* 1904 */                  return;
                        case 4:
/* 1517 */                  iOiooiO ioiooio = (iOiooiO) this.I00iiI;
/* 1521 */                  OoIOol ooIOol = (OoIOol) this.I00iiO;
/* 1525 */                  iO0O00 io0o00 = (iO0O00) this.I00iio;
/* 1529 */                  String str7 = (String) this.I00ilI0I1;
/* 1533 */                  I0Oi111ii i0Oi111ii = (I0Oi111ii) ooIOol.I00iiI;
/* 1535 */                  i0Oi111ii.I00iiO = io0o00;
/* 1541 */                  iOOlIOiOl ioolioiol = i0Oi111ii.I00OIO1().I00000oIO;
/* 1543 */                  if (ioolioiol == null || (str3 = ioolioiol.I0000O) == null || str3.isEmpty()) {
/* 1560 */                      str3 = "NA";
                            } else {
/* 1556 */                      lII0I0I000I.I000II(str3);
                            }
/* 1564 */                  IIlOoolol0ll iIlOoolol0ll3 = new IIlOoolol0ll(i2);
/* 1569 */                  iIlOoolol0ll3.I00iiI = ioiooio.I00000oIO;
/* 1573 */                  iIlOoolol0ll3.I00iiO = ioiooio.I00000oOI;
                            synchronized (iOiooiO.class) {
                                try {
/* 1578 */                          lol10ooloiI000oI1ioi = iOiooiO.I000OOo1O;
/* 1580 */                          if (lol10ooloiI000oI1ioi == null) {
/* 1592 */                              O11oilI o11oilII00000oIO3 = iio00I0oi.I00000oIO(Resources.getSystem().getConfiguration());
/* 1598 */                              ll0iOo11011i.I00000oOI(4, "initialCapacity");
/* 1601 */                              Object[] objArrCopyOf3 = new Object[4];
/* 1603 */                              int i10 = 0;
/* 1604 */                              int i11 = 0;
/* 1609 */                              while (i10 < o11oilII00000oIO3.I00000oOI()) {
/* 1611 */                                  Locale localeI00000oIO3 = o11oilII00000oIO3.I00000oIO(i10);
/* 1615 */                                  Io0Ool io0Ool3 = IOi0li0I0.I00000oIO;
/* 1617 */                                  String languageTag3 = localeI00000oIO3.toLanguageTag();
/* 1621 */                                  languageTag3.getClass();
/* 1624 */                                  int length3 = objArrCopyOf3.length;
/* 1625 */                                  int i12 = i11 + 1;
/* 1627 */                                  int iI000OiO = IoilIilo.I000OiO(length3, i12);
/* 1631 */                                  if (iI000OiO > length3) {
/* 1634 */                                      objArrCopyOf3 = Arrays.copyOf(objArrCopyOf3, iI000OiO);
                                            }
/* 1638 */                                  objArrCopyOf3[i11] = languageTag3;
/* 1640 */                                  i10++;
/* 1642 */                                  i11 = i12;
                                        }
/* 1646 */                              lol10ooloiI000oI1ioi = lOI1lll1l10.I000oI1ioi(i11, objArrCopyOf3);
/* 1650 */                              iOiooiO.I000OOo1O = lol10ooloiI000oI1ioi;
                                    }
                                } finally {
                                }
                            }
/* 1653 */                  iIlOoolol0ll3.I00ilO0 = lol10ooloiI000oI1ioi;
/* 1657 */                  iIlOoolol0ll3.I00ioIO = Boolean.TRUE;
/* 1659 */                  iIlOoolol0ll3.I00ilI0I1 = str3;
/* 1661 */                  iIlOoolol0ll3.I00iio = str7;
/* 1663 */                  o0IiOl o0iiol3 = ioiooio.I0001Ioi1lo;
/* 1684 */                  iIlOoolol0ll3.I00io1l = o0iiol3.I000OOo1O() ? (String) o0iiol3.I000II() : ioiooio.I0000O.getMlSdkInstanceId();
/* 1690 */                  iIlOoolol0ll3.I00l0OO0IO = 10;
/* 1698 */                  iIlOoolol0ll3.I00li1OI = Integer.valueOf(ioiooio.I000O01llI0);
/* 1700 */                  ooIOol.I00iiO = iIlOoolol0ll3;
/* 1704 */                  ioiooio.I0000Il00O.I00000oIO(ooIOol);
/* 1707 */                  return;
                        case 5:
/* 1511 */                  I00000oOI();
/* 1514 */                  return;
                        case 6:
/* 1055 */                  l1Oli1l l1oli1l = (l1Oli1l) this.I00iiI;
/* 1059 */                  String str8 = (String) this.I00iiO;
/* 1063 */                  liIlli liilli = (liIlli) this.I00iio;
/* 1067 */                  iooliIoiiOlo iooliioiiolo = (iooliIoiiOlo) this.I00ilI0I1;
/* 1069 */                  lilOOl0 lilool0 = l1oli1l.I000II;
/* 1071 */                  lilool0.I00OI1();
/* 1078 */                  lilool0.I00iOIl().I010II();
/* 1081 */                  lilool0.I00iIi0i1o();
/* 1084 */                  iOl1lOo1IO iol1loo1io = lilool0.I00iiO;
/* 1086 */                  lilOOl0.I00O0o1oo(iol1loo1io);
/* 1101 */                  List<liloI0Io> listI010l10O = iol1loo1io.I010l10O(str8, liilli, ((Integer) iol1II1ii1i.I001lllioOl.I00000oIO(null)).intValue());
/* 1107 */                  ArrayList arrayList = new ArrayList();
/* 1118 */                  for (liloI0Io liloi0io : listI010l10O) {
/* 1126 */                      String str9 = liloi0io.I0000Il00O;
/* 1128 */                      long j2 = liloi0io.I000O01llI0;
/* 1130 */                      long j3 = liloi0io.I00000oIO;
/* 1136 */                      if (lilool0.I000o00OoI0I(str8, str9)) {
/* 1156 */                          int i13 = liloi0io.I000OOo1O;
/* 1158 */                          if (i13 > 0) {
/* 1173 */                              if (i13 > ((Integer) iol1II1ii1i.I001l0I00.I00000oIO(null)).intValue()) {
/* 1175 */                                  j = j2;
                                        } else {
/* 1207 */                                  j = j2;
/* 1213 */                                  long jMin = Math.min(((Long) iol1II1ii1i.I001i1lo1io.I00000oIO(null)).longValue() * (1 << (i13 - 1)), ((Long) iol1II1ii1i.I001iOo1i0O.I00000oIO(null)).longValue());
/* 1221 */                                  lilool0.I00IoO0().getClass();
/* 1232 */                                  if (System.currentTimeMillis() >= j + jMin) {
/* 1236 */                                      Bundle bundle = new Bundle();
/* 1253 */                                      for (Map.Entry entry : liloi0io.I0000O.entrySet()) {
/* 1273 */                                          bundle.putString((String) entry.getKey(), (String) entry.getValue());
                                                }
/* 1307 */                                      liIOlO1 liiolo1 = new liIOlO1(liloi0io.I00000oIO, liloi0io.I00000oOI.I00000oIO(), liloi0io.I0000Il00O, bundle, liloi0io.I0000oI00.I00iOIl, liloi0io.I000II, "");
                                                try {
/* 1322 */                                          l0o1OoOIol l0o1oooiol = (l0o1OoOIol) lio010i.I01IlIoOI(l0oiiI0.I001lIiIIo1O(), liiolo1.I00iiI);
/* 1333 */                                          for (int i14 = 0; i14 < ((l0oiiI0) l0o1oooiol.I00iiI).I001IIilI0O(); i14++) {
/* 1347 */                                              l0ooIi1oOO l0ooii1ooo = (l0ooIi1oOO) ((l0oiiI0) l0o1oooiol.I00iiI).I001IO000(i14).I000OiO();
/* 1353 */                                              lilool0.I00IoO0().getClass();
/* 1356 */                                              long jCurrentTimeMillis = System.currentTimeMillis();
/* 1360 */                                              l0ooii1ooo.I0000Il00O();
/* 1367 */                                              ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I00iIi0i1o(jCurrentTimeMillis);
/* 1370 */                                              l0o1oooiol.I0000Il00O();
/* 1383 */                                              ((l0oiiI0) l0o1oooiol.I00iiI).I001lloI(i14, (l100ll0OOIoO) l0ooii1ooo.I0000oI00());
                                                    }
/* 1399 */                                          liiolo1.I00iiI = ((l0oiiI0) l0o1oooiol.I0000oI00()).I00000oIO();
/* 1413 */                                          if (Log.isLoggable(lilool0.I00II0oii1o().I010l1O(), 2)) {
/* 1415 */                                              lio010i lio010iVar = lilool0.I00io1l;
/* 1417 */                                              lilOOl0.I00O0o1oo(lio010iVar);
/* 1430 */                                              liiolo1.I00io1l = lio010iVar.I011olOoO((l0oiiI0) l0o1oooiol.I0000oI00());
                                                    }
/* 1432 */                                          arrayList.add(liiolo1);
                                                } catch (iI00lI unused) {
/* 1446 */                                          lilool0.I00II0oii1o().I00l0I0l0lO1.I0000Il00O("Failed to parse queued batch. appId", str8);
                                                }
                                            }
                                        }
/* 1466 */                              lilool0.I00II0oii1o().I00lll10.I0000oI00("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str8, Long.valueOf(j3), Long.valueOf(j));
                                    }
                                } else {
/* 1152 */                          lilool0.I00II0oii1o().I00lll10.I0000oI00("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str8, Long.valueOf(j3), liloi0io.I0000Il00O);
                                }
                            }
                            try {
/* 1475 */                      iooliioiiolo.I000II(new liO11Oo1loO(arrayList));
/* 1494 */                      lilool0.I00II0oii1o().I00lll10.I0000O(str8, "[sgtm] Sending queued upload batches to client. appId, count", Integer.valueOf(arrayList.size()));
/* 1510 */                      return;
                            } catch (RemoteException e) {
/* 1507 */                      lilool0.I00II0oii1o().I00ilO0.I0000O(str8, "[sgtm] Failed to return upload batches for app", e);
/* 1510 */                      return;
                            }
                        case 7:
/* 960 */                   lOliOlO1Io loliolo1ioI000OOo1O = ((AppMeasurementDynamiteService) this.I00ilI0I1).I000II.I000OOo1O();
/* 966 */                   il0IOO il0ioo = (il0IOO) this.I00iiI;
/* 970 */                   ii0oooi0IO0l ii0oooi0io0l = (ii0oooi0IO0l) this.I00iiO;
/* 974 */                   String str10 = (String) this.I00iio;
/* 976 */                   loliolo1ioI000OOo1O.I010II();
/* 979 */                   loliolo1ioI000OOo1O.I010OIo1l();
/* 984 */                   l0olllO1i l0olllo1i = (l0olllO1i) loliolo1ioI000OOo1O.I00iOIl;
/* 986 */                   lioil0ilIOi lioil0ilioi = l0olllo1i.I00l0I0l0lO1;
/* 988 */                   l0olllO1i.I0000oI00(lioil0ilioi);
/* 1006 */                  if (Io0iI1l01il.I00000oOI.I00000oOI(((l0olllO1i) lioil0ilioi.I00iOIl).I00iOIl, 12451000) != 0) {
/* 1008 */                      l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 1010 */                      l0olllO1i.I000II(l01o0io1ooo0);
/* 1017 */                      l01o0io1ooo0.I00l0I0l0lO1.I00000oOI("Not bundling data. Service unavailable or out of date");
/* 1020 */                      lioil0ilIOi lioil0ilioi2 = l0olllo1i.I00l0I0l0lO1;
/* 1022 */                      l0olllO1i.I0000oI00(lioil0ilioi2);
/* 1027 */                      lioil0ilioi2.I01Io1(il0ioo, new byte[0]);
/* 1052 */                      return;
                            }
/* 1035 */                  IO0iIlI1li iO0iIlI1li = new IO0iIlI1li(14);
/* 1038 */                  iO0iIlI1li.I00iiI = ii0oooi0io0l;
/* 1040 */                  iO0iIlI1li.I00iiO = str10;
/* 1042 */                  iO0iIlI1li.I00iio = il0ioo;
/* 1044 */                  iO0iIlI1li.I00ilI0I1 = loliolo1ioI000OOo1O;
/* 1046 */                  VarHandle.storeStoreFence();
/* 1049 */                  loliolo1ioI000OOo1O.I0110o(iO0iIlI1li);
/* 1052 */                  return;
                        case 8:
/* 676 */                   l1Oli1l l1oli1l2 = (l1Oli1l) this.I00iiI;
/* 682 */                   Bundle bundle2 = (Bundle) this.I00iiO;
/* 687 */                   String str11 = (String) this.I00iio;
/* 692 */                   lli10iI lli10ii = (lli10iI) this.I00ilI0I1;
/* 694 */                   boolean zIsEmpty = bundle2.isEmpty();
/* 698 */                   lilOOl0 lilool02 = l1oli1l2.I000II;
/* 700 */                   if (zIsEmpty) {
/* 702 */                       iOl1lOo1IO iol1loo1io2 = lilool02.I00iiO;
/* 704 */                       lilOOl0.I00O0o1oo(iol1loo1io2);
/* 707 */                       iol1loo1io2.I010II();
/* 710 */                       iol1loo1io2.I010OIo1l();
                                try {
/* 723 */                           iol1loo1io2.I01Io11IiiiO().execSQL("delete from default_event_params where app_id=?", new String[]{str11});
/* 953 */                           return;
                                } catch (SQLiteException e2) {
/* 733 */                           l01O0IO1ooO0 l01o0io1ooo02 = ((l0olllO1i) iol1loo1io2.I00iOIl).I00ilO0;
/* 735 */                           l0olllO1i.I000II(l01o0io1ooo02);
/* 742 */                           l01o0io1ooo02.I00ilO0.I0000Il00O("Error clearing default event params", e2);
/* 953 */                           return;
                                }
                            }
/* 747 */                   iOl1lOo1IO iol1loo1io3 = lilool02.I00iiO;
/* 749 */                   lilOOl0.I00O0o1oo(iol1loo1io3);
/* 754 */                   l0olllO1i l0olllo1i2 = (l0olllO1i) iol1loo1io3.I00iOIl;
/* 756 */                   iol1loo1io3.I010II();
/* 759 */                   iol1loo1io3.I010OIo1l();
/* 779 */                   ii00010lll1 ii00010lll1Var = new ii00010lll1((l0olllO1i) iol1loo1io3.I00iOIl, "", str11, "dep", 0L, 0L, 0L, bundle2);
/* 787 */                   lio010i lio010iVar2 = iol1loo1io3.I00iiI.I00io1l;
/* 789 */                   lilOOl0.I00O0o1oo(lio010iVar2);
/* 796 */                   byte[] bArrI00000oIO = lio010iVar2.I011lOIoo0l(ii00010lll1Var).I00000oIO();
/* 800 */                   l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i2.I00ilO0;
/* 802 */                   l0olllO1i.I000II(l01o0io1ooo03);
/* 814 */                   l01o0io1ooo03.I00lll10.I0000O(str11, "Saving default event parameters, appId, data size", Integer.valueOf(bArrI00000oIO.length));
/* 819 */                   ContentValues contentValues = new ContentValues();
/* 824 */                   contentValues.put("app_id", str11);
/* 829 */                   contentValues.put("parameters", bArrI00000oIO);
                            try {
/* 847 */                       if (iol1loo1io3.I01Io11IiiiO().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
/* 849 */                           l0olllO1i.I000II(l01o0io1ooo03);
/* 860 */                           l01o0io1ooo03.I00ilO0.I0000Il00O("Failed to insert default event parameters (got -1). appId", l01O0IO1ooO0.I010ioo(str11));
                                }
                            } catch (SQLiteException e3) {
/* 865 */                       l0olllO1i.I000II(l01o0io1ooo03);
/* 876 */                       l01o0io1ooo03.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str11), "Error storing default event parameters. appId", e3);
                            }
/* 879 */                   iOl1lOo1IO iol1loo1io4 = lilool02.I00iiO;
/* 881 */                   lilOOl0.I00O0o1oo(iol1loo1io4);
/* 884 */                   long j4 = lli10ii.I00oooO;
                            try {
/* 902 */                       if (iol1loo1io4.I011iiii0i("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str11, String.valueOf(j4)}, 0L) > 0) {
/* 953 */                           return;
                                }
/* 921 */                       if (iol1loo1io4.I011iiii0i("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str11, String.valueOf(j4)}, 0L) > 0) {
/* 923 */                           iOl1lOo1IO iol1loo1io5 = lilool02.I00iiO;
/* 925 */                           lilOOl0.I00O0o1oo(iol1loo1io5);
/* 932 */                           iol1loo1io5.I011Io0I1ioi(str11, Long.valueOf(j4), null, bundle2);
/* 953 */                           return;
                                }
/* 953 */                       return;
                            } catch (SQLiteException e4) {
/* 941 */                       l01O0IO1ooO0 l01o0io1ooo04 = ((l0olllO1i) iol1loo1io4.I00iOIl).I00ilO0;
/* 943 */                       l0olllO1i.I000II(l01o0io1ooo04);
/* 950 */                       l01o0io1ooo04.I00ilO0.I0000Il00O("Error checking backfill conditions", e4);
/* 953 */                       return;
                            }
                        case 9:
/* 620 */                   String str12 = (String) this.I00iiO;
/* 624 */                   String str13 = (String) this.I00iio;
/* 634 */                   lOliOlO1Io loliolo1ioI000OOo1O2 = ((l0olllO1i) ((lIl1O1li) this.I00ilI0I1).I00iOIl).I000OOo1O();
/* 640 */                   AtomicReference atomicReference = (AtomicReference) this.I00iiI;
/* 642 */                   loliolo1ioI000OOo1O2.I010II();
/* 645 */                   loliolo1ioI000OOo1O2.I010OIo1l();
/* 648 */                   lli10iI lli10iiI011IO1I11OI = loliolo1ioI000OOo1O2.I011IO1I11OI(false);
/* 654 */                   iOlO1o iolo1o = new iOlO1o(i);
/* 657 */                   iolo1o.I00iiO = atomicReference;
/* 659 */                   iolo1o.I00iiI = str12;
/* 661 */                   iolo1o.I00iio = str13;
/* 663 */                   iolo1o.I00ilI0I1 = lli10iiI011IO1I11OI;
/* 665 */                   iolo1o.I00ilO0 = loliolo1ioI000OOo1O2;
/* 667 */                   VarHandle.storeStoreFence();
/* 670 */                   loliolo1ioI000OOo1O2.I0110o(iolo1o);
/* 673 */                   return;
                        case 10:
/* 579 */                   Oio0llilli oio0llilli = (Oio0llilli) this.I00iiI;
/* 583 */                   AtomicBoolean atomicBoolean = (AtomicBoolean) this.I00iiO;
/* 587 */                   Context context = (Context) this.I00iio;
/* 591 */                   lIO0IIIo lio0iiio = (lIO0IIIo) this.I00ilI0I1;
/* 597 */                   if ((oio0llilli.I00iOIl instanceof I010i10l) && atomicBoolean.compareAndSet(false, true)) {
                                try {
/* 605 */                           context.unregisterReceiver(lio0iiio);
/* 617 */                           return;
                                } catch (IllegalArgumentException e5) {
/* 614 */                           Log.w("DirectBootUtils", "Failed to unregister receiver", e5);
/* 617 */                           return;
                                }
                            }
/* 617 */                   return;
                        case 11:
/* 472 */                   Oi1ol0llI oi1ol0llI = lO01lIOilo0.I00000oIO;
/* 476 */                   Level level = (Level) this.I00iiI;
/* 480 */                   i1Io0lIii i1io0liii = (i1Io0lIii) oi1ol0llI.I00iiI;
/* 482 */                   boolean zI00000oOI = i1io0liii.I00000oOI(level);
/* 486 */                   String str14 = i1io0liii.I00000oIO;
/* 488 */                   i1IioiiO1 i1iioiio1 = i1IiI1.I00000oIO;
/* 493 */                   ((i1O00ooO) i1iioiio1).getClass();
/* 498 */                   i1O1illoiii.I00000oOI.I00000oIO(str14, level, zI00000oOI);
/* 501 */                   if (zI00000oOI) {
/* 508 */                       o0llO01llII1 o0llo01llii1 = new o0llO01llII1();
/* 511 */                       o0llo01llii1.I000O01llI0 = oi1ol0llI;
/* 513 */                       i1iioiio1.getClass();
/* 522 */                       long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
/* 526 */                       o0llo01llii1.I0000Il00O = null;
/* 528 */                       o0llo01llii1.I0000O = null;
/* 530 */                       o0llo01llii1.I0000oI00 = null;
/* 532 */                       o0llo01llii1.I0001Ioi1lo = null;
/* 534 */                       o0llo01llii1.I000II = null;
/* 538 */                       liOOo1l1O.I00000oIO("level", level);
/* 541 */                       o0llo01llii1.I00000oIO = level;
/* 543 */                       o0llo01llii1.I00000oOI = nanos;
/* 545 */                       VarHandle.storeStoreFence();
/* 548 */                       o0olloo1Var = o0llo01llii1;
                            } else {
/* 503 */                       o0olloo1Var = Oi1ol0llI.I00ilO0;
                            }
/* 573 */                   ((o0ll0Iio) ((o0ll0Iio) o0olloo1Var.I00000oOI((Throwable) this.I00iiO)).zzn()).I00000oIO((String) this.I00iio, (Object[]) this.I00ilI0I1);
/* 576 */                   return;
                        case 12:
/* 423 */                   lOliOlO1Io loliolo1ioI000OOo1O3 = ((AppMeasurementDynamiteService) this.I00ilI0I1).I000II.I000OOo1O();
/* 429 */                   il0IOO il0ioo2 = (il0IOO) this.I00iiI;
/* 433 */                   String str15 = (String) this.I00iiO;
/* 437 */                   String str16 = (String) this.I00iio;
/* 439 */                   loliolo1ioI000OOo1O3.I010II();
/* 442 */                   loliolo1ioI000OOo1O3.I010OIo1l();
/* 445 */                   lli10iI lli10iiI011IO1I11OI2 = loliolo1ioI000OOo1O3.I011IO1I11OI(false);
/* 452 */                   iOlO1o iolo1o2 = new iOlO1o(3);
/* 455 */                   iolo1o2.I00iiI = str15;
/* 457 */                   iolo1o2.I00iio = str16;
/* 459 */                   iolo1o2.I00iiO = lli10iiI011IO1I11OI2;
/* 461 */                   iolo1o2.I00ilI0I1 = il0ioo2;
/* 463 */                   iolo1o2.I00ilO0 = loliolo1ioI000OOo1O3;
/* 465 */                   VarHandle.storeStoreFence();
/* 468 */                   loliolo1ioI000OOo1O3.I0110o(iolo1o2);
/* 471 */                   return;
                        case 13:
/* 413 */                   I0000Il00O();
/* 416 */                   return;
                        case 14:
/* 329 */                   il0IOO il0ioo3 = (il0IOO) this.I00iio;
/* 333 */                   lOliOlO1Io loliolo1io = (lOliOlO1Io) this.I00ilI0I1;
/* 337 */                   l0olllO1i l0olllo1i3 = (l0olllO1i) loliolo1io.I00iOIl;
                            try {
                                try {
/* 339 */                           iolll0ill1iVar = loliolo1io.I00iio;
                                } catch (RemoteException e6) {
/* 383 */                           l01O0IO1ooO0 l01o0io1ooo05 = l0olllo1i3.I00ilO0;
/* 385 */                           l0olllO1i.I000II(l01o0io1ooo05);
/* 392 */                           l01o0io1ooo05.I00ilO0.I0000Il00O("Failed to send event to the service to bundle", e6);
                                }
/* 341 */                       if (iolll0ill1iVar != null) {
/* 372 */                           bArrI00IO1oi11O = iolll0ill1iVar.I00IO1oi11O((String) this.I00iiO, (ii0oooi0IO0l) this.I00iiI);
/* 376 */                           loliolo1io.I0110OiO();
/* 403 */                           return;
                                } else {
/* 343 */                           l01O0IO1ooO0 l01o0io1ooo06 = l0olllo1i3.I00ilO0;
/* 345 */                           l0olllO1i.I000II(l01o0io1ooo06);
/* 352 */                           l01o0io1ooo06.I00ilO0.I00000oOI("Discarding data. Failed to send event to service to bundle");
/* 403 */                           return;
                                }
                            } finally {
/* 404 */                       lioil0ilIOi lioil0ilioi3 = l0olllo1i3.I00l0I0l0lO1;
/* 406 */                       l0olllO1i.I0000oI00(lioil0ilioi3);
/* 409 */                       lioil0ilioi3.I01Io1(il0ioo3, null);
                            }
                        case 15:
/* 323 */                   I0000O();
/* 326 */                   return;
                        case 16:
/* 319 */                   I0000oI00();
/* 322 */                   return;
                        case 17:
/* 315 */                   I0001Ioi1lo();
/* 318 */                   return;
                        case PoseLandmark.RIGHT_PINKY:
/* 246 */                   lilOOl0 lilool03 = (lilOOl0) ((i1Il01) this.I00ilI0I1).I00iiI;
/* 248 */                   lioil0ilIOi lioil0ilioiI00iIO = lilool03.I00iIO();
/* 256 */                   lilool03.I00IoO0().getClass();
/* 259 */                   long jCurrentTimeMillis2 = System.currentTimeMillis();
/* 273 */                   if (lilool03.I00Ol1ll1().I01101IOlO(null, iol1II1ii1i.I01101olii)) {
/* 279 */                       lilool03.I00IoO0().getClass();
/* 282 */                       jElapsedRealtime = SystemClock.elapsedRealtime();
                            }
/* 290 */                   Bundle bundle3 = (Bundle) this.I00iio;
/* 295 */                   String str17 = (String) this.I00iiO;
/* 299 */                   String str18 = (String) this.I00iiI;
/* 304 */                   ii0oooi0IO0l ii0oooi0io0lI01IO1il = lioil0ilioiI00iIO.I01IO1il(str17, bundle3, "auto", jCurrentTimeMillis2, jElapsedRealtime, false);
/* 308 */                   lII0I0I000I.I000II(ii0oooi0io0lI01IO1il);
/* 311 */                   lilool03.I0000Il00O(str18, ii0oooi0io0lI01IO1il);
/* 314 */                   return;
                        case PoseLandmark.LEFT_INDEX:
/* 236 */                   I000II();
/* 239 */                   return;
                        case PoseLandmark.RIGHT_INDEX:
/* 232 */                   I000O01llI0();
/* 235 */                   return;
                        case PoseLandmark.LEFT_THUMB:
/* 228 */                   I000OOo1O();
/* 231 */                   return;
                        case PoseLandmark.RIGHT_THUMB:
/* 224 */                   I000OiO();
/* 227 */                   return;
                        case PoseLandmark.LEFT_HIP:
/* 220 */                   I000iOII();
/* 223 */                   return;
                        case PoseLandmark.RIGHT_HIP:
/* 216 */                   I000l1();
/* 219 */                   return;
                        case PoseLandmark.LEFT_KNEE:
/* 212 */                   I000lI();
/* 215 */                   return;
                        case PoseLandmark.RIGHT_KNEE:
/* 208 */                   I000o00OoI0I();
/* 211 */                   return;
                        default:
/* 19 */                    i1IOoOl i1ioool = (i1IOoOl) this.I00iiI;
/* 23 */                    OoIOol ooIOol2 = (OoIOol) this.I00iiO;
/* 27 */                    lollll0111 lollll0111Var = (lollll0111) this.I00iio;
/* 31 */                    String str19 = (String) this.I00ilI0I1;
/* 35 */                    I1ii1o0 i1ii1o03 = (I1ii1o0) ooIOol2.I00iiI;
/* 37 */                    i1ii1o03.I00iiO = lollll0111Var;
/* 43 */                    o10OoiIiIII o10ooiiiiii = i1ii1o03.I00OI1().I00000oIO;
/* 45 */                    if (o10ooiiiiii == null || (str4 = o10ooiiiiii.I0000O) == null || str4.isEmpty()) {
/* 62 */                        str4 = "NA";
                            } else {
/* 58 */                        lII0I0I000I.I000II(str4);
                            }
/* 68 */                    IIlOoolol0ll iIlOoolol0ll4 = new IIlOoolol0ll(17);
/* 73 */                    iIlOoolol0ll4.I00iiI = i1ioool.I00000oIO;
/* 77 */                    iIlOoolol0ll4.I00iiO = i1ioool.I00000oOI;
                            synchronized (i1IOoOl.class) {
                                try {
/* 82 */                            io1oiii1oloI000lI = i1IOoOl.I000OOo1O;
/* 84 */                            if (io1oiii1oloI000lI == null) {
/* 96 */                                O11oilI o11oilII00000oIO4 = iio00I0oi.I00000oIO(Resources.getSystem().getConfiguration());
/* 100 */                               Object[] objArrCopyOf4 = new Object[4];
/* 102 */                               int i15 = 0;
/* 107 */                               while (i3 < o11oilII00000oIO4.I00000oOI()) {
/* 109 */                                   Locale localeI00000oIO4 = o11oilII00000oIO4.I00000oIO(i3);
/* 113 */                                   Io0Ool io0Ool4 = IOi0li0I0.I00000oIO;
/* 115 */                                   String languageTag4 = localeI00000oIO4.toLanguageTag();
/* 119 */                                   languageTag4.getClass();
/* 122 */                                   int length4 = objArrCopyOf4.length;
/* 123 */                                   int i16 = i15 + 1;
/* 125 */                                   int iI00000oIO2 = lioOO0I.I00000oIO(length4, i16);
/* 129 */                                   if (iI00000oIO2 > length4) {
/* 132 */                                       objArrCopyOf4 = Arrays.copyOf(objArrCopyOf4, iI00000oIO2);
                                            }
/* 136 */                                   objArrCopyOf4[i15] = languageTag4;
/* 138 */                                   i3++;
/* 140 */                                   i15 = i16;
                                        }
/* 144 */                               io1oiii1oloI000lI = io0OO101I.I000lI(i15, objArrCopyOf4);
/* 148 */                               i1IOoOl.I000OOo1O = io1oiii1oloI000lI;
                                    }
                                } finally {
                                }
                            }
/* 151 */                   iIlOoolol0ll4.I00ilO0 = io1oiii1oloI000lI;
/* 155 */                   iIlOoolol0ll4.I00ioIO = Boolean.TRUE;
/* 157 */                   iIlOoolol0ll4.I00ilI0I1 = str4;
/* 159 */                   iIlOoolol0ll4.I00iio = str19;
/* 161 */                   o0IiOl o0iiol4 = i1ioool.I0001Ioi1lo;
/* 182 */                   iIlOoolol0ll4.I00io1l = o0iiol4.I000OOo1O() ? (String) o0iiol4.I000II() : i1ioool.I0000O.getMlSdkInstanceId();
/* 188 */                   iIlOoolol0ll4.I00l0OO0IO = 10;
/* 196 */                   iIlOoolol0ll4.I00li1OI = Integer.valueOf(i1ioool.I000O01llI0);
/* 198 */                   ooIOol2.I00iiO = iIlOoolol0ll4;
/* 202 */                   i1ioool.I0000Il00O.I00000oIO(ooIOol2);
/* 205 */                   return;
                    }
                }
            }
