package pojo;/*
包名:pojo
创建者:ZJ
日期:2019-10-16 20:46
*/

import javax.management.relation.Role;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


public class User implements Serializable{
         private Integer id; // 主键

         private String gender; // 性别
         private String username; // 用户名，唯一
         private String password; // 密码
         private String remark; // 备注
         private String station; // 状态
         private String telephone; // 联系电话
         private Set<Role> roles = new HashSet<Role>(0);//对应角色集合

         public Integer getId() {
             return id;
         }

         public void setId(Integer id) {
             this.id = id;
         }



         public String getGender() {
             return gender;
         }

         public void setGender(String gender) {
             this.gender = gender;
         }

         public String getUsername() {
             return username;
         }

         public void setUsername(String username) {
             this.username = username;
         }

         public String getPassword() {
             return password;
         }

         public void setPassword(String password) {
             this.password = password;
         }

         public String getRemark() {
             return remark;
         }

         public void setRemark(String remark) {
             this.remark = remark;
         }

         public String getStation() {
             return station;
         }

         public void setStation(String station) {
             this.station = station;
         }

         public String getTelephone() {
             return telephone;
         }

         public void setTelephone(String telephone) {
             this.telephone = telephone;
         }

         public Set<Role> getRoles() {
             return roles;
         }

         public void setRoles(Set<Role> roles) {
             this.roles = roles;
         }
     }


