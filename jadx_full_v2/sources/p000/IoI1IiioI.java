            package p000;
            
            public final class IoI1IiioI {
                public int I00000oIO;
                public float I00000oOI;
                public Object I0000Il00O;

                /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public float I00000oIO(int i, boolean z, boolean z2, boolean z3) {
                    boolean z4;
/* 3 */             Oo0iOioO oo0iOioO = (Oo0iOioO) this.I0000Il00O;
/* 5 */             int i2 = 1;
/* 7 */             if (z) {
/* 11 */                int iI00000oIO = l0o0I0iIlo.I00000oIO(oo0iOioO.I0001Ioi1lo, i, z);
/* 32 */                z4 = i == oo0iOioO.I0001Ioi1lo.getLineStart(iI00000oIO) || i == oo0iOioO.I0001Ioi1lo(iI00000oIO);
                    }
/* 33 */            int i3 = i * 4;
/* 35 */            if (!z3) {
/* 45 */                i2 = z4 ? 2 : 3;
                    } else if (z4) {
/* 39 */                i2 = 0;
                    }
/* 46 */            int i4 = i3 + i2;
/* 49 */            if (this.I00000oIO == i4) {
/* 51 */                return this.I00000oOI;
                    }
/* 61 */            float fI000OOo1O = z3 ? oo0iOioO.I000OOo1O(i, z) : oo0iOioO.I000OiO(i, z);
/* 65 */            if (z2) {
/* 67 */                this.I00000oIO = i4;
/* 69 */                this.I00000oOI = fI000OOo1O;
                    }
/* 204 */           return fI000OOo1O;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I00000oOI(float f, IOoilo iOoilo) throws Throwable {
                    OOoo10IO10 oOoo10IO10;
/* 3 */             if (iOoilo instanceof OOoo10IO10) {
/* 6 */                 oOoo10IO10 = (OOoo10IO10) iOoilo;
/* 8 */                 int i = oOoo10IO10.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oOoo10IO10.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oOoo10IO10 = new OOoo10IO10(this, iOoilo);
                        }
                    }
/* 25 */            Object objInvoke = oOoo10IO10.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = oOoo10IO10.I00iiO;
/* 32 */            if (i2 == 0) {
/* 47 */                lIoii1l01l0i.I00000oOI(objInvoke);
/* 52 */                I1oO0Ooo0o0i i1oO0Ooo0o0i = (I1oO0Ooo0o0i) this.I0000Il00O;
/* 56 */                Float f2 = new Float(f);
/* 59 */                oOoo10IO10.I00iiO = 1;
/* 61 */                objInvoke = i1oO0Ooo0o0i.invoke(f2, oOoo10IO10);
/* 65 */                if (objInvoke == ii0111o) {
/* 67 */                    return ii0111o;
                        }
                    } else {
/* 34 */                if (i2 != 1) {
/* 42 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 45 */                    return null;
                        }
/* 36 */                lIoii1l01l0i.I00000oOI(objInvoke);
                    }
                    this.I00000oOI += ((Number) objInvoke).floatValue();
/* 79 */            return OoiIlOl1iI.I00000oIO;
                }
            }
