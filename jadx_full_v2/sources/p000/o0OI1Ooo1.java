            package p000;

            import android.content.Context;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            public final class o0OI1Ooo1 implements o0O0l0li {
                public final ArrayList I00000oIO;

                public o0OI1Ooo1(Context context, o0IoIli0I o0ioili0i) {
/* 6 */             ArrayList arrayList = new ArrayList();
/* 9 */             this.I00000oIO = arrayList;
/* 11 */            o0ioili0i.getClass();
/* 16 */            o0i1O1l o0i1o1l = new o0i1O1l();
/* 19 */            o0i1o1l.I0000Il00O = o0ioili0i;
/* 21 */            IIOO01 iioo01 = IIOO01.I0000oI00;
/* 23 */            OoIOlo1001I.I00000oOI(context);
/* 30 */            OoIOil1iIO ooIOil1iIOI0000Il00O = OoIOlo1001I.I00000oIO().I0000Il00O(iioo01);
/* 46 */            if (IIOO01.I0000O.contains(Il0IIil.I00000oIO("json"))) {
/* 54 */                iOloOIOIII0 iolooioiii0 = new iOloOIOIII0(18);
/* 57 */                iolooioiii0.I00000oOI = ooIOil1iIOI0000Il00O;
/* 59 */                VarHandle.storeStoreFence();
/* 65 */                o0i1o1l.I00000oIO = new O0ioIo1O0lO(iolooioiii0);
                    }
/* 73 */            iOloOIOIII0 iolooioiii02 = new iOloOIOIII0(19);
/* 76 */            iolooioiii02.I00000oOI = ooIOil1iIOI0000Il00O;
/* 78 */            VarHandle.storeStoreFence();
/* 84 */            o0i1o1l.I00000oOI = new O0ioIo1O0lO(iolooioiii02);
/* 86 */            VarHandle.storeStoreFence();
/* 89 */            arrayList.add(o0i1o1l);
                }

                @Override
                public final void I00000oIO(o0IooioOOIl o0iooioooil) {
/* 3 */             Iterator it = this.I00000oIO.iterator();
/* 11 */            while (it.hasNext()) {
/* 19 */                ((o0O0l0li) it.next()).I00000oIO(o0iooioooil);
                    }
                }
            }
