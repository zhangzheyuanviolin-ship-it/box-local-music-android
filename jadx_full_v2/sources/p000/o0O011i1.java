            package p000;

            import android.content.Context;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            public final class o0O011i1 implements o0Illo {
                public final ArrayList I00000oIO;

                public o0O011i1(Context context, o0IiIio1Ii1i o0iiiio1ii1i) {
/* 6 */             ArrayList arrayList = new ArrayList();
/* 9 */             this.I00000oIO = arrayList;
/* 11 */            o0iiiio1ii1i.getClass();
/* 16 */            o0OllIi0OlIi o0ollii0olii = new o0OllIi0OlIi();
/* 19 */            o0ollii0olii.I0000Il00O = o0iiiio1ii1i;
/* 21 */            IIOO01 iioo01 = IIOO01.I0000oI00;
/* 23 */            OoIOlo1001I.I00000oOI(context);
/* 30 */            OoIOil1iIO ooIOil1iIOI0000Il00O = OoIOlo1001I.I00000oIO().I0000Il00O(iioo01);
/* 46 */            if (IIOO01.I0000O.contains(Il0IIil.I00000oIO("json"))) {
/* 54 */                iOloOIOIII0 iolooioiii0 = new iOloOIOIII0(16);
/* 57 */                iolooioiii0.I00000oOI = ooIOil1iIOI0000Il00O;
/* 59 */                VarHandle.storeStoreFence();
/* 65 */                o0ollii0olii.I00000oIO = new O0ioIo1O0lO(iolooioiii0);
                    }
/* 73 */            iOloOIOIII0 iolooioiii02 = new iOloOIOIII0(17);
/* 76 */            iolooioiii02.I00000oOI = ooIOil1iIOI0000Il00O;
/* 78 */            VarHandle.storeStoreFence();
/* 84 */            o0ollii0olii.I00000oOI = new O0ioIo1O0lO(iolooioiii02);
/* 86 */            VarHandle.storeStoreFence();
/* 89 */            arrayList.add(o0ollii0olii);
                }

                @Override
                public final void I00000oIO(o0IlO11iI0 o0ilo11ii0) {
/* 3 */             Iterator it = this.I00000oIO.iterator();
/* 11 */            while (it.hasNext()) {
/* 19 */                ((o0Illo) it.next()).I00000oIO(o0ilo11ii0);
                    }
                }
            }
