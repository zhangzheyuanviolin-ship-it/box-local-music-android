            package p000;

            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            
            public final class i01l0IiO implements IOl1o0Io1o, O0oiIoI0 {
                public I0lio1O01i01 I00iOIl;
                public IOlIOiI0iiI1 I00iiI;
                public boolean I00iiO;
                public I01O1lIi I00iio;
                public IlliIl1l11O I00ilI0I1;

                public final void I00000oIO() {
/* 1 */             I0lio1O01i01 i0lio1O01i01 = this.I00iOIl;
/* 5 */             if (!this.I00iiO) {
/* 8 */                 this.I00iiO = true;
/* 18 */                i0lio1O01i01.getView().setTag(R.id.wrapped_composition_tag, null);
/* 21 */                I01O1lIi i01O1lIi = this.I00iio;
/* 23 */                if (i01O1lIi != null) {
/* 25 */                    i01O1lIi.I00ooIo0(this);
                        }
/* 28 */                this.I00iio = null;
/* 30 */                IiiOlo1l1 iiiOlo1l1 = i0lio1O01i01.I00io1l;
/* 32 */                if (iiiOlo1l1 != null) {
/* 36 */                    iiiOlo1l1.I00iiI.invoke();
                        }
/* 39 */                i0lio1O01i01.I00io1l = null;
                    }
/* 43 */            this.I00iiI.I00100l0();
                }

                public final void I00000oOI(IlliIl1l11O illiIl1l11O) {
/* 1 */             I0lio1O01i01 i0lio1O01i01 = this.I00iOIl;
/* 6 */             i01O0010i i01o0010i = new i01O0010i(4);
/* 9 */             i01o0010i.I00iiI = this;
/* 11 */            i01o0010i.I00iiO = illiIl1l11O;
/* 13 */            VarHandle.storeStoreFence();
/* 16 */            i0lio1O01i01.setOnReadyForComposition(i01o0010i);
                }

                @Override
                public final void I000II(O0oiOi o0oiOi, O0oOOiI0 o0oOOiI0) {
/* 3 */             if (o0oOOiI0 == O0oOOiI0.ON_DESTROY) {
/* 5 */                 I00000oIO();
                    } else {
/* 11 */                if (o0oOOiI0 != O0oOOiI0.ON_CREATE || this.I00iiO) {
/* 37 */                    return;
                        }
/* 19 */                I00000oOI(this.I00ilI0I1);
                    }
                }
            }
