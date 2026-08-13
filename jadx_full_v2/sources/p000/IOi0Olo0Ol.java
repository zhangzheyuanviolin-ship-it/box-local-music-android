            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.concurrent.Executor;
            
            public final class IOi0Olo0Ol implements Oi01Ooii1Ol {
                public final LinkedHashMap I00iOIl = new LinkedHashMap();
                public volatile Map I00iiI = Il011I1OiO0I.I00iOIl;

                public final void I00000oIO(Oi01Ooii1Ol oi01Ooii1Ol, Executor executor) {
/* 7 */             if (this.I00iiI.containsKey(oi01Ooii1Ol)) {
/* 106 */               throw new IllegalStateException((oi01Ooii1Ol + " was already registered!").toString());
                    }
                    synchronized (this.I00iOIl) {
/* 14 */                this.I00iOIl.put(oi01Ooii1Ol, executor);
/* 23 */                this.I00iiI = O1Oii0O0loo.I000iOII(this.I00iOIl);
                    }
                }

                public final void I00000oOI(Oi01Ooii1Ol oi01Ooii1Ol) {
                    synchronized (this.I00iOIl) {
/* 6 */                 this.I00iOIl.remove(oi01Ooii1Ol);
/* 15 */                this.I00iiI = O1Oii0O0loo.I000iOII(this.I00iOIl);
                    }
                }

                @Override
                public final void I0000Il00O(Oi0Iil oi0Iil, long j, int i, int i2) {
/* 15 */            for (Map.Entry entry : this.I00iiI.entrySet()) {
/* 27 */                Oi01Ooii1Ol oi01Ooii1Ol = (Oi01Ooii1Ol) entry.getKey();
/* 33 */                Executor executor = (Executor) entry.getValue();
/* 37 */                IOi0O00o0 iOi0O00o0 = new IOi0O00o0();
/* 40 */                iOi0O00o0.I00iOIl = oi01Ooii1Ol;
/* 42 */                iOi0O00o0.I00iiI = oi0Iil;
/* 44 */                iOi0O00o0.I00iiO = j;
/* 46 */                iOi0O00o0.I00iio = i;
/* 48 */                iOi0O00o0.I00ilI0I1 = i2;
/* 50 */                VarHandle.storeStoreFence();
/* 53 */                executor.execute(iOi0O00o0);
                    }
                }

                @Override
                public final void I000O01llI0(Oi0Iil oi0Iil) {
/* 15 */            for (Map.Entry entry : this.I00iiI.entrySet()) {
/* 27 */                Oi01Ooii1Ol oi01Ooii1Ol = (Oi01Ooii1Ol) entry.getKey();
/* 33 */                Executor executor = (Executor) entry.getValue();
/* 38 */                IOi00oO iOi00oO = new IOi00oO(1);
/* 41 */                iOi00oO.I00iiI = oi01Ooii1Ol;
/* 43 */                iOi00oO.I00iiO = oi0Iil;
/* 45 */                VarHandle.storeStoreFence();
/* 48 */                executor.execute(iOi00oO);
                    }
                }

                @Override
                public final void I000l1(Oi0Iil oi0Iil, long j) {
/* 15 */            for (Map.Entry entry : this.I00iiI.entrySet()) {
/* 27 */                Oi01Ooii1Ol oi01Ooii1Ol = (Oi01Ooii1Ol) entry.getKey();
/* 33 */                Executor executor = (Executor) entry.getValue();
/* 38 */                IIl1Ill1lo iIl1Ill1lo = new IIl1Ill1lo(1);
/* 41 */                iIl1Ill1lo.I00iiO = oi01Ooii1Ol;
/* 43 */                iIl1Ill1lo.I00iio = oi0Iil;
/* 45 */                iIl1Ill1lo.I00iiI = j;
/* 47 */                VarHandle.storeStoreFence();
/* 50 */                executor.execute(iIl1Ill1lo);
                    }
                }

                @Override
                public final void I00100l0(Oi0Iil oi0Iil) {
/* 15 */            for (Map.Entry entry : this.I00iiI.entrySet()) {
/* 27 */                Oi01Ooii1Ol oi01Ooii1Ol = (Oi01Ooii1Ol) entry.getKey();
/* 33 */                Executor executor = (Executor) entry.getValue();
/* 38 */                IOi00oO iOi00oO = new IOi00oO(0);
/* 41 */                iOi00oO.I00iiI = oi01Ooii1Ol;
/* 43 */                iOi00oO.I00iiO = oi0Iil;
/* 45 */                VarHandle.storeStoreFence();
/* 48 */                executor.execute(iOi00oO);
                    }
                }

                @Override
                public final void I001i1lo1io(Oi0Iil oi0Iil, long j, long j2) {
/* 15 */            for (Map.Entry entry : this.I00iiI.entrySet()) {
/* 27 */                Oi01Ooii1Ol oi01Ooii1Ol = (Oi01Ooii1Ol) entry.getKey();
/* 33 */                Executor executor = (Executor) entry.getValue();
/* 37 */                IOi0OIO iOi0OIO = new IOi0OIO();
/* 40 */                iOi0OIO.I00iOIl = oi01Ooii1Ol;
/* 42 */                iOi0OIO.I00iiI = oi0Iil;
/* 44 */                iOi0OIO.I00iiO = j;
/* 46 */                iOi0OIO.I00iio = j2;
/* 48 */                VarHandle.storeStoreFence();
/* 51 */                executor.execute(iOi0OIO);
                    }
                }

                @Override
                public final void I00IOO(Oi0Iil oi0Iil, long j, I0oIili1iI i0oIili1iI) {
/* 15 */            for (Map.Entry entry : this.I00iiI.entrySet()) {
/* 27 */                Oi01Ooii1Ol oi01Ooii1Ol = (Oi01Ooii1Ol) entry.getKey();
/* 33 */                Executor executor = (Executor) entry.getValue();
/* 38 */                IOOooilliOl iOOooilliOl = new IOOooilliOl(1);
/* 41 */                iOOooilliOl.I00iiI = oi01Ooii1Ol;
/* 43 */                iOOooilliOl.I00iiO = oi0Iil;
/* 45 */                iOOooilliOl.I00iio = j;
/* 47 */                iOOooilliOl.I00ilI0I1 = i0oIili1iI;
/* 49 */                VarHandle.storeStoreFence();
/* 52 */                executor.execute(iOOooilliOl);
                    }
                }

                @Override
                public final void I00IioO0OiOi(Oi0Iil oi0Iil) {
/* 15 */            for (Map.Entry entry : this.I00iiI.entrySet()) {
/* 27 */                Oi01Ooii1Ol oi01Ooii1Ol = (Oi01Ooii1Ol) entry.getKey();
/* 33 */                Executor executor = (Executor) entry.getValue();
/* 38 */                IOi00oO iOi00oO = new IOi00oO(2);
/* 41 */                iOi00oO.I00iiI = oi01Ooii1Ol;
/* 43 */                iOi00oO.I00iiO = oi0Iil;
/* 45 */                VarHandle.storeStoreFence();
/* 48 */                executor.execute(iOi00oO);
                    }
                }

                @Override
                public final void I00Io1lO(Oi0Iil oi0Iil, long j, I0oIl0101 i0oIl0101) {
/* 15 */            for (Map.Entry entry : this.I00iiI.entrySet()) {
/* 27 */                Oi01Ooii1Ol oi01Ooii1Ol = (Oi01Ooii1Ol) entry.getKey();
/* 33 */                Executor executor = (Executor) entry.getValue();
/* 38 */                IOi0Io0i iOi0Io0i = new IOi0Io0i(1);
/* 41 */                iOi0Io0i.I00iiI = oi01Ooii1Ol;
/* 43 */                iOi0Io0i.I00iiO = oi0Iil;
/* 45 */                iOi0Io0i.I00iio = j;
/* 47 */                iOi0Io0i.I00ilI0I1 = i0oIl0101;
/* 49 */                VarHandle.storeStoreFence();
/* 52 */                executor.execute(iOi0Io0i);
                    }
                }

                @Override
                public final void I00IoiI(Oi0Iil oi0Iil, long j, Oi0I000 oi0I000) {
/* 15 */            for (Map.Entry entry : this.I00iiI.entrySet()) {
/* 27 */                Oi01Ooii1Ol oi01Ooii1Ol = (Oi01Ooii1Ol) entry.getKey();
/* 33 */                Executor executor = (Executor) entry.getValue();
/* 38 */                IOi0Io0i iOi0Io0i = new IOi0Io0i(0);
/* 41 */                iOi0Io0i.I00iiI = oi01Ooii1Ol;
/* 43 */                iOi0Io0i.I00iiO = oi0Iil;
/* 45 */                iOi0Io0i.I00iio = j;
/* 47 */                iOi0Io0i.I00ilI0I1 = oi0I000;
/* 49 */                VarHandle.storeStoreFence();
/* 52 */                executor.execute(iOi0Io0i);
                    }
                }

                @Override
                public final void I00OIl(Oi0Iil oi0Iil, long j, I0oIili1iI i0oIili1iI) {
/* 15 */            for (Map.Entry entry : this.I00iiI.entrySet()) {
/* 27 */                Oi01Ooii1Ol oi01Ooii1Ol = (Oi01Ooii1Ol) entry.getKey();
/* 33 */                Executor executor = (Executor) entry.getValue();
/* 38 */                IOOooilliOl iOOooilliOl = new IOOooilliOl(0);
/* 41 */                iOOooilliOl.I00iiI = oi01Ooii1Ol;
/* 43 */                iOOooilliOl.I00iiO = oi0Iil;
/* 45 */                iOOooilliOl.I00iio = j;
/* 47 */                iOOooilliOl.I00ilI0I1 = i0oIili1iI;
/* 49 */                VarHandle.storeStoreFence();
/* 52 */                executor.execute(iOOooilliOl);
                    }
                }

                @Override
                public final void I00OOll1(Oi01iIoI oi01iIoI) {
/* 15 */            for (Map.Entry entry : this.I00iiI.entrySet()) {
/* 27 */                Oi01Ooii1Ol oi01Ooii1Ol = (Oi01Ooii1Ol) entry.getKey();
/* 33 */                Executor executor = (Executor) entry.getValue();
/* 39 */                I0iOo0oioiO i0iOo0oioiO = new I0iOo0oioiO(17);
/* 42 */                i0iOo0oioiO.I00iiI = oi01Ooii1Ol;
/* 44 */                i0iOo0oioiO.I00iiO = oi01iIoI;
/* 46 */                VarHandle.storeStoreFence();
/* 49 */                executor.execute(i0iOo0oioiO);
                    }
                }
            }
