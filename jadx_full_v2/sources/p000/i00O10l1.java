            package p000;

            import android.view.WindowInsets;
            import android.view.WindowInsetsAnimation;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.List;
            
            public final class i00O10l1 extends WindowInsetsAnimation.Callback {
                public IO0i1l1Io I00000oIO;
                public List I00000oOI;
                public ArrayList I0000Il00O;
                public HashMap I0000O;

                public final i00O10oO1ll I00000oIO(WindowInsetsAnimation windowInsetsAnimation) {
/* 1 */             HashMap map = this.I0000O;
/* 7 */             i00O10oO1ll i00o10oo1ll = (i00O10oO1ll) map.get(windowInsetsAnimation);
/* 9 */             if (i00o10oo1ll != null) {
/* 77 */                return i00o10oo1ll;
                    }
/* 13 */            i00O10oO1ll i00o10oo1ll2 = new i00O10oO1ll();
/* 22 */            new WindowInsetsAnimation(0, null, 0L);
/* 29 */            IIOOoll iIOOoll = new IIOOoll(29);
/* 32 */            iIOOoll.I00iiI = windowInsetsAnimation;
/* 34 */            VarHandle.storeStoreFence();
/* 37 */            i00o10oo1ll2.I00000oIO = iIOOoll;
/* 39 */            map.put(windowInsetsAnimation, i00o10oo1ll2);
/* 77 */            return i00o10oo1ll2;
                }

                @Override
                public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
/* 7 */             this.I00000oIO.I00000oOI(I00000oIO(windowInsetsAnimation));
/* 12 */            this.I0000O.remove(windowInsetsAnimation);
                }

                @Override
                public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
/* 7 */             this.I00000oIO.I0000Il00O(I00000oIO(windowInsetsAnimation));
                }

                @Override
                public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
/* 1 */             ArrayList arrayList = this.I0000Il00O;
/* 3 */             if (arrayList == null) {
/* 11 */                ArrayList arrayList2 = new ArrayList(list.size());
/* 14 */                this.I0000Il00O = arrayList2;
/* 20 */                this.I00000oOI = Collections.unmodifiableList(arrayList2);
                    } else {
/* 23 */                arrayList.clear();
                    }
/* 32 */            for (int size = list.size() - 1; size >= 0; size--) {
/* 38 */                WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
/* 40 */                i00O10oO1ll i00o10oo1llI00000oIO = I00000oIO(windowInsetsAnimation);
/* 54 */                ((WindowInsetsAnimation) i00o10oo1llI00000oIO.I00000oIO.I00iiI).setFraction(windowInsetsAnimation.getFraction());
/* 59 */                this.I0000Il00O.add(i00o10oo1llI00000oIO);
                    }
/* 78 */            return this.I00000oIO.I0000O(i00iooo00li.I0000Il00O(null, windowInsets), this.I00000oOI).I00000oOI();
                }

                @Override
                public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
/* 1 */             IO0i1l1Io iO0i1l1Io = this.I00000oIO;
/* 3 */             i00O10oO1ll i00o10oo1llI00000oIO = I00000oIO(windowInsetsAnimation);
/* 10 */            OoIOol ooIOol = new OoIOol(2);
/* 21 */            ooIOol.I00iiI = Ioo0l0I.I00000oOI(bounds.getLowerBound());
/* 31 */            ooIOol.I00iiO = Ioo0l0I.I00000oOI(bounds.getUpperBound());
/* 33 */            VarHandle.storeStoreFence();
/* 36 */            OoIOol ooIOolI0000oI00 = iO0i1l1Io.I0000oI00(i00o10oo1llI00000oIO, ooIOol);
/* 40 */            ooIOolI0000oI00.getClass();
/* 61 */            return new WindowInsetsAnimation.Bounds(((Ioo0l0I) ooIOolI0000oI00.I00iiI).I0000Il00O(), ((Ioo0l0I) ooIOolI0000oI00.I00iiO).I0000Il00O());
                }
            }
