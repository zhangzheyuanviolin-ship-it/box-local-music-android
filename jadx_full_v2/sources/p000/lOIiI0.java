            package p000;

            import android.app.Application;
            import android.os.Looper;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public final class lOIiI0 {
                public lI1i1OI1O0l I00000oIO;

                public static I00l0OO0IO I00000oOI(o0IiOl o0iiol) {
/* 3 */             lIOiOoo1i lioiooo1i = new lIOiOoo1i();
/* 6 */             lioiooo1i.I00ioIO = o0iiol;
/* 10 */            i1IoOl i1iool = new i1IoOl();
/* 13 */            i1iool.I00iOIl = lioiooo1i;
/* 15 */            VarHandle.storeStoreFence();
/* 18 */            Executor executor = Iii11Ooi.I00iOIl;
/* 20 */            o0iiol.I00000oOI(executor, i1iool);
/* 23 */            lOIII1ol1Ii loiii1ol1ii = lOIII1ol1Ii.I00000oOI;
/* 25 */            int i = I00ll1.I00ll1;
/* 31 */            I00l0OO0IO i00l0OO0IO = new I00l0OO0IO(lioiooo1i, I11OiOl.class, loiii1ol1ii);
/* 38 */            lioiooo1i.addListener(i00l0OO0IO, l1i0oIO0.I00000oOI(executor, i00l0OO0IO));
/* 77 */            return i00l0OO0IO;
                }

                public final I00l0OO0IO I00000oIO(ll1IoiliI ll1ioilii) {
                    String string;
/* 1 */             lI1i1OI1O0l li1i1oi1o0l = this.I00000oIO;
/* 5 */             String simpleName = lIIo1l.class.getSimpleName();
/* 9 */             Looper looper = li1i1oi1o0l.I000II;
/* 13 */            lII0I0I000I.I000O01llI0("Looper must not be null", looper);
/* 18 */            IOoi01o iOoi01o = new IOoi01o();
/* 24 */            Io1iO1Ooo0l io1iO1Ooo0l = new Io1iO1Ooo0l(1 == true ? 1 : 0);
/* 33 */            io1iO1Ooo0l.I00iiI = new O1oo1il01OoO(looper, 6);
/* 35 */            VarHandle.storeStoreFence();
/* 38 */            iOoi01o.I00000oIO = io1iO1Ooo0l;
/* 42 */            lII0I0I000I.I0000O(simpleName);
/* 45 */            O10oo000lo o10oo000lo = new O10oo000lo();
/* 48 */            o10oo000lo.I00000oIO = ll1ioilii;
/* 50 */            o10oo000lo.I00000oOI = simpleName;
/* 52 */            VarHandle.storeStoreFence();
/* 55 */            iOoi01o.I00000oOI = o10oo000lo;
/* 57 */            String processName = lIIiIil0.I00000oIO;
/* 59 */            if (processName == null) {
/* 61 */                processName = Application.getProcessName();
/* 65 */                lIIiIil0.I00000oIO = processName;
                    }
/* 67 */            if (processName == null) {
/* 69 */                string = "__PH_INTERNAL__NO_PROCESS__";
                    } else {
/* 76 */                int length = processName.length() + 1;
/* 77 */                int iIdentityHashCode = System.identityHashCode(lIIo1l.class);
/* 92 */                StringBuilder sb = new StringBuilder(length + String.valueOf(iIdentityHashCode).length());
/* 95 */                sb.append(processName);
/* 100 */               sb.append("|");
/* 103 */               sb.append(iIdentityHashCode);
/* 106 */               string = sb.toString();
                    }
/* 112 */           l1Il1IliOI1l l1il1ilioi1l = new l1Il1IliOI1l();
/* 115 */           l1il1ilioi1l.I00iOIl = li1i1oi1o0l;
/* 117 */           l1il1ilioi1l.I00iiI = string;
/* 119 */           l1il1ilioi1l.I00iiO = iOoi01o;
/* 121 */           VarHandle.storeStoreFence();
/* 124 */           lo1iloiI1 lo1iloii1 = lo1iloiI1.I00o0iI0io1;
/* 128 */           IOI0oloi01 iOI0oloi01 = new IOI0oloi01();
/* 131 */           iOI0oloi01.I0000O = iOoi01o;
/* 133 */           iOI0oloi01.I00000oOI = l1il1ilioi1l;
/* 135 */           iOI0oloi01.I0000Il00O = lo1iloii1;
/* 143 */           iOI0oloi01.I0000oI00 = new IlIII1l[]{iO1lI0Oi.I00000oOI};
/* 145 */           boolean z = false;
/* 146 */           iOI0oloi01.I00000oIO = false;
/* 159 */           lII0I0I000I.I00000oIO("Must set unregister function", ((lo1iloiI1) iOI0oloi01.I0000Il00O) != null);
/* 172 */           lII0I0I000I.I00000oIO("Must set holder", ((IOoi01o) iOI0oloi01.I0000O) != null);
/* 185 */           lII0I0I000I.I000O01llI0("Key must not be null", (O10oo000lo) ((IOoi01o) iOI0oloi01.I0000O).I00000oOI);
/* 192 */           IOoi01o iOoi01o2 = (IOoi01o) iOI0oloi01.I0000O;
/* 196 */           IlIII1l[] ilIII1lArr = (IlIII1l[]) iOI0oloi01.I0000oI00;
/* 198 */           boolean z2 = iOI0oloi01.I00000oIO;
/* 200 */           I1ii1l10IO i1ii1l10IO = new I1ii1l10IO();
/* 203 */           i1ii1l10IO.I0000O = iOI0oloi01;
/* 205 */           i1ii1l10IO.I00000oOI = iOoi01o2;
/* 207 */           i1ii1l10IO.I0000Il00O = ilIII1lArr;
/* 209 */           i1ii1l10IO.I00000oIO = z2;
/* 211 */           VarHandle.storeStoreFence();
/* 218 */           Oi0Oooi oi0Oooi = new Oi0Oooi(25, z);
/* 221 */           oi0Oooi.I00iiI = iOI0oloi01;
/* 223 */           VarHandle.storeStoreFence();
/* 232 */           lII0I0I000I.I000O01llI0("Listener has already been released.", (O10oo000lo) iOoi01o2.I00000oOI);
/* 235 */           Io0iOoo io0iOoo = li1i1oi1o0l.I000OiO;
/* 237 */           io0iOoo.getClass();
/* 242 */           OloIlI0ll oloIlI0ll = new OloIlI0ll();
/* 245 */           io0iOoo.I00000oOI(oloIlI0ll, 0, li1i1oi1o0l);
/* 252 */           i0OliI1oo1 i0olii1oo1 = new i0OliI1oo1();
/* 255 */           i0olii1oo1.I00000oIO = i1ii1l10IO;
/* 257 */           i0olii1oo1.I00000oOI = oi0Oooi;
/* 259 */           VarHandle.storeStoreFence();
/* 263 */           i0OoOioOOio i0oooioooio = new i0OoOioOOio(3, oloIlI0ll);
/* 266 */           i0oooioooio.I0000O = i0olii1oo1;
/* 268 */           VarHandle.storeStoreFence();
/* 279 */           i0Oli1olIilo i0oli1oliilo = new i0Oli1olIilo(i0oooioooio, io0iOoo.I00l0I0l0lO1.get(), li1i1oi1o0l);
/* 282 */           O1oo1il01OoO o1oo1il01OoO = io0iOoo.I00lli11;
/* 290 */           o1oo1il01OoO.sendMessage(o1oo1il01OoO.obtainMessage(8, i0oli1oliilo));
/* 295 */           return I00000oOI(oloIlI0ll.I00000oIO);
                }
            }
