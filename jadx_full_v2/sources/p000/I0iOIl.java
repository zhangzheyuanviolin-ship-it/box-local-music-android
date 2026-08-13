            package p000;

            import android.content.Context;
            import com.google.ai.edge.gallery.customtasks.agentchat.AgentTools;
            import java.lang.invoke.VarHandle;
            
            public final class I0iOIl implements Ii0ioo10iO0 {
                public AgentTools I00000oIO;
                public OloIl1l1oOii I00000oOI;

                @Override
                public final void I00000oIO(Object obj, IloI0lOlll1 iloI0lOlll1, int i) {
                    IloI0lOlll1 iloI0lOlll12;
/* 4 */             iloI0lOlll1.I00i0O(-1631576636);
/* 11 */            int i2 = 2;
/* 29 */            int i3 = i | (iloI0lOlll1.I000OOo1O(obj) ? 4 : 2) | (iloI0lOlll1.I000OOo1O(this) ? 32 : 16);
/* 45 */            if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 19) != 18)) {
/* 48 */                Ii0l0ll1 ii0l0ll1 = (Ii0l0ll1) obj;
/* 62 */                iloI0lOlll12 = iloI0lOlll1;
/* 63 */                IO0O0o0O1Ol.I00000oIO(this.I00000oOI, ii0l0ll1.I00000oIO, ii0l0ll1.I00000oOI, this.I00000oIO, null, null, null, iloI0lOlll12, 0);
                    } else {
/* 67 */                iloI0lOlll12 = iloI0lOlll1;
/* 68 */                iloI0lOlll12.I00OilO00Il();
                    }
/* 71 */            OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 75 */            if (oOloioIlI001IO000 != null) {
/* 79 */                I0Il0I1o i0Il0I1o = new I0Il0I1o(i2);
/* 82 */                i0Il0I1o.I00iiO = this;
/* 84 */                i0Il0I1o.I00iiI = obj;
/* 86 */                VarHandle.storeStoreFence();
/* 89 */                oOloioIlI001IO000.I0000O = i0Il0I1o;
                    }
                }

                @Override
                public final OloIl1l1oOii I00000oOI() {
/* 1 */             return this.I00000oOI;
                }

                @Override
                public final void I0000Il00O(Context context, IOO11li1OoII iOO11li1OoII, O1oIOiI11o0 o1oIOiI11o0, I0IO1io0I i0IO1io0I) {
                    Object value;
/* 3 */             Ol0o1OiOIIIl skillManagerViewModel = this.I00000oIO.getSkillManagerViewModel();
/* 10 */            I0IoOl i0IoOl = new I0IoOl(2);
/* 15 */            i0IoOl.I00iio = iOO11li1OoII;
/* 17 */            i0IoOl.I00iiI = this;
/* 19 */            i0IoOl.I00ilI0I1 = context;
/* 23 */            i0IoOl.I00ilO0 = o1oIOiI11o0;
/* 27 */            i0IoOl.I00iiO = i0IO1io0I;
/* 29 */            VarHandle.storeStoreFence();
/* 34 */            if (skillManagerViewModel.I0001Ioi1lo) {
/* 85 */                i0IoOl.invoke();
/* 204 */               return;
                    }
/* 36 */            OlO0OIIl1 olO0OIIl1 = skillManagerViewModel.I0000O;
/* 63 */            do {
/* 38 */                value = olO0OIIl1.getValue();
/* 63 */            } while (!olO0OIIl1.I000iOII(value, Ol0loOOoo.I00000oIO((Ol0loOOoo) value, true, null, false, null, null, false, null, null, 254)));
/* 65 */            IOO11li1OoII iOO11li1OoIII00000oIO = OooiooIOO.I00000oIO(skillManagerViewModel);
/* 69 */            IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 81 */            iOi1II01i0.I0000O(iOO11li1OoIII00000oIO, Ii1oo1ooill0.I00iiI, null, new O1iIlllIoo(skillManagerViewModel, i0IoOl, null, 29), 2);
                }

                @Override
                public final void I0000O(IOO11li1OoII iOO11li1OoII, O1oIOiI11o0 o1oIOiI11o0, O1oiilO o1oiilO) {
/* 3 */             O111ooi11li.I00000oIO.I00000oIO(o1oIOiI11o0, o1oiilO);
                }
            }
