            package p000;

            import android.widget.EdgeEffect;
            
            public final class I0o1iIoolIi {
                public IiIooOOOI I00000oIO;
                public long I00000oOI;
                public IioO1oi1li I0000Il00O;
                public OIooliIO0 I0000O;
                public boolean I0000oI00;
                public boolean I0001Ioi1lo;
                public long I000II;
                public long I000O01llI0;
                public OlOl100 I000OOo1O;

                public final void I00000oIO() {
                    boolean z;
/* 1 */             IioO1oi1li iioO1oi1li = this.I0000Il00O;
/* 3 */             EdgeEffect edgeEffect = iioO1oi1li.I0000O;
/* 5 */             boolean z2 = true;
/* 7 */             if (edgeEffect != null) {
/* 9 */                 edgeEffect.onRelease();
                        z = !edgeEffect.isFinished();
                    } else {
/* 18 */                z = false;
                    }
/* 19 */            EdgeEffect edgeEffect2 = iioO1oi1li.I0000oI00;
/* 21 */            if (edgeEffect2 != null) {
/* 23 */                edgeEffect2.onRelease();
/* 37 */                z = !edgeEffect2.isFinished() || z;
                    }
/* 38 */            EdgeEffect edgeEffect3 = iioO1oi1li.I0001Ioi1lo;
/* 40 */            if (edgeEffect3 != null) {
/* 42 */                edgeEffect3.onRelease();
/* 56 */                z = !edgeEffect3.isFinished() || z;
                    }
/* 57 */            EdgeEffect edgeEffect4 = iioO1oi1li.I000II;
/* 59 */            if (edgeEffect4 != null) {
/* 61 */                edgeEffect4.onRelease();
/* 68 */                if (edgeEffect4.isFinished() && !z) {
/* 73 */                    z2 = false;
                        }
/* 74 */                z = z2;
                    }
/* 75 */            if (z) {
/* 77 */                I0000O();
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oOI(long j, IlliIl1l11O illiIl1l11O, IOoilo iOoilo) {
                    I0o1IlIi i0o1IlIi;
                    long j2;
/* 7 */             IiIooOOOI iiIooOOOI = this.I00000oIO;
/* 9 */             IioO1oi1li iioO1oi1li = this.I0000Il00O;
/* 13 */            if (iOoilo instanceof I0o1IlIi) {
/* 16 */                i0o1IlIi = (I0o1IlIi) iOoilo;
/* 18 */                int i = i0o1IlIi.I00iio;
/* 24 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 27 */                    i0o1IlIi.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 32 */                    i0o1IlIi = new I0o1IlIi(this, iOoilo);
                        }
                    }
/* 35 */            Object obj = i0o1IlIi.I00iiI;
/* 37 */            Object obj2 = Ii0111o.I00iOIl;
/* 39 */            int i2 = i0o1IlIi.I00iio;
/* 41 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 46 */            if (i2 == 0) {
/* 70 */                lIoii1l01l0i.I00000oOI(obj);
/* 79 */                if (Ol0i1I.I0001Ioi1lo(this.I000II)) {
/* 81 */                    Object objI00000oIO = OooIOilolOo.I00000oIO(j);
/* 85 */                    i0o1IlIi.I00iio = 1;
/* 91 */                    if (illiIl1l11O.invoke(objI00000oIO, i0o1IlIi) != obj2) {
/* 95 */                        return ooiIlOl1iI;
                            }
                        } else {
/* 257 */                   long jI00000oIO = li1OoIii00.I00000oIO((!IioO1oi1li.I000II(iioO1oi1li.I0001Ioi1lo) || OooIOilolOo.I0000Il00O(j) >= 0.0f) ? (!IioO1oi1li.I000II(iioO1oi1li.I000II) || OooIOilolOo.I0000Il00O(j) <= 0.0f) ? 0.0f : -ilI0o1loOOOi.I00000oIO(iioO1oi1li.I0000O(), -OooIOilolOo.I0000Il00O(j), Float.intBitsToFloat((int) (this.I000II >> 32)), iiIooOOOI) : ilI0o1loOOOi.I00000oIO(iioO1oi1li.I0000Il00O(), OooIOilolOo.I0000Il00O(j), Float.intBitsToFloat((int) (this.I000II >> 32)), iiIooOOOI), (!IioO1oi1li.I000II(iioO1oi1li.I0000O) || OooIOilolOo.I0000O(j) >= 0.0f) ? (!IioO1oi1li.I000II(iioO1oi1li.I0000oI00) || OooIOilolOo.I0000O(j) <= 0.0f) ? 0.0f : -ilI0o1loOOOi.I00000oIO(iioO1oi1li.I00000oOI(), -OooIOilolOo.I0000O(j), Float.intBitsToFloat((int) (4294967295L & this.I000II)), iiIooOOOI) : ilI0o1loOOOi.I00000oIO(iioO1oi1li.I0000oI00(), OooIOilolOo.I0000O(j), Float.intBitsToFloat((int) (4294967295L & this.I000II)), iiIooOOOI));
/* 265 */                   if (jI00000oIO != 0) {
/* 270 */                       I0000O();
                            }
/* 274 */                   long jI0000oI00 = OooIOilolOo.I0000oI00(j, jI00000oIO);
/* 278 */                   Object objI00000oIO2 = OooIOilolOo.I00000oIO(jI0000oI00);
/* 282 */                   i0o1IlIi.I00iOIl = jI0000oI00;
/* 284 */                   i0o1IlIi.I00iio = 2;
/* 286 */                   Object objInvoke = illiIl1l11O.invoke(objI00000oIO2, i0o1IlIi);
/* 290 */                   if (objInvoke != obj2) {
/* 293 */                       j2 = jI0000oI00;
/* 294 */                       obj = objInvoke;
                            }
                        }
/* 292 */               return obj2;
                    }
/* 48 */            if (i2 == 1) {
/* 66 */                lIoii1l01l0i.I00000oOI(obj);
/* 69 */                return ooiIlOl1iI;
                    }
/* 50 */            if (i2 != 2) {
/* 61 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 64 */                return null;
                    }
/* 52 */            j2 = i0o1IlIi.I00iOIl;
/* 54 */            lIoii1l01l0i.I00000oOI(obj);
/* 299 */           long jI0000oI002 = OooIOilolOo.I0000oI00(j2, ((OooIOilolOo) obj).I00000oIO);
/* 304 */           this.I0001Ioi1lo = false;
/* 312 */           if (OooIOilolOo.I0000Il00O(jI0000oI002) > 0.0f) {
/* 326 */               iioO1oi1li.I0000Il00O().onAbsorb(O1OooO0IlOo.I000II(OooIOilolOo.I0000Il00O(jI0000oI002)));
                    } else if (OooIOilolOo.I0000Il00O(jI0000oI002) < 0.0f) {
/* 351 */               iioO1oi1li.I0000O().onAbsorb(-O1OooO0IlOo.I000II(OooIOilolOo.I0000Il00O(jI0000oI002)));
                    }
/* 360 */           if (OooIOilolOo.I0000O(jI0000oI002) > 0.0f) {
/* 374 */               iioO1oi1li.I0000oI00().onAbsorb(O1OooO0IlOo.I000II(OooIOilolOo.I0000O(jI0000oI002)));
                    } else if (OooIOilolOo.I0000O(jI0000oI002) < 0.0f) {
/* 399 */               iioO1oi1li.I00000oOI().onAbsorb(-O1OooO0IlOo.I000II(OooIOilolOo.I0000O(jI0000oI002)));
                    }
/* 402 */           I00000oIO();
/* 408 */           return ooiIlOl1iI;
                }

                public final long I0000Il00O() {
/* 1 */             long jI00000oIO = this.I00000oOI;
/* 16 */            if ((9223372034707292159L & jI00000oIO) == 9205357640488583168L) {
/* 21 */                jI00000oIO = lOIi0i0.I00000oIO(this.I000II);
                    }
/* 42 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (jI00000oIO >> 32)) / Float.intBitsToFloat((int) (this.I000II >> 32));
/* 62 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jI00000oIO & 4294967295L)) / Float.intBitsToFloat((int) (this.I000II & 4294967295L));
/* 76 */            return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                }

                public final void I0000O() {
/* 3 */             if (this.I0000oI00) {
/* 9 */                 this.I0000O.setValue(OoiIlOl1iI.I00000oIO);
                    }
                }

                public final boolean I0000oI00() {
                    float distance;
                    float distance2;
                    float distance3;
                    float distance4;
/* 1 */             IioO1oi1li iioO1oi1li = this.I0000Il00O;
/* 3 */             EdgeEffect edgeEffect = iioO1oi1li.I0000O;
/* 7 */             if (edgeEffect != null) {
                        try {
/* 9 */                     distance = edgeEffect.getDistance();
                        } catch (Throwable unused) {
/* 14 */                    distance = 0.0f;
                        }
/* 17 */                if (distance != 0.0f) {
/* 5 */                     return true;
                        }
                    }
/* 21 */            EdgeEffect edgeEffect2 = iioO1oi1li.I0000oI00;
/* 23 */            if (edgeEffect2 != null) {
                        try {
/* 25 */                    distance2 = edgeEffect2.getDistance();
                        } catch (Throwable unused2) {
/* 30 */                    distance2 = 0.0f;
                        }
/* 33 */                if (distance2 != 0.0f) {
/* 5 */                     return true;
                        }
                    }
/* 37 */            EdgeEffect edgeEffect3 = iioO1oi1li.I0001Ioi1lo;
/* 39 */            if (edgeEffect3 != null) {
                        try {
/* 41 */                    distance3 = edgeEffect3.getDistance();
                        } catch (Throwable unused3) {
/* 46 */                    distance3 = 0.0f;
                        }
/* 49 */                if (distance3 != 0.0f) {
/* 5 */                     return true;
                        }
                    }
/* 53 */            EdgeEffect edgeEffect4 = iioO1oi1li.I000II;
/* 55 */            if (edgeEffect4 == null) {
/* 69 */                return false;
                    }
                    try {
/* 57 */                distance4 = edgeEffect4.getDistance();
                    } catch (Throwable unused4) {
/* 62 */                distance4 = 0.0f;
                    }
                    return distance4 != 0.0f;
                }

                public final float I0001Ioi1lo(long j) {
                    float fOnPullDistance;
                    float distance;
/* 9 */             float fIntBitsToFloat = Float.intBitsToFloat((int) (I0000Il00O() >> 32));
/* 19 */            int i = (int) (j & 4294967295L);
/* 32 */            float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.I000II & 4294967295L));
/* 35 */            EdgeEffect edgeEffectI00000oOI = this.I0000Il00O.I00000oOI();
/* 39 */            float f = -fIntBitsToFloat2;
/* 42 */            float f2 = 1.0f - fIntBitsToFloat;
                    try {
/* 44 */                fOnPullDistance = edgeEffectI00000oOI.onPullDistance(f, f2);
                    } catch (Throwable unused) {
/* 49 */                edgeEffectI00000oOI.onPull(f, f2);
/* 52 */                fOnPullDistance = 0.0f;
                    }
/* 62 */            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (4294967295L & this.I000II)) * (-fOnPullDistance);
                    try {
/* 63 */                distance = edgeEffectI00000oOI.getDistance();
                    } catch (Throwable unused2) {
/* 68 */                distance = 0.0f;
                    }
                    return distance == 0.0f ? fIntBitsToFloat3 : Float.intBitsToFloat(i);
                }

                public final float I000II(long j) {
                    float fOnPullDistance;
                    float distance;
/* 12 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (I0000Il00O() & 4294967295L));
/* 19 */            int i = (int) (j >> 32);
/* 32 */            float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.I000II >> 32));
/* 35 */            EdgeEffect edgeEffectI0000Il00O = this.I0000Il00O.I0000Il00O();
/* 41 */            float f = 1.0f - fIntBitsToFloat;
                    try {
/* 43 */                fOnPullDistance = edgeEffectI0000Il00O.onPullDistance(fIntBitsToFloat2, f);
                    } catch (Throwable unused) {
/* 48 */                edgeEffectI0000Il00O.onPull(fIntBitsToFloat2, f);
/* 51 */                fOnPullDistance = 0.0f;
                    }
