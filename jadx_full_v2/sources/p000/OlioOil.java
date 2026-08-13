            package p000;

            import android.graphics.Matrix;
            import android.graphics.Rect;
            import android.util.Size;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.concurrent.Executor;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class OlioOil {
                public final int I00000oIO;
                public final Matrix I00000oOI;
                public final boolean I0000Il00O;
                public final Rect I0000O;
                public final boolean I0000oI00;
                public final int I0001Ioi1lo;
                public final I1lIoOIi I000II;
                public int I000O01llI0;
                public int I000OOo1O;
                public Oll0I0l1i1 I000iOII;
                public OlioII I000l1;
                public boolean I000OiO = false;
                public final HashSet I000lI = new HashSet();
                public boolean I000o00OoI0I = false;
                public final ArrayList I000oI1ioi = new ArrayList();

                public OlioOil(int i, int i2, I1lIoOIi i1lIoOIi, Matrix matrix, boolean z, Rect rect, int i3, int i4, boolean z2) {
/* 23 */            this.I0001Ioi1lo = i;
/* 25 */            this.I00000oIO = i2;
/* 27 */            this.I000II = i1lIoOIi;
/* 29 */            this.I00000oOI = matrix;
/* 31 */            this.I0000Il00O = z;
/* 33 */            this.I0000O = rect;
/* 35 */            this.I000OOo1O = i3;
/* 37 */            this.I000O01llI0 = i4;
/* 39 */            this.I0000oI00 = z2;
/* 48 */            this.I000l1 = new OlioII(i2, i1lIoOIi.I00000oIO);
                }

                public final void I00000oIO() {
/* 7 */             lII1OI11o1I.I0000oI00("Edge is already closed.", !this.I000o00OoI0I);
                }

                public final void I00000oOI() {
/* 1 */             lOllIO.I00000oIO();
/* 6 */             this.I000l1.I00000oIO();
/* 10 */            this.I000o00OoI0I = true;
/* 14 */            this.I000oI1ioi.clear();
/* 19 */            this.I000lI.clear();
                }

                public final IO0oo1I0oIO I0000Il00O(int i, I1lIol0O i1lIol0O, I1lIol0O i1lIol0O2) {
/* 1 */             lOllIO.I00000oIO();
/* 4 */             I00000oIO();
/* 13 */            lII1OI11o1I.I0000oI00("Consumer can only be linked once.", !this.I000OiO);
/* 16 */            this.I000OiO = true;
/* 18 */            OlioII olioII = this.I000l1;
/* 20 */            ListenableFuture listenableFutureI0000Il00O = olioII.I0000Il00O();
/* 26 */            Olio10lOii olio10lOii = new Olio10lOii();
/* 29 */            olio10lOii.I00iOIl = this;
/* 31 */            olio10lOii.I00iiI = olioII;
/* 33 */            olio10lOii.I00iiO = i;
/* 35 */            olio10lOii.I00iio = i1lIol0O;
/* 37 */            olio10lOii.I00ilI0I1 = i1lIol0O2;
/* 39 */            VarHandle.storeStoreFence();
/* 46 */            return iIllIoiiIO.I000O01llI0(listenableFutureI0000Il00O, olio10lOii, O1OIIoio0i1.I0000O());
                }

                public final Oll0I0l1i1 I0000O(IIllOo0 iIllOo0, boolean z) {
/* 1 */             lOllIO.I00000oIO();
/* 4 */             I00000oIO();
/* 9 */             I1lIoOIi i1lIoOIi = this.I000II;
/* 11 */            Size size = i1lIoOIi.I00000oIO;
/* 13 */            Iio1oiI iio1oiI = i1lIoOIi.I0000Il00O;
/* 17 */            int i = 0;
/* 18 */            Olio0OIill olio0OIill = new Olio0OIill(i);
/* 21 */            olio0OIill.I00iiI = this;
/* 23 */            VarHandle.storeStoreFence();
/* 26 */            Oll0I0l1i1 oll0I0l1i1 = new Oll0I0l1i1();
/* 34 */            oll0I0l1i1.I00000oIO = new Object();
/* 36 */            oll0I0l1i1.I00000oOI = size;
/* 38 */            oll0I0l1i1.I0000O = iIllOo0;
/* 40 */            oll0I0l1i1.I0000oI00 = z;
/* 48 */            lII1OI11o1I.I00000oIO("SurfaceRequest's DynamicRange must always be fully specified.", iio1oiI.I00000oOI());
/* 51 */            oll0I0l1i1.I0000Il00O = iio1oiI;
/* 80 */            String str = "SurfaceRequest[size: " + size + ", id: " + oll0I0l1i1.hashCode() + "]";
/* 87 */            AtomicReference atomicReference = new AtomicReference(null);
/* 92 */            Oll00l oll00l = new Oll00l(0);
/* 95 */            oll00l.I00iiI = atomicReference;
/* 97 */            oll00l.I00iiO = str;
/* 99 */            VarHandle.storeStoreFence();
/* 102 */           IIiOiI0il iIiOiI0ilI00000oIO = iOiiloIII0O.I00000oIO(oll00l);
/* 110 */           IIiOOI iIiOOI = (IIiOOI) atomicReference.get();
/* 112 */           iIiOOI.getClass();
/* 115 */           oll0I0l1i1.I000OiO = iIiOOI;
/* 119 */           AtomicReference atomicReference2 = new AtomicReference(null);
/* 124 */           int i2 = 1;
/* 125 */           Oll00l oll00l2 = new Oll00l(1);
/* 128 */           oll00l2.I00iiI = atomicReference2;
/* 130 */           oll00l2.I00iiO = str;
/* 132 */           VarHandle.storeStoreFence();
/* 135 */           IIiOiI0il iIiOiI0ilI00000oIO2 = iOiiloIII0O.I00000oIO(oll00l2);
/* 139 */           oll0I0l1i1.I000O01llI0 = iIiOiI0ilI00000oIO2;
/* 145 */           I1I0i0Ilo1Oi i1I0i0Ilo1Oi = new I1I0i0Ilo1Oi(28);
/* 148 */           i1I0i0Ilo1Oi.I00iiI = iIiOOI;
/* 150 */           i1I0i0Ilo1Oi.I00iiO = iIiOiI0ilI00000oIO;
/* 152 */           VarHandle.storeStoreFence();
/* 159 */           iIllIoiiIO.I00000oIO(iIiOiI0ilI00000oIO2, i1I0i0Ilo1Oi, Iii11l.I00000oIO());
/* 166 */           IIiOOI iIiOOI2 = (IIiOOI) atomicReference2.get();
/* 168 */           iIiOOI2.getClass();
/* 173 */           AtomicReference atomicReference3 = new AtomicReference(null);
/* 179 */           Oll00l oll00l3 = new Oll00l(2);
/* 182 */           oll00l3.I00iiI = atomicReference3;
/* 184 */           oll00l3.I00iiO = str;
/* 186 */           VarHandle.storeStoreFence();
/* 189 */           IIiOiI0il iIiOiI0ilI00000oIO3 = iOiiloIII0O.I00000oIO(oll00l3);
/* 193 */           oll0I0l1i1.I0001Ioi1lo = iIiOiI0ilI00000oIO3;
/* 199 */           IIiOOI iIiOOI3 = (IIiOOI) atomicReference3.get();
/* 201 */           iIiOOI3.getClass();
/* 204 */           oll0I0l1i1.I000II = iIiOOI3;
/* 208 */           IoilI00 ioilI00 = new IoilI00(oll0I0l1i1, size);
/* 211 */           oll0I0l1i1.I000iOII = ioilI00;
/* 215 */           ListenableFuture listenableFutureI0000oI00 = iIllIoiiIO.I0000oI00(ioilI00.I0000oI00);
/* 221 */           OlilOlOiI olilOlOiI = new OlilOlOiI(i2);
/* 224 */           olilOlOiI.I00iiI = listenableFutureI0000oI00;
/* 226 */           olilOlOiI.I00iiO = iIiOOI2;
/* 228 */           olilOlOiI.I00iio = str;
/* 230 */           VarHandle.storeStoreFence();
/* 237 */           iIllIoiiIO.I00000oIO(iIiOiI0ilI00000oIO3, olilOlOiI, Iii11l.I00000oIO());
/* 242 */           IiI1lo0lOI iiI1lo0lOI = new IiI1lo0lOI(i2);
/* 245 */           iiI1lo0lOI.I00iiI = oll0I0l1i1;
/* 247 */           VarHandle.storeStoreFence();
/* 254 */           listenableFutureI0000oI00.addListener(iiI1lo0lOI, Iii11l.I00000oIO());
/* 257 */           Iii11l iii11lI00000oIO = Iii11l.I00000oIO();
/* 263 */           AtomicReference atomicReference4 = new AtomicReference(null);
/* 270 */           IIoIil iIoIil = new IIoIil(18);
/* 273 */           iIoIil.I00iiI = oll0I0l1i1;
/* 275 */           iIoIil.I00iiO = atomicReference4;
/* 277 */           VarHandle.storeStoreFence();
/* 280 */           IIiOiI0il iIiOiI0ilI00000oIO4 = iOiiloIII0O.I00000oIO(iIoIil);
/* 288 */           O1OIll00i o1OIll00i = new O1OIll00i(24);
/* 291 */           o1OIll00i.I00iiI = olio0OIill;
/* 293 */           VarHandle.storeStoreFence();
/* 296 */           iIllIoiiIO.I00000oIO(iIiOiI0ilI00000oIO4, o1OIll00i, iii11lI00000oIO);
/* 303 */           IIiOOI iIiOOI4 = (IIiOOI) atomicReference4.get();
/* 305 */           iIiOOI4.getClass();
/* 308 */           oll0I0l1i1.I000OOo1O = iIiOOI4;
/* 310 */           VarHandle.storeStoreFence();
                    try {
/* 313 */               OlioII olioII = this.I000l1;
/* 317 */               Olio0o olio0o = new Olio0o(i);
/* 320 */               olio0o.I00iiI = olioII;
/* 322 */               VarHandle.storeStoreFence();
/* 329 */               if (olioII.I000II(ioilI00, olio0o)) {
/* 333 */                   ListenableFuture listenableFutureI0000oI002 = iIllIoiiIO.I0000oI00(olioII.I0000oI00);
/* 341 */                   OOIl1i1 oOIl1i1 = new OOIl1i1(9);
/* 344 */                   oOIl1i1.I00iiI = ioilI00;
/* 346 */                   VarHandle.storeStoreFence();
/* 353 */                   listenableFutureI0000oI002.addListener(oOIl1i1, Iii11l.I00000oIO());
                        }
/* 359 */               this.I000iOII = oll0I0l1i1;
/* 361 */               I0001Ioi1lo();
/* 364 */               return oll0I0l1i1;
                    } catch (IiIO1IliI1Ol e) {
/* 900 */               throw new AssertionError("Surface is somehow already closed", e);
                    } catch (RuntimeException e2) {
/* 365 */               oll0I0l1i1.I0000Il00O();
/* 368 */               throw e2;
                    }
                }

                public final void I0000oI00() {
                    boolean z;
/* 1 */             lOllIO.I00000oIO();
/* 4 */             I00000oIO();
/* 7 */             OlioII olioII = this.I000l1;
/* 9 */             lOllIO.I00000oIO();
/* 14 */            if (olioII.I00100l0 == null) {
                        synchronized (olioII.I00000oIO) {
/* 19 */                    z = olioII.I0000Il00O;
                        }
/* 22 */                if (!z) {
/* 110 */                   return;
                        }
                    }
/* 29 */            this.I000OiO = false;
/* 33 */            this.I000l1.I00000oIO();
/* 47 */            this.I000l1 = new OlioII(this.I00000oIO, this.I000II.I00000oIO);
/* 51 */            Iterator it = this.I000lI.iterator();
/* 59 */            while (it.hasNext()) {
/* 67 */                ((Runnable) it.next()).run();
                    }
                }

                public final void I0001Ioi1lo() {
                    Oll01O011O oll01O011O;
                    Executor executor;
/* 1 */             lOllIO.I00000oIO();
/* 4 */             Rect rect = this.I0000O;
/* 6 */             int i = this.I000OOo1O;
/* 8 */             int i2 = this.I000O01llI0;
/* 10 */            boolean z = this.I0000Il00O;
/* 12 */            Matrix matrix = this.I00000oOI;
/* 14 */            boolean z2 = this.I0000oI00;
/* 18 */            I1lO00 i1lO00 = new I1lO00();
/* 21 */            i1lO00.I00000oIO = rect;
/* 23 */            i1lO00.I00000oOI = i;
/* 25 */            i1lO00.I0000Il00O = i2;
/* 27 */            i1lO00.I0000O = z;
/* 29 */            if (matrix == null) {
/* 101 */               IOOlIIilOl0.I000II("Null getSensorToBufferTransform");
/* 110 */               return;
                    }
/* 31 */            i1lO00.I0000oI00 = matrix;
/* 33 */            i1lO00.I0001Ioi1lo = z2;
/* 35 */            VarHandle.storeStoreFence();
/* 38 */            Oll0I0l1i1 oll0I0l1i1 = this.I000iOII;
/* 40 */            if (oll0I0l1i1 != null) {
                        synchronized (oll0I0l1i1.I00000oIO) {
/* 45 */                    oll0I0l1i1.I000l1 = i1lO00;
/* 47 */                    oll01O011O = oll0I0l1i1.I000lI;
/* 49 */                    executor = oll0I0l1i1.I000o00OoI0I;
                        }
/* 52 */                if (oll01O011O != null && executor != null) {
/* 59 */                    Oll001o0olO oll001o0olO = new Oll001o0olO(0);
/* 62 */                    oll001o0olO.I00iiI = oll01O011O;
/* 64 */                    oll001o0olO.I00iiO = i1lO00;
/* 66 */                    VarHandle.storeStoreFence();
/* 69 */                    executor.execute(oll001o0olO);
                        }
                    }
/* 78 */            Iterator it = this.I000oI1ioi.iterator();
/* 86 */            while (it.hasNext()) {
/* 94 */                ((IOo1llI) it.next()).accept(i1lO00);
                    }
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("SurfaceEdge{targets=");
/* 10 */            sb.append(this.I0001Ioi1lo);
/* 15 */            sb.append(", format=");
/* 20 */            sb.append(this.I00000oIO);
/* 25 */            sb.append(", resolution=");
/* 32 */            sb.append(this.I000II.I00000oIO);
/* 37 */            sb.append(", cropRect=");
/* 42 */            sb.append(this.I0000O);
/* 47 */            sb.append(", rotationDegrees=");
/* 52 */            sb.append(this.I000OOo1O);
/* 57 */            sb.append(", mirroring=");
/* 62 */            sb.append(this.I0000oI00);
/* 67 */            sb.append(", sensorToBufferTransform= ");
/* 70 */            Matrix matrix = this.I00000oOI;
/* 72 */            sb.append(matrix);
/* 77 */            sb.append(", rotationInTransform= ");
/* 84 */            sb.append(OoI0lIiO.I00000oOI(matrix));
/* 89 */            sb.append(", isMirrorInTransform= ");
/* 96 */            sb.append(OoI0lIiO.I0000oI00(matrix));
/* 101 */           sb.append(", isClosed=");
/* 106 */           sb.append(this.I000o00OoI0I);
/* 111 */           sb.append('}');
/* 114 */           return sb.toString();
                }
            }
