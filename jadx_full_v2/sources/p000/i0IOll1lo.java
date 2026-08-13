            package p000;

            import android.os.Bundle;
            import com.google.android.play.core.assetpacks.bs;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
            public final class i0IOll1lo extends i0IIo11i {
                public final int I000OiO;
                public final i0Ii1l I000iOII;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i0IOll1lo(i0Ii1l i0ii1l, OloIlI0ll oloIlI0ll, int i) {
/* 5 */             super(i0ii1l, oloIlI0ll);
/* 1 */             this.I000OiO = i;
/* 3 */             this.I000iOII = i0ii1l;
                }

                @Override
                public void I00O0i0ii(Bundle bundle) {
                    switch (this.I000OiO) {
                        case 1:
/* 12 */                    i0Oii0oo1i i0oii0oo1i = this.I000iOII.I0000oI00;
/* 14 */                    OloIlI0ll oloIlI0ll = this.I000O01llI0;
/* 16 */                    i0oii0oo1i.I0000O(oloIlI0ll);
/* 21 */                    int i = bundle.getInt("error_code");
/* 37 */                    i0Ii1l.I000II.I00000oOI("onError(%d)", Integer.valueOf(i));
/* 45 */                    oloIlI0ll.I0000Il00O(new I1O10lli(i));
                            break;
                        default:
/* 6 */                     super.I00O0i0ii(bundle);
                            break;
                    }
                }

                @Override
                public void I00O10llo(List list) {
                    switch (this.I000OiO) {
                        case 0:
/* 10 */                    super.I00O10llo(list);
/* 15 */                    ArrayList arrayList = new ArrayList();
/* 18 */                    Iterator it = list.iterator();
/* 26 */                    while (it.hasNext()) {
/* 32 */                        Bundle bundle = (Bundle) it.next();
/* 34 */                        i0Ii1l i0ii1l = this.I000iOII;
/* 58 */                        bs bsVar = (bs) i0Ilo11Ii.I00000oIO(bundle, i0ii1l.I00000oOI, i0ii1l.I0000Il00O).I00000oOI.values().iterator().next();
/* 60 */                        if (bsVar == null) {
/* 69 */                            i0Ii1l.I000II.I00000oOI("onGetSessionStates: Bundle contained no pack.", new Object[0]);
                                }
/* 72 */                        int i = bsVar.I00000oOI;
/* 75 */                        if (i == 1 || i == 7 || i == 2 || i == 9 || i == 3) {
/* 94 */                            arrayList.add(bsVar.I00000oIO);
                                }
                            }
/* 100 */                   this.I000O01llI0.I0000O(arrayList);
                            break;
                        default:
/* 6 */                     super.I00O10llo(list);
                            break;
                    }
                }

                @Override
                public void I00OI1(Bundle bundle, Bundle bundle2) {
                    switch (this.I000OiO) {
                        case 1:
/* 10 */                    super.I00OI1(bundle, bundle2);
/* 13 */                    i0Ii1l i0ii1l = this.I000iOII;
/* 23 */                    if (!i0ii1l.I0001Ioi1lo.compareAndSet(true, false)) {
/* 31 */                        i0Ii1l.I000II.I0000oI00("Expected keepingAlive to be true, but was false.", new Object[0]);
                            }
/* 40 */                    if (bundle.getBoolean("keep_alive")) {
/* 42 */                        i0ii1l.mo17f();
                                break;
                            }
                            break;
                        default:
/* 6 */                     super.I00OI1(bundle, bundle2);
                            break;
                    }
                }
            }
