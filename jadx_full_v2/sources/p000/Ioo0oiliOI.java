            package p000;

            import android.view.View;
            import android.view.WindowInsetsAnimation;
            import java.util.List;
            
/* 27 */    public final class Ioo0oiliOI extends IO0i1l1Io implements Runnable, OIOloIl1oo1, View.OnAttachStateChangeListener {
                public i00lIlOOll0 I00iiI;
                public boolean I00iiO;
                public boolean I00iio;
                public i00iooo00li I00ilI0I1;

                @Override
                public final void I00000oOI(i00O10oO1ll i00o10oo1ll) {
/* 1 */             i00lIlOOll0 i00lilooll0 = this.I00iiI;
/* 4 */             this.I00iiO = false;
/* 6 */             this.I00iio = false;
/* 8 */             i00iooo00li i00iooo00liVar = this.I00ilI0I1;
/* 24 */            if (((WindowInsetsAnimation) i00o10oo1ll.I00000oIO.I00iiI).getDurationMillis() > 0 && i00iooo00liVar != null) {
/* 28 */                i00i1I1 i00i1i1 = i00iooo00liVar.I00000oIO;
/* 42 */                i00lilooll0.I0010o.I0001Ioi1lo(liIIoi1I0i01.I00000oOI(i00i1i1.I000OOo1O(8)));
/* 55 */                i00lilooll0.I0010I0i.I0001Ioi1lo(liIIoi1I0i01.I00000oOI(i00i1i1.I000OOo1O(8)));
/* 58 */                i00lIlOOll0.I00000oOI(i00lilooll0, i00iooo00liVar);
                    }
/* 62 */            this.I00ilI0I1 = null;
                }

                @Override
                public final void I0000Il00O(i00O10oO1ll i00o10oo1ll) {
/* 2 */             this.I00iiO = true;
/* 4 */             this.I00iio = true;
                }

                @Override
                public final i00iooo00li I0000O(i00iooo00li i00iooo00liVar, List list) {
/* 1 */             i00lIlOOll0 i00lilooll0 = this.I00iiI;
/* 3 */             i00lIlOOll0.I00000oOI(i00lilooll0, i00iooo00liVar);
                    return i00lilooll0.I00111O ? i00iooo00li.I00000oOI : i00iooo00liVar;
                }

                @Override
                public final OoIOol I0000oI00(i00O10oO1ll i00o10oo1ll, OoIOol ooIOol) {
/* 2 */             this.I00iiO = false;
/* 37 */            return ooIOol;
                }

                @Override
                public final i00iooo00li I000OOo1O(View view, i00iooo00li i00iooo00liVar) {
/* 1 */             this.I00ilI0I1 = i00iooo00liVar;
/* 3 */             i00lIlOOll0 i00lilooll0 = this.I00iiI;
/* 5 */             OololIOo oololIOo = i00lilooll0.I0010I0i;
/* 7 */             i00i1I1 i00i1i1 = i00iooo00liVar.I00000oIO;
/* 19 */            oololIOo.I0001Ioi1lo(liIIoi1I0i01.I00000oOI(i00i1i1.I000OOo1O(8)));
/* 24 */            if (!this.I00iiO && !this.I00iio) {
/* 41 */                i00lilooll0.I0010o.I0001Ioi1lo(liIIoi1I0i01.I00000oOI(i00i1i1.I000OOo1O(8)));
/* 44 */                i00lIlOOll0.I00000oOI(i00lilooll0, i00iooo00liVar);
                    }
                    return i00lilooll0.I00111O ? i00iooo00li.I00000oOI : i00iooo00liVar;
                }

                @Override
                public final void onViewAttachedToWindow(View view) {
/* 1 */             view.requestApplyInsets();
                }

                @Override
                public final void run() {
/* 1 */             i00lIlOOll0 i00lilooll0 = this.I00iiI;
/* 5 */             if (this.I00iiO) {
/* 8 */                 this.I00iiO = false;
/* 10 */                this.I00iio = false;
/* 12 */                i00iooo00li i00iooo00liVar = this.I00ilI0I1;
/* 14 */                if (i00iooo00liVar != null) {
/* 30 */                    i00lilooll0.I0010o.I0001Ioi1lo(liIIoi1I0i01.I00000oOI(i00iooo00liVar.I00000oIO.I000OOo1O(8)));
/* 33 */                    i00lIlOOll0.I00000oOI(i00lilooll0, i00iooo00liVar);
/* 37 */                    this.I00ilI0I1 = null;
                        }
                    }
                }

                @Override
/* 28 */        public final void onViewDetachedFromWindow(View view) {
                }
            }