/* 60 */            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (this.I000II >> 32)) * fOnPullDistance;
                    try {
/* 61 */                distance = edgeEffectI0000Il00O.getDistance();
                    } catch (Throwable unused2) {
/* 66 */                distance = 0.0f;
                    }
                    return distance == 0.0f ? fIntBitsToFloat3 : Float.intBitsToFloat(i);
                }

                public final float I000O01llI0(long j) {
                    float fOnPullDistance;
                    float distance;
/* 12 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (I0000Il00O() & 4294967295L));
/* 19 */            int i = (int) (j >> 32);
/* 32 */            float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.I000II >> 32));
/* 35 */            EdgeEffect edgeEffectI0000O = this.I0000Il00O.I0000O();
/* 39 */            float f = -fIntBitsToFloat2;
                    try {
/* 41 */                fOnPullDistance = edgeEffectI0000O.onPullDistance(f, fIntBitsToFloat);
                    } catch (Throwable unused) {
/* 46 */                edgeEffectI0000O.onPull(f, fIntBitsToFloat);
/* 49 */                fOnPullDistance = 0.0f;
                    }
/* 60 */            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (this.I000II >> 32)) * (-fOnPullDistance);
                    try {
/* 61 */                distance = edgeEffectI0000O.getDistance();
                    } catch (Throwable unused2) {
/* 66 */                distance = 0.0f;
                    }
                    return distance == 0.0f ? fIntBitsToFloat3 : Float.intBitsToFloat(i);
                }

                public final float I000OOo1O(long j) {
                    float fOnPullDistance;
                    float distance;
/* 9 */             float fIntBitsToFloat = Float.intBitsToFloat((int) (I0000Il00O() >> 32));
/* 19 */            int i = (int) (j & 4294967295L);
/* 32 */            float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.I000II & 4294967295L));
/* 35 */            EdgeEffect edgeEffectI0000oI00 = this.I0000Il00O.I0000oI00();
                    try {
/* 40 */                fOnPullDistance = edgeEffectI0000oI00.onPullDistance(fIntBitsToFloat2, fIntBitsToFloat);
                    } catch (Throwable unused) {
/* 45 */                edgeEffectI0000oI00.onPull(fIntBitsToFloat2, fIntBitsToFloat);
/* 48 */                fOnPullDistance = 0.0f;
                    }
/* 58 */            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (this.I000II & 4294967295L)) * fOnPullDistance;
                    try {
/* 59 */                distance = edgeEffectI0000oI00.getDistance();
                    } catch (Throwable unused2) {
/* 64 */                distance = 0.0f;
                    }
                    return distance == 0.0f ? fIntBitsToFloat3 : Float.intBitsToFloat(i);
                }
            }
