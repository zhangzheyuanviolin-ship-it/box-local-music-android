            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OIoIIOIioo implements I1oIloOoiO {
                public boolean I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;

                public void I00000oIO(IOlo10lO1iOl iOlo10lO1iOl) {
/* 15 */            i0Ol1Ool00 i0ol1ool00 = (i0Ol1Ool00) ((Io0iOoo) this.I00ilO0).I00l0OO0IO.get((I11Oil) this.I00iiO);
/* 17 */            if (i0ol1ool00 != null) {
/* 19 */                i0ol1ool00.I000o00OoI0I(iOlo10lO1iOl);
                    }
                }

                @Override
                public void I000O01llI0(IOlo10lO1iOl iOlo10lO1iOl) {
/* 4 */             illioiliioi illioiliioiVar = new illioiliioi(4);
/* 7 */             illioiliioiVar.I00iiI = iOlo10lO1iOl;
/* 9 */             illioiliioiVar.I00iiO = this;
/* 11 */            VarHandle.storeStoreFence();
/* 20 */            ((Io0iOoo) this.I00ilO0).I00lli11.post(illioiliioiVar);
                }
            }
