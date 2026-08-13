            package p000;

            import android.media.Image;
            
            public final class Oioo0iIlil implements OIl1lIlo1Oi {
                public final OIl1lIlo1Oi I00iOIl;
                public final IOO000ilo I00iiI;
                public final I1Ool1IoO110 I00iiO = iOOOIOoiIlII.I00000oIO(false);

                public Oioo0iIlil(OIl1lIlo1Oi oIl1lIlo1Oi, IOO000ilo iOO000ilo) {
/* 4 */             this.I00iOIl = oIl1lIlo1Oi;
/* 6 */             this.I00iiI = iOO000ilo;
                }

                /* JADX WARN: Removed duplicated region for block: B:4:0x0009  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Oioo0iIlil I00000oIO() {
                    int i;
                    int i2;
                    Oioo0iIlil oioo0iIlil;
/* 8 */             if (this.I00iiO.I00000oOI()) {
/* 10 */                oioo0iIlil = null;
                    } else {
/* 12 */                IOO000ilo iOO000ilo = this.I00iiI;
/* 16 */                I1OollilIo i1OollilIo = (I1OollilIo) iOO000ilo.I00iiO;
/* 32 */                do {
/* 18 */                    i = i1OollilIo.I00000oIO;
/* 24 */                    i2 = i == 0 ? 0 : i + 1;
/* 32 */                } while (!I1OollilIo.I00000oOI.compareAndSet(i1OollilIo, i, i2));
/* 42 */                if ((i2 != 0 ? (OIl1lIlo1Oi) iOO000ilo.I00iiI : null) != null) {
/* 50 */                    oioo0iIlil = new Oioo0iIlil(this.I00iOIl, this.I00iiI);
                        }
                    }
/* 53 */            if (oioo0iIlil != null) {
/* 55 */                return oioo0iIlil;
                    }
/* 58 */            I000II.I001IO000("Required value was null.");
/* 7 */             return null;
                }

                @Override
                public final Object I00l0I0l0lO1(O0IOli0o0 o0IOli0o0) {
/* 7 */             if (this.I00iiO.I00000oOI()) {
/* 9 */                 return null;
                    }
/* 11 */            OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 23 */            if (o0IOli0o0.equals(oOoOl1001II.I00000oOI(Oioo0iIlil.class)) || o0IOli0o0.equals(oOoOl1001II.I00000oOI(OIl1lIlo1Oi.class)) || o0IOli0o0.equals(oOoOl1001II.I00000oOI(IoiiIliOIlli.class))) {
/* 51 */                return this;
                    }
/* 62 */            if (!o0IOli0o0.equals(oOoOl1001II.I00000oOI(Image.class))) {
/* 66 */                return this.I00iOIl.I00l0I0l0lO1(o0IOli0o0);
                    }
/* 168 */           throw new UnsupportedOperationException("Cannot unwrap " + this + " as android.media.Image. Use setFinalizerinstead and close all outstanding references.");
                }

                @Override
                public final void close() throws Exception {
/* 7 */             if (this.I00iiO.I00000oIO()) {
/* 9 */                 IOO000ilo iOO000ilo = this.I00iiI;
/* 21 */                if (I1OollilIo.I00000oOI.decrementAndGet((I1OollilIo) iOO000ilo.I00iiO) == 0) {
/* 40 */                    ((IOO1lioOO) I1OooIoiIO.I00000oOI.getAndSet((I1OooIoiIO) iOO000ilo.I00iio, null)).I00000oIO((OIl1lIlo1Oi) iOO000ilo.I00iiI);
                        }
                    }
                }

                public final String toString() {
/* 3 */             return this.I00iOIl.toString();
                }
            }
