            package p000;

            import android.content.Context;
            import android.os.DeadObjectException;
            import android.os.Looper;
            import android.os.Message;
            import android.os.Parcel;
            import android.os.RemoteException;
            import android.util.Log;
            import android.util.SparseIntArray;
            import com.google.android.gms.common.api.Status;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedList;
            import java.util.Set;
            
            public final class i0Ol1Ool00 implements Io0iOIIio, Io0iOll {
                public LinkedList I000II;
                public Io0OoIoOo I000O01llI0;
                public I11Oil I000OOo1O;
                public OoIol00Ool I000OiO;
                public HashSet I000iOII;
                public HashMap I000l1;
                public int I000lI;
                public i0Oll0oI110 I000o00OoI0I;
                public boolean I000oI1ioi;
                public ArrayList I00100l0;
                public IOlo10lO1iOl I00100o1O0lo;
                public int I0010I0i;
                public Io0iOoo I0010o;

                public final void I00000oIO() {
/* 1 */             Io0OoIoOo io0OoIoOo = this.I000O01llI0;
/* 3 */             Io0iOoo io0iOoo = this.I0010o;
/* 7 */             lII0I0I000I.I0000Il00O(io0iOoo.I00lli11);
/* 11 */            this.I00100o1O0lo = null;
/* 15 */            I000l1(IOlo10lO1iOl.I00ilO0);
/* 20 */            if (this.I000oI1ioi) {
/* 22 */                O1oo1il01OoO o1oo1il01OoO = io0iOoo.I00lli11;
/* 24 */                I11Oil i11Oil = this.I000OOo1O;
/* 28 */                o1oo1il01OoO.removeMessages(11, i11Oil);
/* 33 */                o1oo1il01OoO.removeMessages(9, i11Oil);
/* 37 */                this.I000oI1ioi = false;
                    }
/* 45 */            Iterator it = this.I000l1.values().iterator();
/* 53 */            while (it.hasNext()) {
/* 61 */                I1ii1l10IO i1ii1l10IO = ((i0OliI1oo1) it.next()).I00000oIO;
/* 71 */                if (I000lI((IlIII1l[]) i1ii1l10IO.I0000Il00O) != null) {
/* 73 */                    it.remove();
                        } else {
                            try {
/* 79 */                        new o0IiOl();
/* 88 */                        l1Il1IliOI1l l1il1ilioi1l = (l1Il1IliOI1l) ((IOI0oloi01) i1ii1l10IO.I0000O).I00000oOI;
/* 90 */                        l1il1ilioi1l.getClass();
/* 100 */                       lIIl1lol0iOI liil1lol0ioi = (lIIl1lol0iOI) ((lIIo1l) io0OoIoOo).I000l1();
/* 112 */                       l1oiO1ol1 l1oio1ol1 = new l1oiO1ol1((lI1i1OI1O0l) l1il1ilioi1l.I00iOIl, (IOoi01o) l1il1ilioi1l.I00iiO);
/* 117 */                       String str = (String) l1il1ilioi1l.I00iiI;
/* 119 */                       Parcel parcelI00Iooi00oi = liil1lol0ioi.I00Iooi00oi();
/* 123 */                       parcelI00Iooi00oi.writeString(str);
/* 126 */                       iiIIoi1oIO1.I0000Il00O(parcelI00Iooi00oi, l1oio1ol1);
/* 131 */                       liil1lol0ioi.I00O0o1oo(28, parcelI00Iooi00oi);
                            } catch (DeadObjectException unused) {
/* 148 */                       I0000O(3);
/* 155 */                       io0OoIoOo.I0000O("DeadObjectException thrown while calling register listener method.");
                            } catch (RemoteException | RuntimeException e) {
/* 140 */                       Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
/* 143 */                       it.remove();
                            }
                        }
                    }
/* 158 */           I000II();
/* 161 */           I000iOII();
                }

                @Override
                public final void I00000oOI(IOlo10lO1iOl iOlo10lO1iOl) {
/* 2 */             I000oI1ioi(iOlo10lO1iOl, null);
                }

                public final void I0000Il00O(int i) {
/* 5 */             lII0I0I000I.I0000Il00O(this.I0010o.I00lli11);
/* 9 */             this.I00100o1O0lo = null;
/* 12 */            this.I000oI1ioi = true;
/* 18 */            String str = this.I000O01llI0.I00000oIO;
/* 20 */            OoIol00Ool ooIol00Ool = this.I000OiO;
/* 22 */            ooIol00Ool.getClass();
/* 29 */            StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
/* 32 */            if (i == 1) {
/* 36 */                sb.append(" due to service disconnection.");
                    } else if (i == 3) {
/* 45 */                sb.append(" due to dead object exception.");
                    }
/* 48 */            if (str != null) {
/* 52 */                sb.append(" Last reason for disconnect: ");
/* 55 */                sb.append(str);
                    }
/* 69 */            ooIol00Ool.I0010I0i(true, new Status(20, sb.toString(), null, null));
/* 72 */            I11Oil i11Oil = this.I000OOo1O;
/* 74 */            Io0iOoo io0iOoo = this.I0010o;
/* 76 */            O1oo1il01OoO o1oo1il01OoO = io0iOoo.I00lli11;
/* 86 */            o1oo1il01OoO.sendMessageDelayed(Message.obtain(o1oo1il01OoO, 9, i11Oil), 5000L);
/* 89 */            O1oo1il01OoO o1oo1il01OoO2 = io0iOoo.I00lli11;
/* 100 */           o1oo1il01OoO2.sendMessageDelayed(Message.obtain(o1oo1il01OoO2, 11, i11Oil), 120000L);
/* 107 */           SparseIntArray sparseIntArray = (SparseIntArray) io0iOoo.I00io1l.I00iiI;
                    synchronized (sparseIntArray) {
/* 110 */               sparseIntArray.clear();
                    }
/* 120 */           Iterator it = this.I000l1.values().iterator();
/* 128 */           while (it.hasNext()) {
/* 136 */               ((i0OliI1oo1) it.next()).getClass();
                    }
                }

                @Override
                public final void I0000O(int i) {
/* 3 */             O1oo1il01OoO o1oo1il01OoO = this.I0010o.I00lli11;
/* 13 */            if (Looper.myLooper() == o1oo1il01OoO.getLooper()) {
/* 15 */                I0000Il00O(i);
/* 18 */                return;
                    }
/* 22 */            IIiOiIiO01O iIiOiIiO01O = new IIiOiIiO01O(2);
/* 25 */            iIiOiIiO01O.I00iiI = i;
/* 27 */            iIiOiIiO01O.I00iiO = this;
/* 29 */            VarHandle.storeStoreFence();
/* 32 */            o1oo1il01OoO.post(iIiOiIiO01O);
                }

                @Override
                public final void I0000oI00() {
/* 3 */             O1oo1il01OoO o1oo1il01OoO = this.I0010o.I00lli11;
/* 13 */            if (Looper.myLooper() == o1oo1il01OoO.getLooper()) {
/* 15 */                I00000oIO();
/* 18 */                return;
                    }
/* 23 */            I0lil01 i0lil01 = new I0lil01(15);
/* 26 */            i0lil01.I00iiI = this;
/* 28 */            VarHandle.storeStoreFence();
/* 31 */            o1oo1il01OoO.post(i0lil01);
                }

                public final boolean I0001Ioi1lo(IOlo10lO1iOl iOlo10lO1iOl) {
                    synchronized (Io0iOoo.I00o101lO) {
                    }
/* 5 */             return false;
                }

                public final void I000II() {
/* 3 */             LinkedList linkedList = this.I000II;
/* 5 */             ArrayList arrayList = new ArrayList(linkedList);
/* 8 */             int size = arrayList.size();
/* 13 */            for (int i = 0; i < size; i++) {
/* 19 */                i0OlOlO i0ololo = (i0OlOlO) arrayList.get(i);
/* 29 */                if (!this.I000O01llI0.I00100l0()) {
/* 55 */                    return;
                        }
/* 36 */                if (I000O01llI0(i0ololo)) {
/* 38 */                    linkedList.remove(i0ololo);
                        }
                    }
                }

                public final boolean I000O01llI0(i0OlOlO i0ololo) {
/* 4 */             if (i0ololo == null) {
/* 6 */                 OoIol00Ool ooIol00Ool = this.I000OiO;
/* 8 */                 Io0OoIoOo io0OoIoOo = this.I000O01llI0;
/* 14 */                i0ololo.I0001Ioi1lo(ooIol00Ool, io0OoIoOo.I0010I0i());
                        try {
/* 17 */                    i0ololo.I000II(this);
/* 3 */                     return true;
                        } catch (DeadObjectException unused) {
/* 21 */                    I0000O(1);
/* 26 */                    io0OoIoOo.I0000O("DeadObjectException thrown while running ApiCallRunner.");
/* 3 */                     return true;
                        }
                    }
/* 34 */            IlIII1l ilIII1lI000lI = I000lI(i0ololo.I00000oIO(this));
/* 38 */            if (ilIII1lI000lI == null) {
/* 40 */                OoIol00Ool ooIol00Ool2 = this.I000OiO;
/* 42 */                Io0OoIoOo io0OoIoOo2 = this.I000O01llI0;
/* 48 */                i0ololo.I0001Ioi1lo(ooIol00Ool2, io0OoIoOo2.I0010I0i());
                        try {
/* 51 */                    i0ololo.I000II(this);
/* 3 */                     return true;
                        } catch (DeadObjectException unused2) {
/* 55 */                    I0000O(1);
/* 60 */                    io0OoIoOo2.I0000O("DeadObjectException thrown while running ApiCallRunner.");
/* 3 */                     return true;
                        }
                    }
/* 70 */            String name = this.I000O01llI0.getClass().getName();
/* 74 */            String str = ilIII1lI000lI.I00iOIl;
/* 76 */            long jI00000oOI = ilIII1lI000lI.I00000oOI();
/* 80 */            int length = name.length();
/* 110 */           StringBuilder sb = new StringBuilder(length + 53 + String.valueOf(str).length() + 2 + String.valueOf(jI00000oOI).length() + 2);
/* 117 */           IIl001iO0Io.I001lIiIIo1O(sb, name, " could not execute call because it requires feature (", str, ", ");
/* 120 */           sb.append(jI00000oOI);
/* 125 */           sb.append(").");
/* 134 */           Log.w("GoogleApiManager", sb.toString());
/* 137 */           Io0iOoo io0iOoo = this.I0010o;
/* 141 */           if (!io0iOoo.I00lll10 || !i0ololo.I00000oOI(this)) {
/* 316 */               i0ololo.I0000oI00(new OoiolI1Oll(ilIII1lI000lI));
/* 3 */                 return true;
                    }
/* 149 */           int iI0000Il00O = i0ololo.I0000Il00O(this);
/* 153 */           I11Oil i11Oil = this.I000OOo1O;
/* 157 */           i0Ol1iO1 i0ol1io1 = new i0Ol1iO1();
/* 160 */           i0ol1io1.I00000oIO = i11Oil;
/* 162 */           i0ol1io1.I00000oOI = ilIII1lI000lI;
/* 164 */           VarHandle.storeStoreFence();
/* 167 */           ArrayList arrayList = this.I00100l0;
/* 169 */           int iIndexOf = arrayList.indexOf(i0ol1io1);
/* 177 */           if (iIndexOf >= 0) {
/* 183 */               i0Ol1iO1 i0ol1io12 = (i0Ol1iO1) arrayList.get(iIndexOf);
/* 187 */               io0iOoo.I00lli11.removeMessages(15, i0ol1io12);
/* 198 */               io0iOoo.I00lli11.sendMessageDelayed(Message.obtain(io0iOoo.I00lli11, 15, i0ol1io12), 5000L);
/* 309 */               return false;
                    }
/* 202 */           arrayList.add(i0ol1io1);
/* 213 */           io0iOoo.I00lli11.sendMessageDelayed(Message.obtain(io0iOoo.I00lli11, 15, i0ol1io1), 5000L);
/* 229 */           io0iOoo.I00lli11.sendMessageDelayed(Message.obtain(io0iOoo.I00lli11, 16, i0ol1io1), 120000L);
/* 242 */           IOlo10lO1iOl iOlo10lO1iOl = new IOlo10lO1iOl(1, 2, null, null, Integer.valueOf(iI0000Il00O));
/* 245 */           I0001Ioi1lo(iOlo10lO1iOl);
/* 254 */           if (!io0iOoo.I0001Ioi1lo(iOlo10lO1iOl, this.I000lI)) {
/* 309 */               return false;
                    }
/* 256 */           String str2 = ilIII1lI000lI.I00iOIl;
/* 258 */           long jI00000oOI2 = ilIII1lI000lI.I00000oOI();
/* 283 */           StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 55 + String.valueOf(jI00000oOI2).length());
/* 288 */           sb2.append("Notification displayed for missing feature: ");
/* 291 */           sb2.append(str2);
/* 296 */           sb2.append(", version: ");
/* 299 */           sb2.append(jI00000oOI2);
/* 306 */           Log.w("GoogleApiManager", sb2.toString());
/* 309 */           return false;
                }

                public final void I000OOo1O(Status status, Exception exc, boolean z) {
/* 5 */             lII0I0I000I.I0000Il00O(this.I0010o.I00lli11);
/* 18 */            if ((status == null) == (exc == null)) {
/* 61 */                I000II.I000iOII("Status XOR exception should be null");
/* 98 */                return;
                    }
/* 22 */            Iterator it = this.I000II.iterator();
/* 30 */            while (it.hasNext()) {
/* 36 */                i0OlOlO i0ololo = (i0OlOlO) it.next();
/* 38 */                if (!z || i0ololo.I00000oIO == 2) {
/* 45 */                    if (status != null) {
/* 47 */                        i0ololo.I0000O(status);
                            } else {
/* 51 */                        i0ololo.I0000oI00(exc);
                            }
/* 54 */                    it.remove();
                        }
                    }
                }

                public final void I000OiO(Status status) {
/* 5 */             lII0I0I000I.I0000Il00O(this.I0010o.I00lli11);
/* 10 */            I000OOo1O(status, null, false);
                }

                public final void I000iOII() {
/* 1 */             I11Oil i11Oil = this.I000OOo1O;
/* 3 */             Io0iOoo io0iOoo = this.I0010o;
/* 5 */             O1oo1il01OoO o1oo1il01OoO = io0iOoo.I00lli11;
/* 9 */             o1oo1il01OoO.removeMessages(12, i11Oil);
/* 18 */            o1oo1il01OoO.sendMessageDelayed(o1oo1il01OoO.obtainMessage(12, i11Oil), io0iOoo.I00iOIl);
                }

                public final void I000l1(IOlo10lO1iOl iOlo10lO1iOl) {
/* 1 */             HashSet hashSet = this.I000iOII;
/* 3 */             Iterator it = hashSet.iterator();
/* 11 */            if (!it.hasNext()) {
/* 56 */                hashSet.clear();
/* 77 */                return;
                    }
/* 17 */            if (it.next() != null) {
/* 52 */                OIiilo1Ool0o.I00000oIO();
/* 55 */                return;
                    }
/* 25 */            if (l1ioii1I10Io.I00000oIO(iOlo10lO1iOl, IOlo10lO1iOl.I00ilO0)) {
/* 27 */                Io0OoIoOo io0OoIoOo = this.I000O01llI0;
/* 35 */                if (!io0OoIoOo.I00100l0() || io0OoIoOo.I00000oOI == null) {
/* 49 */                    throw new RuntimeException("Failed to connect when checking package");
                        }
                    }
/* 51 */            throw null;
                }

                public final IlIII1l I000lI(IlIII1l[] ilIII1lArr) {
/* 2 */             if (ilIII1lArr != null && ilIII1lArr.length != 0) {
/* 12 */                l1O1o0o10o l1o1o0o10o = this.I000O01llI0.I001i1O0Ol;
/* 18 */                IlIII1l[] ilIII1lArr2 = l1o1o0o10o == null ? null : l1o1o0o10o.I00iiI;
/* 21 */                if (ilIII1lArr2 == null) {
/* 23 */                    ilIII1lArr2 = new IlIII1l[0];
                        }
/* 28 */                I1Io0i0II i1Io0i0II = new I1Io0i0II(ilIII1lArr2.length);
/* 33 */                for (IlIII1l ilIII1l : ilIII1lArr2) {
/* 47 */                    i1Io0i0II.put(ilIII1l.I00iOIl, Long.valueOf(ilIII1l.I00000oOI()));
                        }
/* 54 */                for (IlIII1l ilIII1l2 : ilIII1lArr) {
/* 64 */                    Long l = (Long) i1Io0i0II.get(ilIII1l2.I00iOIl);
/* 66 */                    if (l == null || l.longValue() < ilIII1l2.I00000oOI()) {
/* 84 */                        return ilIII1l2;
                            }
                        }
                    }
/* 1 */             return null;
                }

                public final void I000o00OoI0I(IOlo10lO1iOl iOlo10lO1iOl) {
/* 5 */             lII0I0I000I.I0000Il00O(this.I0010o.I00lli11);
/* 8 */             Io0OoIoOo io0OoIoOo = this.I000O01llI0;
/* 14 */            String name = io0OoIoOo.getClass().getName();
/* 18 */            String strValueOf = String.valueOf(iOlo10lO1iOl);
/* 46 */            Io0OoIoOo io0OoIoOo2 = io0OoIoOo;
/* 48 */            io0OoIoOo2.I0000O(IIl001iO0Io.I00100o1O0lo(new StringBuilder(name.length() + 25 + strValueOf.length()), "onSignInFailed for ", name, " with ", strValueOf));
/* 52 */            I000oI1ioi(iOlo10lO1iOl, null);
                }

                public final void I000oI1ioi(IOlo10lO1iOl iOlo10lO1iOl, RuntimeException runtimeException) {
                    Ol0II1lI0I ol0II1lI0I;
/* 1 */             Io0iOoo io0iOoo = this.I0010o;
/* 5 */             lII0I0I000I.I0000Il00O(io0iOoo.I00lli11);
/* 8 */             i0Oll0oI110 i0oll0oi110 = this.I000o00OoI0I;
/* 10 */            if (i0oll0oi110 != null && (ol0II1lI0I = i0oll0oi110.I000lI) != null) {
/* 16 */                ol0II1lI0I.I0000Il00O();
                    }
/* 23 */            lII0I0I000I.I0000Il00O(this.I0010o.I00lli11);
/* 27 */            this.I00100o1O0lo = null;
/* 33 */            SparseIntArray sparseIntArray = (SparseIntArray) io0iOoo.I00io1l.I00iiI;
                    synchronized (sparseIntArray) {
/* 36 */                sparseIntArray.clear();
                    }
/* 40 */            I000l1(iOlo10lO1iOl);
/* 48 */            if ((this.I000O01llI0 instanceof i0i01O0O11O) && iOlo10lO1iOl.I00iiI != 24) {
/* 56 */                io0iOoo.I00iiI = true;
/* 58 */                O1oo1il01OoO o1oo1il01OoO = io0iOoo.I00lli11;
/* 69 */                o1oo1il01OoO.sendMessageDelayed(o1oo1il01OoO.obtainMessage(19), 300000L);
                    }
/* 72 */            int i = iOlo10lO1iOl.I00iiI;
/* 75 */            if (i == 4) {
/* 79 */                I000OiO(Io0iOoo.I00o0l1o1o0);
/* 82 */                return;
                    }
/* 85 */            if (i == 25) {
/* 93 */                I000OiO(Io0iOoo.I0000Il00O(this.I000OOo1O, iOlo10lO1iOl));
/* 96 */                return;
                    }
/* 97 */            LinkedList linkedList = this.I000II;
/* 103 */           if (linkedList.isEmpty()) {
/* 105 */               this.I00100o1O0lo = iOlo10lO1iOl;
/* 107 */               return;
                    }
/* 108 */           if (runtimeException != null) {
/* 112 */               lII0I0I000I.I0000Il00O(io0iOoo.I00lli11);
/* 116 */               I000OOo1O(null, runtimeException, false);
/* 119 */               return;
                    }
/* 120 */           boolean z = io0iOoo.I00lll10;
/* 122 */           I11Oil i11Oil = this.I000OOo1O;
/* 124 */           if (!z) {
/* 189 */               I000OiO(Io0iOoo.I0000Il00O(i11Oil, iOlo10lO1iOl));
/* 192 */               return;
                    }
/* 130 */           I000OOo1O(Io0iOoo.I0000Il00O(i11Oil, iOlo10lO1iOl), null, true);
/* 137 */           if (linkedList.isEmpty()) {
/* 184 */               return;
                    }
/* 140 */           I0001Ioi1lo(iOlo10lO1iOl);
/* 149 */           if (io0iOoo.I0001Ioi1lo(iOlo10lO1iOl, this.I000lI)) {
/* 184 */               return;
                    }
/* 155 */           if (iOlo10lO1iOl.I00iiI == 18) {
/* 157 */               this.I000oI1ioi = true;
                    }
/* 161 */           if (!this.I000oI1ioi) {
/* 181 */               I000OiO(Io0iOoo.I0000Il00O(i11Oil, iOlo10lO1iOl));
                    } else {
/* 163 */               O1oo1il01OoO o1oo1il01OoO2 = io0iOoo.I00lli11;
/* 173 */               o1oo1il01OoO2.sendMessageDelayed(Message.obtain(o1oo1il01OoO2, 9, i11Oil), 5000L);
                    }
                }

                public final void I00100l0(i0OlOlO i0ololo) {
/* 1 */             LinkedList linkedList = this.I000II;
/* 7 */             lII0I0I000I.I0000Il00O(this.I0010o.I00lli11);
/* 18 */            if (this.I000O01llI0.I00100l0()) {
/* 24 */                if (I000O01llI0(i0ololo)) {
/* 26 */                    I000iOII();
/* 29 */                    return;
                        } else {
/* 30 */                    linkedList.add(i0ololo);
/* 33 */                    return;
                        }
                    }
/* 34 */            linkedList.add(i0ololo);
/* 37 */            IOlo10lO1iOl iOlo10lO1iOl = this.I00100o1O0lo;
/* 39 */            if (iOlo10lO1iOl == null || iOlo10lO1iOl.I00iiI == 0 || iOlo10lO1iOl.I00iiO == null) {
/* 54 */                I0010I0i();
                    } else {
/* 50 */                I000oI1ioi(iOlo10lO1iOl, null);
                    }
                }

                public final void I00100o1O0lo() {
/* 3 */             O1oo1il01OoO o1oo1il01OoO = this.I0010o.I00lli11;
/* 5 */             lII0I0I000I.I0000Il00O(o1oo1il01OoO);
/* 8 */             Status status = Io0iOoo.I00o0iI0io1;
/* 10 */            I000OiO(status);
/* 16 */            this.I000OiO.I0010I0i(false, status);
/* 34 */            for (O10oo000lo o10oo000lo : (O10oo000lo[]) this.I000l1.keySet().toArray(new O10oo000lo[0])) {
/* 48 */                I00100l0(new i0OoOioOOio(o10oo000lo, new OloIlI0ll()));
                    }
/* 61 */            I000l1(new IOlo10lO1iOl(4, null, null));
/* 72 */            if (this.I000O01llI0.I00100l0()) {
/* 77 */                i0O1lIi1O0IO i0o1lii1o0io = new i0O1lIi1O0IO(1);
/* 80 */                i0o1lii1o0io.I00iiI = this;
/* 82 */                VarHandle.storeStoreFence();
/* 89 */                I0lil01 i0lil01 = new I0lil01(16);
/* 92 */                i0lil01.I00iiI = i0o1lii1o0io;
/* 94 */                VarHandle.storeStoreFence();
/* 97 */                o1oo1il01OoO.post(i0lil01);
                    }
                }

                public final void I0010I0i() {
/* 1 */             Io0iOoo io0iOoo = this.I0010o;
/* 5 */             lII0I0I000I.I0000Il00O(io0iOoo.I00lli11);
/* 12 */            Io0OoIoOo io0OoIoOo = this.I000O01llI0;
/* 21 */            if (io0OoIoOo.I00100l0()) {
/* 743 */               return;
                    }
/* 24 */            Io0OoIoOo io0OoIoOo2 = io0OoIoOo;
/* 30 */            if (io0OoIoOo2.I00100o1O0lo()) {
/* 743 */               return;
                    }
                    try {
/* 41 */                int iI0001Ioi1lo = io0iOoo.I00io1l.I0001Ioi1lo(io0iOoo.I00ilI0I1, io0OoIoOo);
/* 45 */                if (iI0001Ioi1lo != 0) {
/* 49 */                    IOlo10lO1iOl iOlo10lO1iOl = new IOlo10lO1iOl(iI0001Ioi1lo, null, null);
/* 58 */                    String name = io0OoIoOo.getClass().getName();
/* 62 */                    String string = iOlo10lO1iOl.toString();
/* 79 */                    StringBuilder sb = new StringBuilder(name.length() + 35 + string.length());
/* 82 */                    sb.append("The service for ");
/* 85 */                    sb.append(name);
/* 88 */                    sb.append(" is not available: ");
/* 91 */                    sb.append(string);
/* 98 */                    Log.w("GoogleApiManager", sb.toString());
/* 101 */                   I000oI1ioi(iOlo10lO1iOl, null);
/* 104 */                   return;
                        }
/* 108 */               I11Oil i11Oil = this.I000OOo1O;
/* 112 */               OIoIIOIioo oIoIIOIioo = new OIoIIOIioo();
/* 115 */               oIoIIOIioo.I00ilO0 = io0iOoo;
/* 117 */               oIoIIOIioo.I00iio = null;
/* 119 */               oIoIIOIioo.I00ilI0I1 = null;
/* 122 */               oIoIIOIioo.I00iOIl = false;
/* 124 */               oIoIIOIioo.I00iiI = io0OoIoOo;
/* 126 */               oIoIIOIioo.I00iiO = i11Oil;
/* 128 */               VarHandle.storeStoreFence();
/* 136 */               if (io0OoIoOo.I0010I0i()) {
/* 138 */                   i0Oll0oI110 i0oll0oi110 = this.I000o00OoI0I;
/* 140 */                   lII0I0I000I.I000II(i0oll0oi110);
/* 143 */                   Ol0II1lI0I ol0II1lI0I = i0oll0oi110.I000lI;
/* 145 */                   if (ol0II1lI0I != null) {
/* 147 */                       ol0II1lI0I.I0000Il00O();
                            }
/* 150 */                   I0Oi111ii i0Oi111ii = i0oll0oi110.I000l1;
/* 160 */                   i0Oi111ii.I00io1l = Integer.valueOf(System.identityHashCode(i0oll0oi110));
/* 162 */                   i0Oio1 i0oio1 = i0oll0oi110.I000OiO;
/* 164 */                   Context context = i0oll0oi110.I000O01llI0;
/* 166 */                   O1oo1il01OoO o1oo1il01OoO = i0oll0oi110.I000OOo1O;
/* 184 */                   i0oll0oi110.I000lI = (Ol0II1lI0I) i0oio1.I00000oIO(context, o1oo1il01OoO.getLooper(), i0Oi111ii, (Ol0III1O1) i0Oi111ii.I00ilO0, i0oll0oi110, i0oll0oi110);
/* 186 */                   i0oll0oi110.I000o00OoI0I = oIoIIOIioo;
/* 188 */                   Set set = i0oll0oi110.I000iOII;
/* 190 */                   if (set == null || set.isEmpty()) {
/* 224 */                       I0lil01 i0lil01 = new I0lil01(17);
/* 227 */                       i0lil01.I00iiI = i0oll0oi110;
/* 229 */                       VarHandle.storeStoreFence();
/* 232 */                       o1oo1il01OoO.post(i0lil01);
                            } else {
/* 199 */                       Ol0II1lI0I ol0II1lI0I2 = i0oll0oi110.I000lI;
/* 201 */                       ol0II1lI0I2.getClass();
/* 206 */                       iiOlilo0IIIl iiolilo0iiil = new iiOlilo0IIIl();
/* 209 */                       iiolilo0iiil.I00iOIl = ol0II1lI0I2;
/* 211 */                       VarHandle.storeStoreFence();
/* 214 */                       ol0II1lI0I2.I000OiO = iiolilo0iiil;
/* 216 */                       ol0II1lI0I2.I001i1O0Ol(2, null);
                            }
                        }
                        try {
/* 235 */                   io0OoIoOo2.I000OiO = oIoIIOIioo;
/* 237 */                   io0OoIoOo2.I001i1O0Ol(2, null);
                        } catch (SecurityException e) {
/* 247 */                   I000oI1ioi(new IOlo10lO1iOl(10, null, null), e);
                        }
                    } catch (IllegalStateException e2) {
/* 256 */               I000oI1ioi(new IOlo10lO1iOl(10, null, null), e2);
                    }
                }
            }
