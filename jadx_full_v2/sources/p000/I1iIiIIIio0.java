            package p000;

            import android.content.ContentResolver;
            import android.content.Context;
            import android.graphics.Bitmap;
            import android.graphics.drawable.BitmapDrawable;
            import android.graphics.drawable.Drawable;
            import android.media.AudioRecord;
            import android.net.Uri;
            import android.os.Bundle;
            import android.provider.Settings;
            import android.util.Log;
            import com.google.ai.edge.gallery.whisper.WhisperEngine;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.jegly.offlineLLM.smollm.SmolLM;
            import java.io.ByteArrayOutputStream;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Objects;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.atomic.AtomicBoolean;
            import kotlin.jvm.functions.Function1;
            
/* 21 */    public final class I1iIiIIIio0 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public Object I00iiI;
                public int I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;
                public Object I00io1l;
                public Object I00ioIO;
                public final Object I00l0I0l0lO1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I1iIiIIIio0(Context context, OI10i0Il oI10i0Il, ByteArrayOutputStream byteArrayOutputStream, OIool0l11 oIool0l11, Function1 function1, Function1 function12, OI10i0Il oI10i0Il2, IOoil1iiIilo iOoil1iiIilo) {
/* 19 */            super(2, iOoil1iiIilo);
/* 2 */             this.I00iOIl = 0;
/* 4 */             this.I00ilI0I1 = context;
/* 6 */             this.I00iiI = oI10i0Il;
/* 8 */             this.I00ilO0 = byteArrayOutputStream;
/* 10 */            this.I00io1l = oIool0l11;
/* 12 */            this.I00ioIO = function1;
/* 14 */            this.I00l0I0l0lO1 = function12;
/* 16 */            this.I00iio = oI10i0Il2;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v0, types: [Ii0111o, OI11ol, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r4v3, types: [OI11ol] */
                private final Object I00000oIO(Object obj) throws Throwable {
                    OI111O oi111o;
                    OI1I0OoOl oI1I0OoOl;
                    Function1 function1;
                    Throwable th;
                    OI111O oi111o2;
                    OI11ol oI11ol;
/* 3 */             OI11IlOoi oI11IlOoi = (OI11IlOoi) this.I00l0I0l0lO1;
/* 5 */             ?? r1 = Ii0111o.I00iOIl;
/* 7 */             int i = this.I00iiO;
                    try {
                        try {
/* 12 */                    if (i == 0) {
/* 68 */                        lIoii1l01l0i.I00000oOI(obj);
/* 93 */                        oi111o = new OI111O((OI110lo) this.I00io1l, (O010OIi) ((Ii0110) this.I00ilO0).I00000oIO().I00lli11(Iioi0lilII.I00iio));
/* 96 */                        oI11IlOoi.I00000oIO(oi111o);
/* 99 */                        oI1I0OoOl = oI11IlOoi.I00000oOI;
/* 103 */                       function1 = (Function1) this.I00ioIO;
/* 105 */                       this.I00ilO0 = oi111o;
/* 107 */                       this.I00ilI0I1 = oI1I0OoOl;
/* 109 */                       this.I00iiI = function1;
/* 111 */                       this.I00iio = oI11IlOoi;
/* 113 */                       this.I00iiO = 1;
/* 119 */                       if (oI1I0OoOl.I00000oIO(this) != r1) {
                                }
/* 138 */                       return r1;
                            }
/* 14 */                    if (i != 1) {
/* 16 */                        if (i != 2) {
/* 40 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                            return null;
                                }
/* 20 */                        oI11IlOoi = (OI11IlOoi) this.I00iiI;
/* 24 */                        oI11ol = (OI11ol) this.I00ilI0I1;
/* 28 */                        oi111o2 = (OI111O) this.I00ilO0;
                                try {
/* 30 */                            lIoii1l01l0i.I00000oOI(obj);
/* 144 */                           oI11IlOoi.I00000oIO.compareAndSet(oi111o2, null);
/* 147 */                           oI11ol.I00000oOI(null);
/* 150 */                           return obj;
                                } catch (Throwable th2) {
/* 35 */                            th = th2;
/* 159 */                           oI11IlOoi.I00000oIO.compareAndSet(oi111o2, null);
/* 162 */                           throw th;
                                }
                            }
/* 46 */                    oI11IlOoi = (OI11IlOoi) this.I00iio;
/* 50 */                    Function1 function12 = (Function1) this.I00iiI;
/* 54 */                    ?? r4 = (OI11ol) this.I00ilI0I1;
/* 58 */                    OI111O oi111o3 = (OI111O) this.I00ilO0;
/* 60 */                    lIoii1l01l0i.I00000oOI(obj);
/* 64 */                    function1 = function12;
/* 65 */                    oi111o = oi111o3;
/* 66 */                    oI1I0OoOl = r4;
/* 122 */                   this.I00ilO0 = oi111o;
/* 124 */                   this.I00ilI0I1 = oI1I0OoOl;
/* 126 */                   this.I00iiI = oI11IlOoi;
/* 128 */                   this.I00iio = null;
/* 130 */                   this.I00iiO = 2;
/* 132 */                   Object objInvoke = function1.invoke(this);
/* 136 */                   if (objInvoke != r1) {
/* 139 */                       oI11ol = oI1I0OoOl;
/* 140 */                       obj = objInvoke;
/* 141 */                       oi111o2 = oi111o;
/* 144 */                       oI11IlOoi.I00000oIO.compareAndSet(oi111o2, null);
/* 147 */                       oI11ol.I00000oOI(null);
/* 150 */                       return obj;
                            }
/* 138 */                   return r1;
                        } catch (Throwable th3) {
/* 155 */                   th = th3;
/* 156 */                   oi111o2 = oi111o;
/* 159 */                   oI11IlOoi.I00000oIO.compareAndSet(oi111o2, null);
/* 162 */                   throw th;
                        }
                    } catch (Throwable th4) {
/* 163 */               r1.I00000oOI(null);
/* 168 */               throw th4;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private final Object I000II(Object obj) throws Throwable {
                    OOo0l0ii10l oOo0l0ii10l;
                    Ool1lo ool1lo;
                    OlO1ooI0i olO1ooI0i;
                    OlOI1O olOI1O;
                    OI11ol oI11ol;
                    OlO1ooI0i olO1ooI0i2;
/* 3 */             OlOI1O olOI1O2 = (OlOI1O) this.I00io1l;
/* 7 */             OlO1ooI0i olO1ooI0i3 = (OlO1ooI0i) this.I00l0I0l0lO1;
/* 9 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 11 */            int i = this.I00iiO;
/* 16 */            if (i == 0) {
/* 67 */                lIoii1l01l0i.I00000oOI(obj);
/* 72 */                oOo0l0ii10l = new OOo0l0ii10l();
/* 75 */                oOo0l0ii10l.I00iOIl = true;
/* 77 */                Ool1lo ool1lo2 = olOI1O2.I0000O;
/* 79 */                if (ool1lo2 == null || O0000Ioio00.I0000O((Ool1lo) this.I00ioIO, ool1lo2)) {
/* 122 */                   if (oOo0l0ii10l.I00iOIl) {
/* 124 */                       OI1I0OoOl oI1I0OoOl = olOI1O2.I0000Il00O;
/* 126 */                       this.I00ilI0I1 = oI1I0OoOl;
/* 128 */                       this.I00iiI = olOI1O2;
/* 130 */                       this.I00iio = olO1ooI0i3;
/* 132 */                       this.I00ilO0 = null;
/* 134 */                       this.I00iiO = 2;
/* 140 */                       if (oI1I0OoOl.I00000oIO(this) != ii0111o) {
/* 143 */                           oI11ol = oI1I0OoOl;
/* 144 */                           olO1ooI0i2 = olO1ooI0i3;
/* 147 */                           olOI1O2.I0000oI00.add(olO1ooI0i2);
/* 150 */                           oI11ol.I00000oOI(null);
/* 160 */                           if (l11I11lO.I0000O(3, "CXCP")) {
                                    }
                                }
                            }
/* 171 */                   return OoiIlOl1iI.I00000oIO;
                        }
/* 91 */                this.I00ilI0I1 = oOo0l0ii10l;
/* 93 */                this.I00iiI = olO1ooI0i3;
/* 95 */                this.I00iio = ool1lo2;
/* 97 */                this.I00ilO0 = olOI1O2;
/* 99 */                this.I00iiO = 1;
/* 101 */               Object objI0000Il00O = olOI1O2.I0000Il00O(olO1ooI0i3, ool1lo2, this);
/* 105 */               if (objI0000Il00O != ii0111o) {
/* 108 */                   ool1lo = ool1lo2;
/* 109 */                   olO1ooI0i = olO1ooI0i3;
/* 110 */                   obj = objI0000Il00O;
/* 111 */                   olOI1O = olOI1O2;
                        }
/* 142 */               return ii0111o;
                    }
/* 18 */            if (i != 1) {
/* 20 */                if (i != 2) {
/* 43 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 15 */                    return null;
                        }
/* 24 */                OlO1ooI0i olO1ooI0i4 = (OlO1ooI0i) this.I00iio;
/* 28 */                OlOI1O olOI1O3 = (OlOI1O) this.I00iiI;
/* 32 */                oI11ol = (OI11ol) this.I00ilI0I1;
/* 34 */                lIoii1l01l0i.I00000oOI(obj);
/* 37 */                olO1ooI0i2 = olO1ooI0i4;
/* 38 */                olOI1O2 = olOI1O3;
                        try {
/* 147 */                   olOI1O2.I0000oI00.add(olO1ooI0i2);
/* 150 */                   oI11ol.I00000oOI(null);
/* 160 */                   if (l11I11lO.I0000O(3, "CXCP")) {
/* 162 */                       Objects.toString(olO1ooI0i3);
                            }
/* 171 */                   return OoiIlOl1iI.I00000oIO;
                        } catch (Throwable th) {
/* 167 */                   oI11ol.I00000oOI(null);
/* 170 */                   throw th;
                        }
                    }
/* 49 */            olOI1O = (OlOI1O) this.I00ilO0;
/* 53 */            ool1lo = (Ool1lo) this.I00iio;
/* 57 */            olO1ooI0i = (OlO1ooI0i) this.I00iiI;
/* 61 */            oOo0l0ii10l = (OOo0l0ii10l) this.I00ilI0I1;
/* 63 */            lIoii1l01l0i.I00000oOI(obj);
/* 114 */           olOI1O.I00000oIO((IiIOI1ol0o) obj, olO1ooI0i, ool1lo);
/* 118 */           oOo0l0ii10l.I00iOIl = false;
/* 122 */           if (oOo0l0ii10l.I00iOIl) {
                    }
/* 171 */           return OoiIlOl1iI.I00000oIO;
                }

                /* JADX WARN: Removed duplicated region for block: B:32:0x0090 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:8:0x002e, B:38:0x00b2, B:30:0x0088, B:32:0x0090, B:34:0x009b), top: B:45:0x002e }] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00b0 -> B:38:0x00b2). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private final Object I000O01llI0(Object obj) throws Throwable {
                    Ool1lo ool1lo;
                    Ool1lo ool1lo2;
                    OI11ol oI11ol;
                    OI11ol oI11ol2;
                    Ool1lo ool1lo3;
/* 3 */             OlOI1O olOI1O = (OlOI1O) this.I00l0I0l0lO1;
/* 5 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 7 */             int i = this.I00iiO;
/* 9 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 15 */            if (i == 0) {
/* 85 */                lIoii1l01l0i.I00000oOI(obj);
/* 88 */                Ool1lo ool1lo4 = olOI1O.I0000O;
/* 90 */                if (ool1lo4 != null) {
/* 94 */                    this.I00ilI0I1 = ool1lo4;
/* 96 */                    this.I00iiO = 1;
/* 98 */                    Object objI0000oI00 = ool1lo4.I0000oI00(this);
/* 102 */                   if (objI0000oI00 != ii0111o) {
/* 106 */                       ool1lo = ool1lo4;
/* 107 */                       obj = objI0000oI00;
                            }
/* 176 */                   return ii0111o;
                        }
/* 437 */               return ooiIlOl1iI;
                    }
/* 17 */            if (i != 1) {
/* 19 */                if (i == 2) {
/* 63 */                    olOI1O = (OlOI1O) this.I00iio;
/* 67 */                    oI11ol = (OI11ol) this.I00iiI;
/* 71 */                    ool1lo2 = (Ool1lo) this.I00ilI0I1;
/* 73 */                    lIoii1l01l0i.I00000oOI(obj);
/* 135 */                   oI11ol2 = oI11ol;
/* 136 */                   ool1lo3 = ool1lo2;
/* 143 */                   while (!olOI1O.I0000oI00.isEmpty()) {
                            }
/* 190 */                   return ooiIlOl1iI;
                        }
/* 21 */                if (i != 3) {
/* 57 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                    return null;
                        }
/* 25 */                olOI1O = (OlOI1O) this.I00ioIO;
/* 29 */                ool1lo3 = (Ool1lo) this.I00io1l;
/* 33 */                OlO1ooI0i olO1ooI0i = (OlO1ooI0i) this.I00ilO0;
/* 37 */                OlOI1O olOI1O2 = (OlOI1O) this.I00iio;
/* 41 */                oI11ol2 = (OI11ol) this.I00iiI;
/* 45 */                Ool1lo ool1lo5 = (Ool1lo) this.I00ilI0I1;
                        try {
/* 47 */                    lIoii1l01l0i.I00000oOI(obj);
/* 181 */                   olOI1O.I00000oIO((IiIOI1ol0o) obj, olO1ooI0i, ool1lo3);
/* 184 */                   olOI1O = olOI1O2;
/* 185 */                   ool1lo3 = ool1lo5;
/* 143 */                   while (!olOI1O.I0000oI00.isEmpty()) {
/* 152 */                       olO1ooI0i = (OlO1ooI0i) olOI1O.I0000oI00.poll();
/* 154 */                       if (olO1ooI0i != null) {
/* 156 */                           this.I00ilI0I1 = ool1lo3;
/* 158 */                           this.I00iiI = oI11ol2;
/* 160 */                           this.I00iio = olOI1O;
/* 162 */                           this.I00ilO0 = olO1ooI0i;
/* 164 */                           this.I00io1l = ool1lo3;
/* 166 */                           this.I00ioIO = olOI1O;
/* 168 */                           this.I00iiO = 3;
/* 170 */                           obj = olOI1O.I0000Il00O(olO1ooI0i, ool1lo3, this);
/* 174 */                           if (obj != ii0111o) {
/* 177 */                               olOI1O2 = olOI1O;
/* 178 */                               ool1lo5 = ool1lo3;
/* 181 */                               olOI1O.I00000oIO((IiIOI1ol0o) obj, olO1ooI0i, ool1lo3);
/* 184 */                               olOI1O = olOI1O2;
/* 185 */                               ool1lo3 = ool1lo5;
/* 143 */                               while (!olOI1O.I0000oI00.isEmpty()) {
                                        }
                                    }
/* 176 */                           return ii0111o;
                                }
                            }
/* 190 */                   return ooiIlOl1iI;
                        } finally {
/* 191 */                   oI11ol2.I00000oOI(null);
                        }
                    }
/* 79 */            ool1lo = (Ool1lo) this.I00ilI0I1;
/* 81 */            lIoii1l01l0i.I00000oOI(obj);
/* 114 */           if (((Boolean) obj).booleanValue()) {
/* 116 */               OI1I0OoOl oI1I0OoOl = olOI1O.I0000Il00O;
/* 118 */               this.I00ilI0I1 = ool1lo;
/* 120 */               this.I00iiI = oI1I0OoOl;
/* 122 */               this.I00iio = olOI1O;
/* 124 */               this.I00iiO = 2;
/* 130 */               if (oI1I0OoOl.I00000oIO(this) != ii0111o) {
/* 133 */                   ool1lo2 = ool1lo;
/* 134 */                   oI11ol = oI1I0OoOl;
/* 135 */                   oI11ol2 = oI11ol;
/* 136 */                   ool1lo3 = ool1lo2;
/* 143 */                   while (!olOI1O.I0000oI00.isEmpty()) {
                            }
/* 190 */                   return ooiIlOl1iI;
                        }
/* 176 */               return ii0111o;
                    }
/* 437 */           return ooiIlOl1iI;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00l0I0l0lO1;
                    switch (i) {
                        case 0:
/* 341 */                   return new I1iIiIIIio0((Context) this.I00ilI0I1, (OI10i0Il) this.I00iiI, (ByteArrayOutputStream) this.I00ilO0, (OIool0l11) this.I00io1l, (Function1) this.I00ioIO, (Function1) obj2, (OI10i0Il) this.I00iio, iOoil1iiIilo);
                        case 1:
/* 301 */                   return new I1iIiIIIio0((I1o1Ii0I) this.I00ilI0I1, (Bitmap) this.I00ilO0, (OI10i0Il) this.I00iio, (OI10i0Il) this.I00io1l, (OI10i0Il) this.I00ioIO, (OI10i0Il) obj2, iOoil1iiIilo);
                        case 2:
/* 265 */                   return new I1iIiIIIio0((Il0OiIi) this.I00ilI0I1, (OOo0ooi) this.I00iiI, (OOo0ooi) this.I00iio, (IoiOl011o) this.I00ilO0, this.I00io1l, (OOo0ooi) this.I00ioIO, (Il10il1) obj2, iOoil1iiIilo, 2);
                        case 3:
/* 227 */                   return new I1iIiIIIio0((Il0OiIi) this.I00ilI0I1, (IoiOl011o) this.I00iiI, this.I00iio, (OIil0IlIIol) this.I00ilO0, (Il10il1) this.I00io1l, (O1il00oooo) this.I00ioIO, (OOlli1l1lOlI) obj2, iOoil1iiIilo, 3);
                        case 4:
/* 189 */                   return new I1iIiIIIio0((IlI1loI1lO1) this.I00ilO0, (Context) this.I00ilI0I1, (O1oIOiI11o0) this.I00io1l, (Bitmap) this.I00ioIO, (AtomicBoolean) obj2, (OI10i0Il) this.I00iio, iOoil1iiIilo);
                        case 5:
/* 153 */                   return new I1iIiIIIio0((O1111l) this.I00ilI0I1, (String) this.I00iiI, (Ol1OIlllo) this.I00iio, (String) this.I00ilO0, (List) this.I00io1l, (I0iI0O1IoIoI) this.I00ioIO, (II0O1i0I1) obj2, iOoil1iiIilo, 5);
                        case 6:
/* 112 */                   return new I1iIiIIIio0((O1i0O00) this.I00iio, (String) this.I00ilO0, (String) this.I00io1l, (O1i1O1I) this.I00ioIO, (String) obj2, iOoil1iiIilo);
                        case 7:
/* 79 */                    I1iIiIIIio0 i1iIiIIIio0 = new I1iIiIIIio0((OI110lo) this.I00io1l, (OI11IlOoi) obj2, (Function1) this.I00ioIO, iOoil1iiIilo);
/* 82 */                    i1iIiIIIio0.I00ilO0 = obj;
/* 84 */                    return i1iIiIIIio0;
                        case 8:
/* 62 */                    return new I1iIiIIIio0((OlOI1O) this.I00io1l, (Ool1lo) this.I00ioIO, (OlO1ooI0i) obj2, iOoil1iiIilo);
                        case 9:
/* 45 */                    return new I1iIiIIIio0((OlOI1O) obj2, iOoil1iiIilo);
                        default:
/* 34 */                    I1iIiIIIio0 i1iIiIIIio02 = new I1iIiIIIio0((ContentResolver) this.I00ilO0, (Uri) this.I00io1l, (i0100lioil) this.I00ioIO, (IIIII1OI1) obj2, (Context) this.I00ilI0I1, iOoil1iiIilo);
/* 37 */                    i1iIiIIIio02.I00iio = obj;
/* 39 */                    return i1iIiIIIio02;
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 168 */                   return ((I1iIiIIIio0) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 1:
/* 153 */                   return ((I1iIiIIIio0) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 2:
/* 138 */                   return ((I1iIiIIIio0) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 3:
/* 123 */                   return ((I1iIiIIIio0) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 4:
/* 108 */                   return ((I1iIiIIIio0) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 5:
/* 93 */                    return ((I1iIiIIIio0) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 6:
/* 78 */                    return ((I1iIiIIIio0) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 7:
/* 63 */                    return ((I1iIiIIIio0) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 8:
/* 48 */                    return ((I1iIiIIIio0) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 9:
/* 33 */                    return ((I1iIiIIIio0) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        default:
/* 18 */                    return ((I1iIiIIIio0) create((IlOil1iooOO0) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:145:0x0363, code lost:
                
                    if (r0.load(r4, r3, r30) == r8) goto L166;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:165:0x03f1, code lost:
                
                    if (p000.iOi1II01i0.I0000oI00(r1, r2, r30) != r8) goto L167;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:258:0x060e, code lost:
                
                    if (r0 == r6) goto L259;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x009e, code lost:
                
                    if (r4.emit(r7, r30) == r0) goto L27;
                 */
                /* JADX WARN: Removed duplicated region for block: B:100:0x0275 A[Catch: Exception -> 0x01ec, TryCatch #1 {Exception -> 0x01ec, blocks: (B:97:0x025b, B:98:0x026f, B:100:0x0275, B:102:0x0288, B:103:0x028c, B:105:0x029d, B:107:0x02a3, B:93:0x0240, B:76:0x01cd, B:81:0x01dd, B:83:0x01e1, B:86:0x01ef, B:88:0x020e, B:89:0x021c), top: B:288:0x01cd }] */
                /* JADX WARN: Removed duplicated region for block: B:107:0x02a3 A[Catch: Exception -> 0x01ec, TRY_LEAVE, TryCatch #1 {Exception -> 0x01ec, blocks: (B:97:0x025b, B:98:0x026f, B:100:0x0275, B:102:0x0288, B:103:0x028c, B:105:0x029d, B:107:0x02a3, B:93:0x0240, B:76:0x01cd, B:81:0x01dd, B:83:0x01e1, B:86:0x01ef, B:88:0x020e, B:89:0x021c), top: B:288:0x01cd }] */
                /* JADX WARN: Removed duplicated region for block: B:112:0x02d6  */
                /* JADX WARN: Removed duplicated region for block: B:117:0x02eb  */
                /* JADX WARN: Removed duplicated region for block: B:154:0x039d A[Catch: Exception -> 0x0347, CancellationException -> 0x03f8, TryCatch #10 {CancellationException -> 0x03f8, Exception -> 0x0347, blocks: (B:132:0x0342, B:135:0x034a, B:152:0x0397, B:154:0x039d, B:155:0x03a2, B:156:0x03aa, B:158:0x03b0, B:159:0x03c4, B:147:0x0367, B:149:0x036b, B:162:0x03dc, B:163:0x03dd), top: B:295:0x0329 }] */
                /* JADX WARN: Removed duplicated region for block: B:158:0x03b0 A[Catch: Exception -> 0x0347, CancellationException -> 0x03f8, LOOP:3: B:156:0x03aa->B:158:0x03b0, LOOP_END, TryCatch #10 {CancellationException -> 0x03f8, Exception -> 0x0347, blocks: (B:132:0x0342, B:135:0x034a, B:152:0x0397, B:154:0x039d, B:155:0x03a2, B:156:0x03aa, B:158:0x03b0, B:159:0x03c4, B:147:0x0367, B:149:0x036b, B:162:0x03dc, B:163:0x03dd), top: B:295:0x0329 }] */
                /* JADX WARN: Removed duplicated region for block: B:161:0x03db  */
                /* JADX WARN: Removed duplicated region for block: B:194:0x04a0  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x007a A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #2 {all -> 0x0036, blocks: (B:9:0x002d, B:19:0x0060, B:23:0x0072, B:25:0x007a, B:15:0x0046, B:18:0x005a), top: B:290:0x001f }] */
                /* JADX WARN: Removed duplicated region for block: B:28:0x00a2 A[DONT_GENERATE] */
                /* JADX WARN: Removed duplicated region for block: B:96:0x025a  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009e -> B:10:0x0030). Please report as a decompilation issue!!! */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Exception {
                    OI10i0Il oI10i0Il;
                    Object objI0000oI00;
                    OI10i0Il oI10i0Il2;
                    Object objI0000oI002;
                    Object objI00000oOI;
                    OOlliOiioo oOlliOiioo;
                    Bitmap bitmap;
                    boolean z;
                    Object objI0000oI003;
                    OI10i0Il oI10i0Il3;
                    Io11l1li io11l1li;
                    O00lOIIO o00lOIIO;
                    String str;
                    OoiIlOl1iI ooiIlOl1iI;
                    Object value;
                    O1i1IIoO1IIl o1i1IIoO1IIl;
                    String message;
                    FirebaseAnalytics firebaseAnalyticsI00000oIO;
                    O1i0l0IO0i1 o1i0l0IO0i1;
                    Ii0111o ii0111o;
                    String str2;
                    Object objI000OOo1O;
                    O1i1Ooo0ll o1i1Ooo0ll;
                    String str3;
                    String str4;
                    Ii1I1ooo10O0 ii1I1ooo10O0;
                    I0O0il1iIl i0O0il1iIl;
                    O1i1Ooo0ll o1i1Ooo0ll2;
                    Object value2;
                    O1i1IIoO1IIl o1i1IIoO1IIl2;
                    ArrayList arrayList;
                    FirebaseAnalytics firebaseAnalyticsI00000oIO2;
                    IlOil1iooOO0 ilOil1iooOO0;
                    IIII0iI10 it;
                    Object objI00000oOI2;
                    IlOil1iooOO0 ilOil1iooOO02;
                    IIII0iI10 iIII0iI10;
/* 3 */             int i = this.I00iOIl;
/* 8 */             OoiIlOl1iI ooiIlOl1iI2 = OoiIlOl1iI.I00000oIO;
/* 13 */            Object obj2 = this.I00l0I0l0lO1;
                    switch (i) {
                        case 0:
/* 1591 */                  Function1 function1 = (Function1) obj2;
/* 1595 */                  OI10i0Il oI10i0Il4 = (OI10i0Il) this.I00iiI;
/* 1599 */                  oI10i0Il = (OI10i0Il) this.I00iio;
/* 1601 */                  Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 1603 */                  int i2 = this.I00iiO;
/* 1605 */                  if (i2 == 0) {
/* 1623 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1636 */                      if (((Boolean) oI10i0Il.getValue()).booleanValue()) {
/* 1755 */                          function1.invoke(iOOOoIOlo.I00000oOI(oI10i0Il4, (ByteArrayOutputStream) this.I00ilO0));
                                } else {
/* 1640 */                          oI10i0Il.setValue(Boolean.TRUE);
/* 1645 */                          ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.I00ilO0;
/* 1651 */                          OIool0l11 oIool0l11 = (OIool0l11) this.I00io1l;
/* 1657 */                          Function1 function12 = (Function1) this.I00ioIO;
/* 1662 */                          I0IoO01lIoO i0IoO01lIoO = new I0IoO01lIoO(6);
/* 1665 */                          i0IoO01lIoO.I00iiO = oI10i0Il4;
/* 1667 */                          i0IoO01lIoO.I00iiI = byteArrayOutputStream;
/* 1669 */                          i0IoO01lIoO.I00iio = function1;
/* 1671 */                          i0IoO01lIoO.I00ilI0I1 = oI10i0Il;
/* 1673 */                          VarHandle.storeStoreFence();
/* 1677 */                          this.I00iiO = 1;
/* 1684 */                          int minBufferSize = AudioRecord.getMinBufferSize(WhisperEngine.SAMPLE_RATE, 16, 2);
/* 1692 */                          AudioRecord audioRecord = (AudioRecord) oI10i0Il4.getValue();
/* 1694 */                          if (audioRecord != null) {
/* 1696 */                              audioRecord.release();
                                    }
/* 1709 */                          AudioRecord audioRecord2 = new AudioRecord(1, WhisperEngine.SAMPLE_RATE, 16, 2, minBufferSize);
/* 1712 */                          oI10i0Il4.setValue(audioRecord2);
/* 1734 */                          Object objI0000Il00O = il001oo1.I0000Il00O(new I1iIiio(audioRecord2, oIool0l11, oI10i0Il4, new byte[minBufferSize], function12, byteArrayOutputStream, i0IoO01lIoO, null), this);
/* 1738 */                          if (objI0000Il00O != ii0111o2) {
/* 1741 */                              objI0000Il00O = ooiIlOl1iI2;
                                    }
/* 1743 */                          if (objI0000Il00O == ii0111o2) {
/* 1745 */                              return ii0111o2;
                                    }
                                }
                            } else {
/* 1608 */                      if (i2 != 1) {
/* 1617 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 1590 */                          return null;
                                }
/* 1610 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1613 */                  return ooiIlOl1iI2;
                        case 1:
/* 1401 */                  OI10i0Il oI10i0Il5 = (OI10i0Il) this.I00io1l;
/* 1405 */                  I1o1Ii0I i1o1Ii0I = (I1o1Ii0I) this.I00ilI0I1;
/* 1409 */                  oI10i0Il = (OI10i0Il) this.I00iio;
/* 1413 */                  Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 1415 */                  int i3 = this.I00iiO;
                            try {
                                try {
                                } catch (Exception e) {
/* 1577 */                          oI10i0Il5.setValue("Processing failed: " + e.getMessage());
                                }
/* 1417 */                      if (i3 == 0) {
/* 1455 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1460 */                          oI10i0Il.setValue(Boolean.TRUE);
/* 1464 */                          this.I00iiO = 1;
/* 1466 */                          i1o1Ii0I.getClass();
/* 1469 */                          IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 1480 */                          objI0000oI00 = iOi1II01i0.I0000oI00(Ii1oo1ooill0.I00iiI, new I0II0OiI(i1o1Ii0I, (IOoil1iiIilo) null, 5), this);
/* 1484 */                          if (objI0000oI00 == ii0111o3) {
                                    }
/* 1553 */                          return ii0111o3;
                                }
/* 1420 */                      if (i3 != 1) {
/* 1423 */                          if (i3 != 2) {
/* 1443 */                              I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 1446 */                              return null;
                                    }
/* 1427 */                          OI10i0Il oI10i0Il6 = (OI10i0Il) this.I00iiI;
/* 1429 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1432 */                          oI10i0Il2 = oI10i0Il6;
/* 1433 */                          objI0000oI002 = obj;
/* 1557 */                          oI10i0Il2.setValue((Bitmap) objI0000oI002);
/* 1505 */                          return ooiIlOl1iI2;
                                }
/* 1449 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1452 */                      objI0000oI00 = obj;
/* 1493 */                      if (!((Boolean) objI0000oI00).booleanValue()) {
/* 1497 */                          oI10i0Il5.setValue("ML Kit model unavailable — requires Google Play Services");
/* 1505 */                          return ooiIlOl1iI2;
                                }
/* 1509 */                      oI10i0Il2 = (OI10i0Il) obj2;
/* 1513 */                      Bitmap bitmap2 = (Bitmap) this.I00ilO0;
/* 1525 */                      boolean zBooleanValue = ((Boolean) ((OI10i0Il) this.I00ioIO).getValue()).booleanValue();
/* 1529 */                      this.I00iiI = oI10i0Il2;
/* 1532 */                      this.I00iiO = 2;
/* 1534 */                      i1o1Ii0I.getClass();
/* 1537 */                      IiI0oillOO10 iiI0oillOO102 = IiiIil1lOIO.I00000oIO;
/* 1547 */                      objI0000oI002 = iOi1II01i0.I0000oI00(Ii1oo1ooill0.I00iiI, new I1o0o1(i1o1Ii0I, bitmap2, zBooleanValue, (IOoil1iiIilo) null), this);
                                break;
                            } finally {
/* 1584 */                      oI10i0Il.setValue(Boolean.FALSE);
                            }
                        case 2:
/* 1323 */                  Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 1325 */                  int i4 = this.I00iiO;
/* 1327 */                  if (i4 == 0) {
/* 1343 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1383 */                      this.I00iiO = 1;
/* 1388 */                      Object objI00000oIO = ((Il0OiIi) this.I00ilI0I1).I00000oIO((OlIIO11IoO1) ((OOo0ooi) this.I00iiI).I00iOIl, (IOiOll1i) ((OOo0ooi) this.I00iio).I00iOIl, (IoiOl011o) this.I00ilO0, this.I00io1l, (OIil0IlIIol) ((OOo0ooi) this.I00ioIO).I00iOIl, (Il10il1) obj2, this);
                                return objI00000oIO == ii0111o4 ? ii0111o4 : objI00000oIO;
                            }
/* 1330 */                  if (i4 == 1) {
/* 1332 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1335 */                      return obj;
                            }
/* 1338 */                  I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 1341 */                  return null;
                        case 3:
/* 1111 */                  Il0OiIi il0OiIi = (Il0OiIi) this.I00ilI0I1;
/* 1116 */                  O1il00oooo o1il00oooo = (O1il00oooo) this.I00ioIO;
/* 1118 */                  Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 1120 */                  int i5 = this.I00iiO;
/* 1122 */                  if (i5 == 0) {
/* 1139 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1144 */                      IoiOl011o ioiOl011o = (IoiOl011o) this.I00iiI;
/* 1146 */                      Object obj3 = this.I00iio;
/* 1150 */                      OIil0IlIIol oIil0IlIIol = (OIil0IlIIol) this.I00ilO0;
/* 1154 */                      Il10il1 il10il1 = (Il10il1) this.I00io1l;
/* 1157 */                      this.I00iiO = 1;
/* 1159 */                      objI00000oOI = il0OiIi.I00000oOI(ioiOl011o, obj3, oIil0IlIIol, il10il1, this);
/* 1163 */                      if (objI00000oOI == ii0111o5) {
/* 1165 */                          return ii0111o5;
                                }
                            } else {
/* 1125 */                      if (i5 != 1) {
/* 1133 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 1136 */                          return null;
                                }
/* 1127 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1130 */                      objI00000oOI = obj;
                            }
/* 1168 */                  Il0OI1oiIoil il0OI1oiIoil = (Il0OI1oiIoil) objI00000oOI;
/* 1170 */                  iiOlilo0IIIl iiolilo0iiil = il0OiIi.I0000Il00O;
/* 1174 */                  IoiOl011o ioiOl011o2 = (IoiOl011o) this.I00iiI;
/* 1176 */                  iiolilo0iiil.getClass();
/* 1183 */                  if (ioiOl011o2.I000o00OoI0I.I00iiI && (oOlliOiioo = (OOlliOiioo) ((OOllOII) iiolilo0iiil.I00iOIl).I00000oOI.getValue()) != null && o1il00oooo != null) {
/* 1204 */                      Drawable drawable = il0OI1oiIoil.I00000oIO;
/* 1213 */                      BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
/* 1214 */                      if (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) {
/* 1185 */                          z = false;
                                } else {
/* 1225 */                          LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 1236 */                          linkedHashMap.put("coil#is_sampled", Boolean.valueOf(il0OI1oiIoil.I00000oOI));
/* 1239 */                          String str5 = il0OI1oiIoil.I0000O;
/* 1241 */                          if (str5 != null) {
/* 1245 */                              linkedHashMap.put("coil#disk_cache_key", str5);
                                    }
/* 1267 */                          oOlliOiioo.I00000oIO.I0000oI00(new O1il00oooo(o1il00oooo.I00iOIl, iO1o1Io1.I00000oOI(o1il00oooo.I00iiI)), bitmap, iO1o1Io1.I00000oOI(linkedHashMap));
/* 1270 */                          z = true;
                                }
                            }
/* 1271 */                  Drawable drawable2 = il0OI1oiIoil.I00000oIO;
/* 1277 */                  IoiOl011o ioiOl011o3 = (IoiOl011o) this.I00iiI;
/* 1279 */                  Ii1I1OOilolI ii1I1OOilolI = il0OI1oiIoil.I0000Il00O;
/* 1286 */                  O1il00oooo o1il00oooo2 = z ? o1il00oooo : null;
/* 1288 */                  String str6 = il0OI1oiIoil.I0000O;
/* 1290 */                  boolean z2 = il0OI1oiIoil.I00000oOI;
/* 1292 */                  OOlli1l1lOlI oOlli1l1lOlI = (OOlli1l1lOlI) obj2;
/* 1294 */                  Bitmap.Config[] configArr = I000O01llI0.I00000oIO;
/* 1317 */                  return new OliOlO1o1(drawable2, ioiOl011o3, ii1I1OOilolI, o1il00oooo2, str6, z2, oOlli1l1lOlI != null && oOlli1l1lOlI.I00iiI);
                        case 4:
/* 1021 */                  Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 1023 */                  int i6 = this.I00iiO;
/* 1025 */                  if (i6 == 0) {
/* 1045 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1050 */                      OI10i0Il oI10i0Il7 = (OI10i0Il) this.I00iio;
/* 1055 */                      IlI1loI1lO1 ilI1loI1lO1 = (IlI1loI1lO1) this.I00ilO0;
/* 1060 */                      Context context = (Context) this.I00ilI0I1;
/* 1065 */                      O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) this.I00io1l;
/* 1070 */                      Bitmap bitmap3 = (Bitmap) this.I00ioIO;
/* 1072 */                      this.I00iiI = oI10i0Il7;
/* 1075 */                      this.I00iiO = 1;
/* 1085 */                      objI0000oI003 = iOi1II01i0.I0000oI00(IiiIil1lOIO.I00000oIO, new IlI1ii0(o1oIOiI11o0, bitmap3, ilI1loI1lO1, context, null), this);
/* 1089 */                      if (objI0000oI003 == ii0111o6) {
/* 1091 */                          return ii0111o6;
                                }
/* 1093 */                      oI10i0Il3 = oI10i0Il7;
                            } else {
/* 1028 */                      if (i6 != 1) {
/* 1040 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 1043 */                          return null;
                                }
/* 1032 */                      oI10i0Il3 = (OI10i0Il) this.I00iiI;
/* 1034 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1037 */                      objI0000oI003 = obj;
                            }
/* 1096 */                  oI10i0Il3.setValue((O110ooO1O) objI0000oI003);
/* 1102 */                  ((AtomicBoolean) obj2).set(false);
/* 1105 */                  return ooiIlOl1iI2;
                        case 5:
/* 787 */                   String str7 = (String) this.I00ilO0;
/* 792 */                   Ol1OIlllo ol1OIlllo = (Ol1OIlllo) this.I00iio;
/* 797 */                   String str8 = (String) this.I00iiI;
/* 802 */                   O1111l o1111l = (O1111l) this.I00ilI0I1;
/* 806 */                   Ii0111o ii0111o7 = Ii0111o.I00iOIl;
/* 808 */                   int i7 = this.I00iiO;
                            try {
                                try {
                                } catch (CancellationException e2) {
/* 1018 */                          throw e2;
                                } catch (Exception e3) {
/* 991 */                           IiI0oillOO10 iiI0oillOO103 = IiiIil1lOIO.I00000oIO;
/* 993 */                           Io11l1li io11l1li2 = O1OI1l011OO1.I00000oIO;
/* 1001 */                          O00lOIIO o00lOIIO2 = new O00lOIIO((II0O1i0I1) obj2, e3, null, 4);
/* 1004 */                          this.I00iiO = 4;
                                    break;
                                }
                            } catch (CancellationException e4) {
/* 990 */                       throw e4;
                            } catch (Exception e5) {
/* 874 */                       if (ol1OIlllo.I000iOII <= 0) {
/* 989 */                           throw e5;
                                }
/* 899 */                       Log.w("LlamaCppEngine", "GPU-accelerated load failed (" + e5.getMessage() + "); retrying on CPU");
/* 902 */                       Ol1OIlllo ol1OIllloI00000oIO = Ol1OIlllo.I00000oIO(ol1OIlllo);
/* 906 */                       o1111l.I0000Il00O = ol1OIllloI00000oIO;
/* 908 */                       SmolLM smolLM = o1111l.I00000oIO;
/* 911 */                       this.I00iiO = 2;
/* 917 */                       if (smolLM.load(str8, ol1OIllloI00000oIO, this) == ii0111o7) {
                                }
                            }
/* 810 */                   if (i7 == 0) {
/* 856 */                       lIoii1l01l0i.I00000oOI(obj);
/* 859 */                       SmolLM smolLM2 = o1111l.I00000oIO;
/* 862 */                       this.I00iiO = 1;
                                break;
                            } else {
/* 813 */                       if (i7 != 1) {
/* 816 */                           if (i7 != 2) {
/* 819 */                               if (i7 == 3 || i7 == 4) {
/* 824 */                                   lIoii1l01l0i.I00000oOI(obj);
/* 1014 */                                  return ooiIlOl1iI2;
                                        }
/* 829 */                               I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 832 */                               return null;
                                    }
/* 843 */                           lIoii1l01l0i.I00000oOI(obj);
/* 924 */                           if (!OlOoOIi0o.I001l0I00(str7)) {
/* 928 */                               o1111l.I00000oIO.addSystemPrompt(str7);
                                    }
/* 943 */                           for (OIoi0IIoi oIoi0IIoi : (List) this.I00io1l) {
/* 961 */                               o1111l.I00000oIO.addChatMessage((String) oIoi0IIoi.I00iOIl, (String) oIoi0IIoi.I00iiI);
                                    }
/* 965 */                           IiI0oillOO10 iiI0oillOO104 = IiiIil1lOIO.I00000oIO;
/* 967 */                           io11l1li = O1OI1l011OO1.I00000oIO;
/* 977 */                           o00lOIIO = new O00lOIIO(o1111l, (I0iI0O1IoIoI) this.I00ioIO, null, 3);
/* 980 */                           this.I00iiO = 3;
/* 986 */                           if (iOi1II01i0.I0000oI00(io11l1li, o00lOIIO, this) == ii0111o7) {
/* 1012 */                              return ii0111o7;
                                    }
/* 1014 */                          return ooiIlOl1iI2;
                                }
/* 847 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 924 */                   if (!OlOoOIi0o.I001l0I00(str7)) {
                            }
/* 943 */                   while (r0.hasNext()) {
                            }
/* 965 */                   IiI0oillOO10 iiI0oillOO1042 = IiiIil1lOIO.I00000oIO;
/* 967 */                   io11l1li = O1OI1l011OO1.I00000oIO;
/* 977 */                   o00lOIIO = new O00lOIIO(o1111l, (I0iI0O1IoIoI) this.I00ioIO, null, 3);
/* 980 */                   this.I00iiO = 3;
/* 986 */                   if (iOi1II01i0.I0000oI00(io11l1li, o00lOIIO, this) == ii0111o7) {
                            }
/* 1014 */                  return ooiIlOl1iI2;
                        case 6:
/* 188 */                   O1i1O1I o1i1O1I = (O1i1O1I) this.I00ioIO;
/* 190 */                   OlO0OIIl1 olO0OIIl1 = o1i1O1I.I0000O;
/* 193 */                   String str9 = (String) obj2;
/* 197 */                   Ii0111o ii0111o8 = Ii0111o.I00iOIl;
/* 199 */                   int i8 = this.I00iiO;
                            try {
                            } catch (Exception e6) {
/* 231 */                       e = e6;
/* 209 */                       str = "mcp_management";
                            }
/* 211 */                   if (i8 == 0) {
/* 276 */                       lIoii1l01l0i.I00000oOI(obj);
/* 279 */                       O1i0i00O1 o1i0i00O1I001IIilI0O = O1i0l0IO0i1.I001IIilI0O();
/* 287 */                       int iOrdinal = ((O1i0O00) this.I00iio).ordinal();
/* 291 */                       if (iOrdinal == 0) {
/* 372 */                           o1i0i00O1I001IIilI0O.I0000O();
/* 379 */                           ((O1i0l0IO0i1) o1i0i00O1I001IIilI0O.I00iiI).I001IO000();
                                } else if (iOrdinal == 1) {
/* 323 */                           O1i0ii0i0 o1i0ii0i0I001IIilI0O = O1i0iliilI.I001IIilI0O();
/* 329 */                           String str10 = (String) this.I00ilO0;
/* 331 */                           o1i0ii0i0I001IIilI0O.I0000O();
/* 338 */                           ((O1i0iliilI) o1i0ii0i0I001IIilI0O.I00iiI).I001IO000(str10);
/* 343 */                           String str11 = (String) this.I00io1l;
/* 345 */                           o1i0ii0i0I001IIilI0O.I0000O();
/* 352 */                           ((O1i0iliilI) o1i0ii0i0I001IIilI0O.I00iiI).I001i1O0Ol(str11);
/* 359 */                           O1i0iliilI o1i0iliilI = (O1i0iliilI) o1i0ii0i0I001IIilI0O.I00000oOI();
/* 361 */                           o1i0i00O1I001IIilI0O.I0000O();
/* 368 */                           ((O1i0l0IO0i1) o1i0i00O1I001IIilI0O.I00iiI).I001i1lo1io(o1i0iliilI);
                                } else if (iOrdinal != 2) {
/* 297 */                           o1i0i00O1I001IIilI0O.I0000O();
/* 304 */                           ((O1i0l0IO0i1) o1i0i00O1I001IIilI0O.I00iiI).I001IO000();
                                } else {
/* 308 */                           O1i0ii0 o1i0ii0I0010I0i = O1i0ii0.I0010I0i();
/* 312 */                           o1i0i00O1I001IIilI0O.I0000O();
/* 319 */                           ((O1i0l0IO0i1) o1i0i00O1I001IIilI0O.I00iiI).I001i1O0Ol(o1i0ii0I0010I0i);
                                }
/* 387 */                       o1i0l0IO0i1 = (O1i0l0IO0i1) o1i0i00O1I001IIilI0O.I00000oOI();
/* 390 */                       String str12 = (String) obj2;
/* 392 */                       this.I00ilI0I1 = o1i0l0IO0i1;
/* 394 */                       this.I00iiO = 1;
/* 209 */                       str = "mcp_management";
/* 401 */                       ii0111o = ii0111o8;
/* 195 */                       str2 = "Tools: ";
                                try {
/* 404 */                           objI000OOo1O = o1i1O1I.I000OOo1O(str12, null, null, o1i0l0IO0i1, this);
/* 408 */                           if (objI000OOo1O == ii0111o) {
                                    }
/* 600 */                           return ii0111o;
                                } catch (Exception e7) {
/* 473 */                           e = e7;
/* 233 */                           ooiIlOl1iI = ooiIlOl1iI2;
/* 711 */                           Log.e("AGMcpManagerVM", "Error adding MCP server: " + str9, e);
/* 740 */                           do {
/* 714 */                               value = olO0OIIl1.getValue();
/* 719 */                               o1i1IIoO1IIl = (O1i1IIoO1IIl) value;
/* 721 */                               message = e.getMessage();
/* 725 */                               if (message == null) {
                                        }
/* 740 */                           } while (!olO0OIIl1.I000iOII(value, O1i1IIoO1IIl.I00000oIO(o1i1IIoO1IIl, null, false, message, 1)));
/* 742 */                           firebaseAnalyticsI00000oIO = iOIii1ooOi0I.I00000oIO();
/* 746 */                           if (firebaseAnalyticsI00000oIO != null) {
                                    }
/* 779 */                           return ooiIlOl1iI;
                                }
                            }
/* 213 */                   if (i8 != 1) {
/* 215 */                       if (i8 == 2) {
/* 245 */                           o1i1Ooo0ll = (O1i1Ooo0ll) this.I00iiI;
/* 249 */                           o1i0l0IO0i1 = (O1i0l0IO0i1) this.I00ilI0I1;
/* 251 */                           lIoii1l01l0i.I00000oOI(obj);
/* 209 */                           str = "mcp_management";
/* 255 */                           ii0111o = ii0111o8;
/* 256 */                           ooiIlOl1iI = ooiIlOl1iI2;
/* 577 */                           ii1I1ooo10O0 = o1i1O1I.I0000Il00O;
/* 584 */                           i0O0il1iIl = new I0O0il1iIl(str9, o1i0l0IO0i1, (IOoil1iiIilo) null, 22);
/* 587 */                           this.I00ilI0I1 = null;
/* 589 */                           this.I00iiI = o1i1Ooo0ll;
/* 592 */                           this.I00iiO = 3;
/* 598 */                           if (ii1I1ooo10O0.I00000oIO(i0O0il1iIl, this) != ii0111o) {
/* 603 */                               o1i1Ooo0ll2 = o1i1Ooo0ll;
/* 668 */                               do {
/* 604 */                                   value2 = olO0OIIl1.getValue();
/* 609 */                                   o1i1IIoO1IIl2 = (O1i1IIoO1IIl) value2;
/* 611 */                                   List list = o1i1IIoO1IIl2.I00000oIO;
/* 617 */                                   arrayList = new ArrayList();
/* 628 */                                   while (r3.hasNext()) {
                                            }
/* 668 */                               } while (!olO0OIIl1.I000iOII(value2, O1i1IIoO1IIl.I00000oIO(o1i1IIoO1IIl2, IOOi0Ool1i.I00OI1(arrayList, o1i1Ooo0ll2), false, null, 4)));
/* 670 */                               firebaseAnalyticsI00000oIO2 = iOIii1ooOi0I.I00000oIO();
/* 674 */                               if (firebaseAnalyticsI00000oIO2 != null) {
                                        }
/* 779 */                               return ooiIlOl1iI;
                                    }
/* 600 */                           return ii0111o;
                                }
/* 217 */                       if (i8 != 3) {
/* 237 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 240 */                           return null;
                                }
/* 221 */                       o1i1Ooo0ll2 = (O1i1Ooo0ll) this.I00iiI;
/* 223 */                       lIoii1l01l0i.I00000oOI(obj);
/* 209 */                       str = "mcp_management";
/* 227 */                       ooiIlOl1iI = ooiIlOl1iI2;
/* 668 */                       do {
/* 604 */                           value2 = olO0OIIl1.getValue();
/* 609 */                           o1i1IIoO1IIl2 = (O1i1IIoO1IIl) value2;
/* 611 */                           List list2 = o1i1IIoO1IIl2.I00000oIO;
/* 617 */                           arrayList = new ArrayList();
/* 628 */                           for (Object obj4 : list2) {
/* 647 */                               if (!O0000Ioio00.I0000O(((O1i1Ooo0ll) obj4).I00000oIO.I001i1O0Ol(), str9)) {
/* 649 */                                   arrayList.add(obj4);
                                        }
                                    }
/* 668 */                       } while (!olO0OIIl1.I000iOII(value2, O1i1IIoO1IIl.I00000oIO(o1i1IIoO1IIl2, IOOi0Ool1i.I00OI1(arrayList, o1i1Ooo0ll2), false, null, 4)));
/* 670 */                       firebaseAnalyticsI00000oIO2 = iOIii1ooOi0I.I00000oIO();
/* 674 */                       if (firebaseAnalyticsI00000oIO2 != null) {
/* 676 */                           Ilo0li0l1[] ilo0li0l1Arr = Ilo0li0l1.I00iOIl;
/* 680 */                           Bundle bundle = new Bundle();
/* 683 */                           bundle.putString("action", "add_server");
/* 688 */                           bundle.putString("status", "success");
/* 691 */                           firebaseAnalyticsI00000oIO2.I00000oIO(str, bundle);
                                }
/* 779 */                       return ooiIlOl1iI;
                            }
/* 262 */                   O1i0l0IO0i1 o1i0l0IO0i12 = (O1i0l0IO0i1) this.I00ilI0I1;
/* 264 */                   lIoii1l01l0i.I00000oOI(obj);
/* 267 */                   o1i0l0IO0i1 = o1i0l0IO0i12;
/* 209 */                   str = "mcp_management";
/* 269 */                   ii0111o = ii0111o8;
/* 195 */                   str2 = "Tools: ";
/* 272 */                   objI000OOo1O = obj;
/* 412 */                   OIoi0IIoi oIoi0IIoi2 = (OIoi0IIoi) objI000OOo1O;
/* 416 */                   IOIo001i1o iOIo001i1o = (IOIo001i1o) oIoi0IIoi2.I00iOIl;
/* 420 */                   List list3 = (List) oIoi0IIoi2.I00iiI;
/* 422 */                   IoioIli11o ioioIli11o = iOIo001i1o.I000oI1ioi;
/* 424 */                   O1i1OO0O10Io o1i1OO0O10IoI001iOo1i0O = O1i1OolO.I001iOo1i0O();
/* 428 */                   o1i1OO0O10IoI001iOo1i0O.I0000O();
/* 437 */                   ((O1i1OolO) o1i1OO0O10IoI001iOo1i0O.I00iiI).I001lloI(str9);
/* 444 */                   o1i1OO0O10IoI001iOo1i0O.I000II(list3);
/* 448 */                   o1i1OO0O10IoI001iOo1i0O.I000O01llI0(true);
/* 451 */                   if (ioioIli11o == null || (str4 = ioioIli11o.I00000oIO) == null) {
/* 470 */                       ooiIlOl1iI = ooiIlOl1iI2;
                            } else {
/* 457 */                       o1i1OO0O10IoI001iOo1i0O.I0000O();
/* 460 */                       ooiIlOl1iI = ooiIlOl1iI2;
                                try {
/* 466 */                           ((O1i1OolO) o1i1OO0O10IoI001iOo1i0O.I00iiI).I001lllioOl(str4);
                                } catch (Exception e8) {
/* 493 */                           e = e8;
/* 711 */                           Log.e("AGMcpManagerVM", "Error adding MCP server: " + str9, e);
/* 740 */                           do {
/* 714 */                               value = olO0OIIl1.getValue();
/* 719 */                               o1i1IIoO1IIl = (O1i1IIoO1IIl) value;
/* 721 */                               message = e.getMessage();
/* 725 */                               if (message == null) {
/* 727 */                                   message = "Failed to connect";
                                        }
/* 740 */                           } while (!olO0OIIl1.I000iOII(value, O1i1IIoO1IIl.I00000oIO(o1i1IIoO1IIl, null, false, message, 1)));
/* 742 */                           firebaseAnalyticsI00000oIO = iOIii1ooOi0I.I00000oIO();
/* 746 */                           if (firebaseAnalyticsI00000oIO != null) {
/* 748 */                               Ilo0li0l1[] ilo0li0l1Arr2 = Ilo0li0l1.I00iOIl;
/* 752 */                               Bundle bundle2 = new Bundle();
/* 755 */                               bundle2.putString("action", "add_server");
/* 760 */                               bundle2.putString("status", "failed");
/* 773 */                               bundle2.putString("error_type", e.getClass().getSimpleName());
/* 776 */                               firebaseAnalyticsI00000oIO.I00000oIO(str, bundle2);
                                    }
/* 779 */                           return ooiIlOl1iI;
                                }
                            }
/* 476 */                   if (ioioIli11o != null && (str3 = ioioIli11o.I00000oOI) != null) {
/* 482 */                       o1i1OO0O10IoI001iOo1i0O.I0000O();
/* 489 */                       ((O1i1OolO) o1i1OO0O10IoI001iOo1i0O.I00iiI).I00II0Ol1O0l(str3);
                            }
/* 517 */                   String strI00IlilI0i0i = IOOi0Ool1i.I00IlilI0i0i(list3, ", ", null, null, new O0o01OIl(17), 30);
/* 525 */                   if (strI00IlilI0i0i.length() > 0) {
/* 527 */                       String strConcat = str2.concat(strI00IlilI0i0i);
/* 531 */                       o1i1OO0O10IoI001iOo1i0O.I0000O();
/* 538 */                       ((O1i1OolO) o1i1OO0O10IoI001iOo1i0O.I00iiI).I001l0I00(strConcat);
                            }
/* 545 */                   O1i1OolO o1i1OolO = (O1i1OolO) o1i1OO0O10IoI001iOo1i0O.I00000oOI();
/* 550 */                   O1i1Ooo0ll o1i1Ooo0ll3 = new O1i1Ooo0ll(o1i1OolO, iOIo001i1o, null);
/* 553 */                   Ii1I1ooo10O0 ii1I1ooo10O02 = o1i1O1I.I00000oOI;
/* 559 */                   I0O0il1iIl i0O0il1iIl2 = new I0O0il1iIl((Object) o1i1OolO, str9, (IOoil1iiIilo) null, 21);
/* 562 */                   this.I00ilI0I1 = o1i0l0IO0i1;
/* 564 */                   this.I00iiI = o1i1Ooo0ll3;
/* 567 */                   this.I00iiO = 2;
/* 573 */                   if (ii1I1ooo10O02.I00000oIO(i0O0il1iIl2, this) == ii0111o) {
/* 600 */                       return ii0111o;
                            }
/* 576 */                   o1i1Ooo0ll = o1i1Ooo0ll3;
/* 577 */                   ii1I1ooo10O0 = o1i1O1I.I0000Il00O;
/* 584 */                   i0O0il1iIl = new I0O0il1iIl(str9, o1i0l0IO0i1, (IOoil1iiIilo) null, 22);
/* 587 */                   this.I00ilI0I1 = null;
/* 589 */                   this.I00iiI = o1i1Ooo0ll;
/* 592 */                   this.I00iiO = 3;
/* 598 */                   if (ii1I1ooo10O0.I00000oIO(i0O0il1iIl, this) != ii0111o) {
                            }
/* 600 */                   return ii0111o;
                        case 7:
/* 181 */                   return I00000oIO(obj);
                        case 8:
/* 176 */                   return I000II(obj);
                        case 9:
/* 171 */                   return I000O01llI0(obj);
                        default:
/* 21 */                    i0100lioil i0100lioilVar = (i0100lioil) this.I00ioIO;
/* 26 */                    ContentResolver contentResolver = (ContentResolver) this.I00ilO0;
/* 28 */                    Ii0111o ii0111o9 = Ii0111o.I00iOIl;
/* 30 */                    int i9 = this.I00iiO;
                            try {
/* 32 */                        if (i9 == 0) {
/* 77 */                            lIoii1l01l0i.I00000oOI(obj);
/* 82 */                            ilOil1iooOO0 = (IlOil1iooOO0) this.I00iio;
/* 88 */                            contentResolver.registerContentObserver((Uri) this.I00io1l, false, i0100lioilVar);
/* 93 */                            it = ((IIIII1OI1) obj2).iterator();
/* 97 */                            this.I00iio = ilOil1iooOO0;
/* 99 */                            this.I00iiI = it;
/* 101 */                           this.I00iiO = 1;
/* 103 */                           objI00000oOI2 = it.I00000oOI(this);
/* 107 */                           if (objI00000oOI2 != ii0111o9) {
                                    }
                                } else if (i9 == 1) {
/* 65 */                            iIII0iI10 = (IIII0iI10) this.I00iiI;
/* 69 */                            ilOil1iooOO02 = (IlOil1iooOO0) this.I00iio;
/* 71 */                            lIoii1l01l0i.I00000oOI(obj);
/* 74 */                            objI00000oOI2 = obj;
/* 121 */                           if (((Boolean) objI00000oOI2).booleanValue()) {
                                    }
                                } else {
/* 36 */                            if (i9 != 2) {
/* 58 */                                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 61 */                                return null;
                                    }
/* 40 */                            iIII0iI10 = (IIII0iI10) this.I00iiI;
/* 44 */                            ilOil1iooOO02 = (IlOil1iooOO0) this.I00iio;
/* 46 */                            lIoii1l01l0i.I00000oOI(obj);
/* 49 */                            IlOil1iooOO0 ilOil1iooOO03 = ilOil1iooOO02;
/* 51 */                            it = iIII0iI10;
/* 52 */                            ilOil1iooOO0 = ilOil1iooOO03;
/* 97 */                            this.I00iio = ilOil1iooOO0;
/* 99 */                            this.I00iiI = it;
/* 101 */                           this.I00iiO = 1;
/* 103 */                           objI00000oOI2 = it.I00000oOI(this);
/* 107 */                           if (objI00000oOI2 != ii0111o9) {
/* 161 */                               return ii0111o9;
                                    }
/* 110 */                           IIII0iI10 iIII0iI102 = it;
/* 112 */                           ilOil1iooOO02 = ilOil1iooOO0;
/* 113 */                           iIII0iI10 = iIII0iI102;
/* 121 */                           if (((Boolean) objI00000oOI2).booleanValue()) {
/* 166 */                               return ooiIlOl1iI2;
                                    }
/* 123 */                           iIII0iI10.I0000Il00O();
/* 128 */                           Context context2 = (Context) this.I00ilI0I1;
/* 130 */                           OI10I1IoI0Ol oI10I1IoI0Ol = i0101iOI1I.I00000oIO;
/* 146 */                           Float f = new Float(Settings.Global.getFloat(context2.getContentResolver(), "animator_duration_scale", 1.0f));
/* 149 */                           this.I00iio = ilOil1iooOO02;
/* 151 */                           this.I00iiI = iIII0iI10;
/* 153 */                           this.I00iiO = 2;
                                    break;
                                }
                            } finally {
/* 167 */                       contentResolver.unregisterContentObserver(i0100lioilVar);
                            }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 22 */        public I1iIiIIIio0(IlI1loI1lO1 ilI1loI1lO1, Context context, O1oIOiI11o0 o1oIOiI11o0, Bitmap bitmap, AtomicBoolean atomicBoolean, OI10i0Il oI10i0Il, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 4;
/* 23 */            this.I00ilO0 = ilI1loI1lO1;
                    this.I00ilI0I1 = context;
                    this.I00io1l = o1oIOiI11o0;
                    this.I00ioIO = bitmap;
                    this.I00l0I0l0lO1 = atomicBoolean;
                    this.I00iio = oI10i0Il;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 23 */        public I1iIiIIIio0(O1i0O00 o1i0O00, String str, String str2, O1i1O1I o1i1O1I, String str3, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 6;
/* 24 */            this.I00iio = o1i0O00;
                    this.I00ilO0 = str;
                    this.I00io1l = str2;
                    this.I00ioIO = o1i1O1I;
                    this.I00l0I0l0lO1 = str3;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 24 */        public I1iIiIIIio0(OI110lo oI110lo, OI11IlOoi oI11IlOoi, Function1 function1, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 7;
/* 25 */            this.I00io1l = oI110lo;
                    this.I00l0I0l0lO1 = oI11IlOoi;
                    this.I00ioIO = function1;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 25 */        public I1iIiIIIio0(OlOI1O olOI1O, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 9;
/* 26 */            this.I00l0I0l0lO1 = olOI1O;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 26 */        public I1iIiIIIio0(OlOI1O olOI1O, Ool1lo ool1lo, OlO1ooI0i olO1ooI0i, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 8;
/* 27 */            this.I00io1l = olOI1O;
                    this.I00ioIO = ool1lo;
                    this.I00l0I0l0lO1 = olO1ooI0i;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 27 */        public I1iIiIIIio0(ContentResolver contentResolver, Uri uri, i0100lioil i0100lioilVar, IIIII1OI1 iiiii1oi1, Context context, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 10;
/* 28 */            this.I00ilO0 = contentResolver;
                    this.I00io1l = uri;
                    this.I00ioIO = i0100lioilVar;
                    this.I00l0I0l0lO1 = iiiii1oi1;
                    this.I00ilI0I1 = context;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 28 */        public I1iIiIIIio0(I1o1Ii0I i1o1Ii0I, Bitmap bitmap, OI10i0Il oI10i0Il, OI10i0Il oI10i0Il2, OI10i0Il oI10i0Il3, OI10i0Il oI10i0Il4, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 1;
/* 29 */            this.I00ilI0I1 = i1o1Ii0I;
                    this.I00ilO0 = bitmap;
                    this.I00iio = oI10i0Il;
                    this.I00io1l = oI10i0Il2;
                    this.I00ioIO = oI10i0Il3;
                    this.I00l0I0l0lO1 = oI10i0Il4;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 29 */        public I1iIiIIIio0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 30 */            this.I00iOIl = i;
                    this.I00ilI0I1 = obj;
                    this.I00iiI = obj2;
                    this.I00iio = obj3;
                    this.I00ilO0 = obj4;
                    this.I00io1l = obj5;
                    this.I00ioIO = obj6;
                    this.I00l0I0l0lO1 = obj7;
                }
            }
