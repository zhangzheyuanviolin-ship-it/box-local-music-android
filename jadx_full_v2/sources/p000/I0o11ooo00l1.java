            package p000;

            import android.view.DragEvent;
            import android.view.View;
            import java.lang.invoke.VarHandle;
            
            public final class I0o11ooo00l1 implements View.OnDragListener, Iil1o10i0 {
                public IilI0O I00000oIO;
                public I1Io1oIoo I00000oOI;
                public I0o10ll1O I0000Il00O;

                @Override
                public final boolean onDrag(View view, DragEvent dragEvent) {
/* 1 */             I1Io1oIoo i1Io1oIoo = this.I00000oOI;
/* 3 */             IilI0O iilI0O = this.I00000oIO;
/* 9 */             I0IIiO0iI i0IIiO0iI = new I0IIiO0iI(8);
/* 12 */            i0IIiO0iI.I00iiI = dragEvent;
/* 14 */            VarHandle.storeStoreFence();
/* 21 */            int i = 0;
                    switch (dragEvent.getAction()) {
                        case 1:
/* 72 */                    iilI0O.getClass();
/* 77 */                    OOo0l0ii10l oOo0l0ii10l = new OOo0l0ii10l();
/* 82 */                    Iil1oo1 iil1oo1 = new Iil1oo1(0);
/* 85 */                    iil1oo1.I00iiI = oOo0l0ii10l;
/* 87 */                    VarHandle.storeStoreFence();
/* 96 */                    if (iil1oo1.invoke(iilI0O) == OoIOloOIOI1l.I00iOIl) {
/* 99 */                        lOo1ii0o1.I0000oI00(iilI0O, iil1oo1);
                            }
/* 102 */                   boolean z = oOo0l0ii10l.I00iOIl;
/* 104 */                   i1Io1oIoo.getClass();
/* 109 */                   I1IlliII1i i1IlliII1i = new I1IlliII1i(i1Io1oIoo);
/* 116 */                   while (i1IlliII1i.hasNext()) {
/* 124 */                       ((IilI0O) i1IlliII1i.next()).I010oio1OO0();
                            }
                            break;
                        case 2:
/* 68 */                    iilI0O.I010o0o0oO(i0IIiO0iI);
                            break;
                        case 4:
/* 34 */                    iilI0O.getClass();
/* 39 */                    Iil1olo iil1olo = new Iil1olo(i);
/* 42 */                    iil1olo.I00iiI = i0IIiO0iI;
/* 44 */                    VarHandle.storeStoreFence();
/* 53 */                    if (iil1olo.invoke(iilI0O) == OoIOloOIOI1l.I00iOIl) {
/* 56 */                        lOo1ii0o1.I0000oI00(iilI0O, iil1olo);
                            }
/* 59 */                    i1Io1oIoo.clear();
                            break;
                        case 5:
/* 30 */                    iilI0O.I010l1ol111();
                            break;
                        case 6:
/* 26 */                    iilI0O.I010lI0oi();
                            break;
                    }
/* 21 */            return false;
                }
            }
