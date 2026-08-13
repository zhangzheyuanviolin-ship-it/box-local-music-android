            package p000;

            import android.view.View;
            import android.view.WindowInsets;
            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            import kotlin.jvm.functions.Function1;
            
            public final class I101oll1o0 implements Function1 {
                public final int I00iOIl;
                public Oooio0iiI0 I00iiI;
                public O0iiOioolIi I00iiO;

                public I101oll1o0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
                    WindowInsets windowInsetsI00000oOI;
/* 1 */             int i = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 118 */                   Oooio0iiI0 oooio0iiI0 = this.I00iiI;
/* 124 */                   Iooooooil.I00000oIO(oooio0iiI0, this.I00iiO);
/* 131 */                   ((I0lio1O01i01) oooio0iiI0.I00iiO).I00oooO = true;
/* 133 */                   int[] iArr = oooio0iiI0.I00lll10;
/* 135 */                   int i2 = iArr[0];
/* 137 */                   int i3 = iArr[1];
/* 139 */                   View view = oooio0iiI0.I00iiI;
/* 141 */                   view.getLocationOnScreen(iArr);
/* 144 */                   long j = oooio0iiI0.I00o0iI0io1;
/* 146 */                   long jI000iOII = ((O0iOOo0Ii) obj).I000iOII();
/* 150 */                   oooio0iiI0.I00o0iI0io1 = jI000iOII;
/* 152 */                   i00iooo00li i00iooo00liVar = oooio0iiI0.I00o0l1o1o0;
/* 154 */                   if (i00iooo00liVar != null && ((i2 != iArr[0] || i3 != iArr[1] || !IooOl0ol01.I0000Il00O(j, jI000iOII)) && (windowInsetsI00000oOI = oooio0iiI0.I000iOII(i00iooo00liVar).I00000oOI()) != null)) {
/* 180 */                       view.dispatchApplyWindowInsets(windowInsetsI00000oOI);
                                break;
                            }
                            break;
                        case 1:
/* 20 */                    Oooio0iiI0 oooio0iiI02 = this.I00iiI;
/* 22 */                    View view2 = oooio0iiI02.I00iiI;
/* 24 */                    O0iiOioolIi o0iiOioolIi = this.I00iiO;
/* 26 */                    OIlO000O01 oIlO000O01 = (OIlO000O01) obj;
/* 35 */                    I0lio1O01i01 i0lio1O01i01 = oIlO000O01 instanceof I0lio1O01i01 ? (I0lio1O01i01) oIlO000O01 : null;
/* 36 */                    if (i0lio1O01i01 != null) {
/* 38 */                        I10OIIo i10OIIo = i0lio1O01i01.I010ioo;
/* 40 */                        if (i10OIIo == null) {
/* 48 */                            i10OIIo = new I10OIIo(i0lio1O01i01.getContext());
/* 51 */                            i10OIIo.setClipChildren(false);
/* 59 */                            i10OIIo.I00iOIl = new HashMap();
/* 66 */                            i10OIIo.I00iiI = new HashMap();
/* 68 */                            VarHandle.storeStoreFence();
/* 71 */                            i0lio1O01i01.I010ioo = i10OIIo;
/* 74 */                            i0lio1O01i01.addView(i10OIIo, -1);
/* 77 */                            i0lio1O01i01.requestLayout();
                                }
/* 84 */                        i10OIIo.getHolderToLayoutNode().put(oooio0iiI02, o0iiOioolIi);
/* 87 */                        i10OIIo.addView(oooio0iiI02);
/* 94 */                        i10OIIo.getLayoutNodeToHolder().put(o0iiOioolIi, oooio0iiI02);
/* 97 */                        oooio0iiI02.setImportantForAccessibility(1);
/* 105 */                       OooiOl0ioo0i.I00000oOI(oooio0iiI02, new I0liOoi1Olo(i0lio1O01i01, o0iiOioolIi, i0lio1O01i01, i10OIIo));
                            }
/* 112 */                   if (view2.getParent() != oooio0iiI02) {
/* 114 */                       oooio0iiI02.addView(view2);
                                break;
                            }
                            break;
                        default:
/* 16 */                    Iooooooil.I00000oIO(this.I00iiI, this.I00iiO);
                            break;
                    }
/* 19 */            return ooiIlOl1iI;
                }
            }
